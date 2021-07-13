package com.trailPurpose;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Users {
	
	int userId;
	String name;
	Users(int userId,String name)
	{
		this.userId=userId;
		this.name=name;
		System.out.println("object has been created");
	}
	public String toString() {
		return userId + " " + name ;
	}
	public int getId()
	{
		return userId;
	}
}

 class mycomp<Object> implements Comparator<Object>
{
	 int a,b;
	 String s,ss;
	
	
@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	if(o1 instanceof Integer)
	{
		if(o2 instanceof Integer)
		{
			a=(Integer)o1;
			b=(Integer)o2;
			
			return a-b;
		}
		else
		return -1;	
	}
		if(o1 instanceof String)
		{
			if(o2 instanceof String)
			{
				s=(String)o1;
				ss=(String)o2;			
				
					return s.compareTo(ss);
			}
			else
				return -1;
		}
		if(o1 instanceof Users)
		{
			System.out.println("inside of the user section");
			if(o2 instanceof Users)
			{
				
				return sort(((Users) o1).userId,((Users) o2).userId);
			}
		}
		return 0;
	}
	public int sort(int a,int b)
	{
		return a-b;
	}

}

public class trail {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Object> set=new TreeSet<Object>(new mycomp());
		set.add(new Object(new Integer(1)));
		set.add(new Object(new String("Hii"));
		set.add(new Object(new Integer(3));
		set.add(new Integer(2));
		set.add(new String("Hello"));
		set.add(new String("Hey"));
		set.add(new Users(1,"adam"));
		set.add(new Users(2,"adaaam"));
		set.add(new Users(5,"ram"));
		
		set.stream().forEach(System.out::println);
		for(Object o:set)
		{
			System.out.println("printing the value");
			System.out.println(o);
		}
		

	}
	
	Set set1 =new TreeSet();

}
