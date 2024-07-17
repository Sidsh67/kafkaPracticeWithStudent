package com.registry.service;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.registry.pojo.Student;

@Service
public class KafkaProducer {

	
	KafkaTemplate<String, Object> template;
	
	public KafkaProducer(KafkaTemplate<String, Object> template) {
	this.template=template;
	}
	
	
	public void sendMessage(Student message) {
		
		template.send("student1",message);
	}
}
