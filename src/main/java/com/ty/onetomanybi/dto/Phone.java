package com.ty.onetomanybi.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class Phone {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private int iemino;
	private String phoneBrand;
	private String model;
	private int cost;
	
	@OneToMany(mappedBy="phone")
	
	private List<Sim> sims;


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIemino() {
		return iemino;
	}


	public void setIemino(int iemino) {
		this.iemino = iemino;
	}


	public String getPhoneBrand() {
		return phoneBrand;
	}


	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getCost() {
		return cost;
	}


	public void setCost(int cost) {
		this.cost = cost;
	}


	public List<Sim> getSims() {
		return sims;
	}


	public void setSims(List<Sim> sims) {
		this.sims = sims;
	}
	
}
