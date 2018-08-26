package com.techprudent.springbootcaching.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="customers")
public class Customer {

	@Id
	@GeneratedValue
	private long id;

	private String name;
	private String gender;
	private String contact;
	
	
}
