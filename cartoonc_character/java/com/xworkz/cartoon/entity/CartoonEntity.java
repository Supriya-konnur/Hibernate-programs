package com.xworkz.cartoon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="cartoon")

public class CartoonEntity {
	
	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="CHANNEL_NAME")
	private ChannelName channelName;
	
	public enum ChannelName{
		NICK,POGO,DISNY;
	}
	@Column(name="SHOW_NAME")
	private String showName;
	@Column(name="LANGUAGE")
	private String language;
	public CartoonEntity(String name, ChannelName channelName, String showName, String language) {
		super();
		this.name = name;
		this.channelName = channelName;
		this.showName = showName;
		this.language = language;
	}
	

}
