package com.xworkz.icecream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

@Entity
@Table(name = "icecrem")
@NamedQueries({ @NamedQuery(name = "getAll", query = "select icecream from IceCreamEntity icecream"),
		@NamedQuery(name = "updatePriceByName", query = "update IceCreamEntity icecream set icecream.price=:pr where icecream.name=:nm"),
		@NamedQuery(name = "findByNameAndPrice", query = "select icecream from IceCreamEntity icecream where icecream.name=:nm and icecream.price=:pr"),
		@NamedQuery(name = "getByMaxPrice", query = "SELECT icecream FROM IceCreamEntity icecream where icecream.price =(SELECT max(icecream.price) FROM IceCreamEntity icecream)"),
		@NamedQuery(name = "getMinPrice", query = "SELECT icecream FROM IceCreamEntity icecream where icecream.price =(SELECT min(icecream.price) FROM IceCreamEntity icecream)"),
		@NamedQuery(name = "getBySumPrice", query = "SELECT sum(icecream.price) FROM IceCreamEntity icecream"),
		@NamedQuery(name = "getPriceByName", query = "select ice.price from IceCreamEntity ice where ice.name=:nm"),
		@NamedQuery(name = "getNameAndFlavourByPrice", query = "select ice.name,ice.flavour from IceCreamEntity ice where ice.price=:pr"),
		@NamedQuery(name = "deleteByName", query = "delete from IceCreamEntity ice where ice.name=:nm") })
public class IceCreamEntity {
	@Id
	@GenericGenerator(name = "car", strategy = "increment")
	@GeneratedValue(generator = "car")
	@Column(name = "ID")
	private int id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "FLAVOUR")
	private Flavour flavour;

	@Column(name = "COMPANY")
	private String company;

	@Column(name = "PRICE")
	private double price;

	@Column(name = "COLOR")
	private Color color;

	public enum Flavour {
		BUTTERSCOTCH, STROWBERRY, CHACOLATE, VENILA, PINEAPPLE, PISTA, BADAM, MANGO
	}

	public enum Color {
		WHITE, PINK, GREEN, BLUE, BROWN, BLACK, YELLOW, ORANGE
	}

	public IceCreamEntity(String name, Flavour flavour, String company, double price, Color color) {
		super();
		this.name = name;
		this.flavour = flavour;
		this.company = company;
		this.price = price;
		this.color = color;
	}

}
