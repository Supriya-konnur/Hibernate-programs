package com.xworkz.coupon.entity;

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
@Table(name="coupon")
public class CouponEntity {

	@Id
	@GenericGenerator(name="bike", strategy = "increment")
	@GeneratedValue(generator = "bike")
	@Column(name="ID")
	private int id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="VALIDATE_MONTH")
	private int validateMonth;
	
	@Column(name="CODE")
	private String code;
	
	@Column(name="TYPE")
	private String type;
	 
}
