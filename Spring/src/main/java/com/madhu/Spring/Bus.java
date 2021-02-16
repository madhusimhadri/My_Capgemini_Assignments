package com.madhu.Spring;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Vehicle
{
	public void drive()
	{
		System.out.println("Running .... ");
	}
}
