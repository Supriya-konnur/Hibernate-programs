package com.xworkz.product.entity;

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
@AllArgsConstructor
@Entity
@Table(name="product")
@NamedQueries({
	@NamedQuery(name="findAll", query="SELECT product from ProductEntity product"),
	@NamedQuery(name="findAllIds", query="SELECT product.pid from ProductEntity product"),
	@NamedQuery(name="updateBrandByName",query="update ProductEntity set brand=:br where name=:nm")

})
public class ProductEntity {
	@Id
	@GenericGenerator(name="auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name="PID")
	private int pid;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="TYPE")
	private ProductType type;
	
	@Column(name="PRICE")
	private double price;
	
	@Column(name="QUANTITY")
	private int quantity;
	
	@Column(name="QUALITY")
	private boolean quality;
	
	@Column(name="MANUFACTURER")
	private String manufacturer;
	
	@Column(name="BRAND")
	private String brand;
	
	public enum ProductType{
		HOME_APPLIANCES,ELECTRONIC,COMPUTERS,FASHION
	}

}
