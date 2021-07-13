package com.july6;

import java.util.ArrayList;
import java.util.List;



class checking
{
	int projectId;
	double projectMargin;
	List<Employe> em;
	
}

class User
{
	String userId;
	String name;
	User(String userId,String name)
	{
		this.userId=userId;
		this.name=name;
	}
}
class Employe extends User
{
	Address address;
	Project project;
	double salary;
	Employe(String userId,String name,double salary,String zipcode,String city,int projectId,String projectName,double projectMargin)
	{
		super(userId, name);
		address=new Address(zipcode,city);
		project=new Project(projectId,projectName,projectMargin);
		this.salary=salary;
		
	}
}
class Address
{
	String city;
	String zipCode;
	Address(String city,String zipCode)
	{
		this.city=city;
		this.zipCode=zipCode;
	}
}
class Project
{
	int projectId;
	String projectName;
	double projectMargin;
	Project(int projectId,String projectName,double projectMargin)
	{
		this.projectId=projectId;
		this.projectName=projectName;
		this.projectMargin=projectMargin;
	}
}


public class EmployeeList {
	static int check(List<checking>li,int projectId)
	{
		for(checking l:li)
		{
			if(l.projectId==projectId)
			{
				return true;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<checking> li=new ArrayList<checking>();
		List<User> users=new ArrayList<User>();
		users.add(new User("Shekhar Suman","wil01"));
		users.add(new Employe("Rahul Kumar","wil02",500,"800006","Patna",001,"Google",1000));
		users.add(new Employe("Amar Kumar","wil03",400,"800007","Delhi",001,"Google",1000));
		users.add(new Employe("Jyoti Kumari","wil04",300,"800008","Chennai",001,"Google",1000));
		
		
		for(User u:users)
		{
			if(u instanceof Employe)
			{
				
				System.out.println("Correct input");
				if(check(li,((Employe) u).project.projectId)
						{
							li.add(new checking());
							li.
						}
				//li.indexOf(empl)
			}
		}
		
		
		

	}

}
