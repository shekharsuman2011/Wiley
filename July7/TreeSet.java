package com.July7;

import java.util.*;


class User {
    private int id;
    private String name;

    public User(){

    }

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return this.getId();
    }
}


class Type implements Comparable<Type>{
    private Object object; // int // string // user -- expected sort : 1,2,Hello,Hi, User{1,"User1"}, User{2,"User2"}

    public Type(){

    }
    public Type(Object object){
        this.object = object;
    }
    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    @Override
    public String toString() {
        return "--"+ object +"";
    }

    @Override
    public int hashCode() {
        return object.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int compareTo(Type next) {
        // handle null values at the beginning
        if(this.object == null || next.object == null){
            return -1;
        }
        if(this.object instanceof Integer)
        {
            if(next.object instanceof Integer){
                int i = (int)next.object;
                int j = (int)this.object;
                return j - i;
            }
            else if(next.object instanceof String){
                return -1;
            }
            else if(next.object instanceof User)
            {
            	return -1;
            }
            return 0;
        }
        else if(this.object instanceof String)
        {
            if(next.object instanceof String)
            {
                String str1 = (String)this.object;
                String str2 = (String)next.object;
                return str1.compareTo(str2);
            }
            else if(next.object instanceof Integer)
            {
                return 1;
            }
            else if(next.object instanceof User)
            {
            	return 1;
            }
            return 0;
        }
        else if(this.object instanceof User)
        {
        	if(next.object instanceof Integer)
        	{
        		return 1;
        	}
        	else if(next.object instanceof String)
        	{
        		return 1;
        	}
        	else if(next.object instanceof User)
        	{
        		User u1=(User) this.object;
        		User u2=(User) next.object;
        		if(u1.getId()<u2.getId())
        		{
        			return -1;
        		}
        		else 
        		{
        			return 1;
        		}
        	}
        }
        return 0;
    }
}

public class TreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Type> userSet =(Set<Type>) new TreeSet();
		userSet.add(new Type(2));
		userSet.add(new Type(2));
		userSet.add(new Type(new User(2,"User2")));
		userSet.add(new Type(new User(1,"User1")));
		userSet.add(new Type(new String("Hi")));
		userSet.add(new Type(new String("Hello")));
		
		

	}

}
