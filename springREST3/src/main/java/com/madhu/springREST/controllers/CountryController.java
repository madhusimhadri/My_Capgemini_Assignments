package com.madhu.springREST.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.madhu.springREST.models.CountryModel;

@RestController 
public class CountryController
{
		@RequestMapping(value="/country/{zipcode}",method= RequestMethod.GET,headers="Accept=application/json")
		public CountryModel getCountryById(@PathVariable int zipcode)
		{
			List<CountryModel> listOfCountries= new ArrayList();
			listOfCountries=createCountryList();
			
			for(CountryModel country:listOfCountries)
			{
				if(country.getZipcode()==zipcode)
					return country;
			}
			return null;
		}

		@RequestMapping("/getInfo")
		public CountryModel getCountry(@RequestParam("code") String zcode)
		{
			long zipcode=Integer.parseInt(zcode);
			List<CountryModel> listOfCountries= new ArrayList();
			listOfCountries=createCountryList();
			
			for(CountryModel country:listOfCountries)
			{
				if(country.getZipcode()==zipcode)
					return country;
			}
			return null;
		}
		
		
		private List createCountryList() 
		{
			CountryModel m1=new CountryModel(534210,"Andhra Pradesh","Bhimavaram","India");
			CountryModel m2=new CountryModel(534211,"Mexico","Mexico city","USA");
			CountryModel m3=new CountryModel(534212,"Headingly","Cambridge","London");
			CountryModel m4=new CountryModel(534213,"South Australia","Brisbane","Australia");
			
			  List<CountryModel> listOfCountries = new ArrayList();
		        listOfCountries.add(m1);
		        listOfCountries.add(m2);
		        listOfCountries.add(m3);
		        listOfCountries.add(m4);
		        return listOfCountries;
			
		}
	
	
}
