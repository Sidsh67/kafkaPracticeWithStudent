package com.registry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.registry.pojo.Student;
import com.registry.service.KafkaProducer;

@RestController
@RequestMapping("/kafka")
public class MessageController {

	
	private KafkaProducer producer;

	public MessageController(KafkaProducer producer) {
		
		this.producer = producer;
	}
	
	@GetMapping("/publish")
	public ResponseEntity<String> publish(@RequestBody Student message){
		producer.sendMessage(message);
		return ResponseEntity.ok("sent message");
	}
	
}
