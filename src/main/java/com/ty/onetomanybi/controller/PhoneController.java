package com.ty.onetomanybi.controller;

import java.util.ArrayList;
import java.util.List;

import com.ty.onetomanybi.dao.PhoneDao;
import com.ty.onetomanybi.dto.Phone;
import com.ty.onetomanybi.dto.Sim;

public class PhoneController {
	public static void main(String[] args) {
		
	
	Sim sims1=new Sim();
	sims1.setSimName("Vodafone");
	sims1.setSimPrice(150);
	sims1.setSimSize("micro");
	
	
	
	Sim sims2=new Sim();
	sims2.setSimName("Airtel");
	sims2.setSimPrice(200);
	sims2.setSimSize("macro");
	
	Phone phone=new Phone();
	phone.setPhoneBrand("Apple");
	phone.setModel("iphone11");
	phone.setCost(100000);
	
	
	
	List<Sim>sim=new ArrayList<Sim>();
	sim.add(sims1);
	sim.add(sims2);
	phone.setSims(sim);
	
	
	PhoneDao dao= new PhoneDao();
	dao.savePhone(phone);
	
	

}
}