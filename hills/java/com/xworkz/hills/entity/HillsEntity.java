package com.xworkz.hills.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name="hills")
public class HillsEntity {
	@Id
	@GenericGenerator(name="car", strategy = "increment")
	@GeneratedValue(generator="car")
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LOCATION")
	private String location;
	
	@Column(name="HEIGHT")
	private int height;
	
	@Column(name="RATING")
	private int rating;

	public HillsEntity(String name, String location, int height, int rating) {
		super();
		this.name = name;
		this.location = location;
		this.height = height;
		this.rating = rating;
	}

	
	
}

