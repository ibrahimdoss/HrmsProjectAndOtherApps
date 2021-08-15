package com.company;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapters;
import Concreate.NeroCustomerManager;
import Concreate.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager neroCustomerManager= new NeroCustomerManager();
		BaseCustomerManager starbucksCustomerManager= new StarbucksCustomerManager(new MernisServiceAdapters());
		
		Customer ibrahim=new Customer();
		ibrahim.setId(2);
		ibrahim.setFirstName("Ýbrahim");
		ibrahim.setlastName("Dos");
		ibrahim.setNationallityId("13805175224");
		ibrahim.setDateOfBirth(LocalDate.of(1985, 1, 6));
		
		neroCustomerManager.save(ibrahim);
		starbucksCustomerManager.save(ibrahim);
	}

}
