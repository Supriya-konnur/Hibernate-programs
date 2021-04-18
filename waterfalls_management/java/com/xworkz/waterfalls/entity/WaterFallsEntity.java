package com.xworkz.waterfalls.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="waterfalls")
public class WaterFallsEntity {
	
	@Id
	@Column(name="ID")
	@GenericGenerator(name="BUS",strategy="increment")
	@GeneratedValue(generator="BUS") 
	private int id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "WIDTH")
	private int width;
	
	@Column(name = "LOCATION")
	private String locatioon;
	
	@Column(name = "HEIGTH")
	private int height;
	
	@Column(name = "DEPTH")
	private int depth;
	
	@Column(name = "ELECTRICITY_GENERATED")
	private String electricityGenerator;
	
	@Column(name = "SOURCE_RIVER")
	private String sourceRiver;
	
	@Column(name = "ENTRY_FEES")
	private int entryFees;
	
	@Column(name = "DESTINATION")
	private String destination;
	
	@Column(name = "RATING")
	private int rating;
	
	@Column(name = "NO_OF_DEATH")
	private int noOfDeath;
	
	@Column(name = "NO_OF_VISOTORS")
	private int noOfVisitor;
	
}
