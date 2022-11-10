package com.ty.onetomanybi.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Sim {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int imeino;
	private String simName;
	private int simPrice;
	private String simSize;
	@ManyToOne 
	@JoinColumn
	private Phone phone;
	
	
	public Phone getPhone() {
		return phone;
	}
	public void setPhone(Phone phone) {
		this.phone = phone;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getImeino() {
		return imeino;
	}
	public void setImeino(int imeino) {
		this.imeino = imeino;
	}
	public String getSimName() {
		return simName;
	}
	public void setSimName(String simName) {
		this.simName = simName;
	}
	public int getSimPrice() {
		return simPrice;
	}
	public void setSimPrice(int simPrice) {
		this.simPrice = simPrice;
	}
	public String getSimSize() {
		return simSize;
	}
	public void setSimSize(String simSize) {
		this.simSize = simSize;
	}
	
}
