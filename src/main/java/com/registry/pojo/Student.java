package com.registry.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Student {

	@Id
	private int id;
	private String name;
	private String className;
	private String emailId;
	
	
}
