package com.registry.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.registry.pojo.Student;

@Service
public class KafkaConsumer {

	private static final Logger logger=LoggerFactory.getLogger(KafkaConsumer.class);
	@Autowired
	private StudentService service;
	
	@KafkaListener(topics = "student1", groupId = "studentGroup")
	public void message(Student message) {
		System.out.println("Consumed data from producer ========= "+message);
		
		service.save(message);
		logger.info(String.format("message recieve -> %s",message));
	}
}
