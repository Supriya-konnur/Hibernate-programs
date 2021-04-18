package com.xworkz.contestants.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@NoArgsConstructor
@Entity
@Table(name="bigbossdb")


public class ContestantEntity {
	
	
		@Id
		@GenericGenerator(name="auto",strategy="increment")
		@GeneratedValue(generator="auto")
		@Column(name = "ID")
		private int id;

		@Column(name = "NAME")
		private String name;

		@Column(name = "GENDER")
		private String gender;
		
		@Column(name = "CONTESTANT_TYPE")
		private String contestantType;

		@Column(name = "NO_OF_TASKS")
		private int noOfTasks;

		@Column(name = "DAYS_IN")
		private int daysIn;

		@Column(name = "SEASON_NO")
		private int seasonNo;

		

	}


