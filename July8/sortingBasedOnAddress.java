package com.July8;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.July7.TreeSet;

class UserClass
{
	int id;
	String name;
	List<Address> ad;
	UserClass(int id,String name)
	{
		this.id=id;
		this.name=name;
		ad=new ArrayList<Address>();
	}
	public void addAddress(int ZipCode,String CityName)
	{
		ad.add(new Address(ZipCode,CityName));
	}
	
}
class Address
{
	int ZipCode;
	String CityName;
	Address(int ZipCode,String CityName)
	{
		this.ZipCode=ZipCode;
		this.CityName=CityName;
	}
}

class AddressClass
{
	int ZipCode;
	String CityName;
	Set<User> user;
	int count=0;
	AddressClass(int ZipCode,String CityName)
	{
		this.ZipCode=ZipCode;
		this.CityName=CityName;
		uset=(Set<User>) new TreeSet();
	}
	
}
class User
{
	int id;
	String name;
	User(int id,String name)
	{
		this.id=id;
		this.name=name;
	}	
}


public class sortingBasedOnAddress {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<UserClass> Uli=new ArrayList<UserClass>();
		Uli.add(new UserClass(1,"User1"));
		Uli.get(0).addAddress(560001, "BLR");
		Uli.get(0).addAddress(201305, "GN");
		Uli.add(new UserClass(2,"User2"));
		Uli.get(1).addAddress(110001, "DEl");
		Uli.get(1).addAddress(560001, "BLR");
		Uli.add(new UserClass(3,"User3"));
		Uli.get(2).addAddress(560001, "BLR");
		Uli.get(2).addAddress(201305, "GN");
		
		Set<AddressClass> aclass=(Set<AddressClass>) new TreeSet();
		for(UserClass u:Uli)
		{
			aclass.add(null)
		}
		
		
		

	}
}
