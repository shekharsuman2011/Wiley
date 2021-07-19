package com.July12;

import java.util.*;

class fibo implements Runnable
{
	List<Integer> fibolist=new ArrayList<Integer>();
	@Override
	public void run() {
		int n1=0,n2=1,n3,i,count=100;  
		for(i=2;i<count;++i)   
		 {    
		  n3=n1+n2;    
		  fibolist.add(n3);  
		  n1=n2;    
		  n2=n3;    
		 }    
		
	}
	
}
class fibotable implements Runnable
{
	List<String> ftable=new ArrayList<String>();
	@Override
	public void run() {
		int prev=0,next=1,sum=0;
	       int temp;
	        for(int i=0;i<100;i++)
	        {
		        	temp=next;
		        	next=prev+next;
		        	prev=temp;
		        	
		        	ftable.add(sum+" + "+prev+" = "+(sum+prev));
		        	System.out.println(ftable.get(0));
		        	sum=sum+prev;
	        }
		
	}
	
}

public class Fibonachi {
	
	public static void main(String args[])
	{
		fibo f=new fibo();
		Thread t=new Thread(f);
		fibotable f2=new fibotable();
		Thread t2=new Thread(f2);
		t.start();
		t2.start();
		System.out.println(f.fibolist);
		System.out.println(f2.ftable);
		for(String li:f2.ftable)
		{
			System.out.println(li);
		}
		
	}

}
