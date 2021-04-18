package com.xworkz.waterfalls.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Data
@Entity
@Table(name="state")
public class StateEntity {
	
	@Id
	@GenericGenerator(name="auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="LANGUAGE")
	private String language;
	
	@Column(name="NO_OF_DISTRICT")
	private int noOfDistrict;
	
	@Column(name="POPULATION")
	private int population;

	public StateEntity(String name, String language, int noOfDistrict, int population) {
		super();
		this.name = name;
		this.language = language;
		this.noOfDistrict = noOfDistrict;
		this.population = population;
	}
	
	
}
