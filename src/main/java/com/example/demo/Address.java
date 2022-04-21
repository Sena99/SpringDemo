package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Address 
{
	public Address() {
		System.out.println("Address Constuctor");
	}
	
	public String FetchAddress()
	{
		return "Hyderbad";
	}
	

}
