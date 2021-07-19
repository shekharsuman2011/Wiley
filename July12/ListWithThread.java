package com.July12;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class User
{
	int id;
	String Name;
	List<Project> project;
	User(int id,String Name)
	{
		this.id=id;
		this.Name=Name;
		project=new ArrayList<Project>();
	}
	public void  addProject(int projectId,String projectName)
	{
		this.project.add(new Project(projectId,projectName));
	}
	public String toString()
	{
		return id+" "+Name;
	}
}
class Project
{
	int projectId;
	String projectName;
	Project(int projectId,String projectName)
	{
		this.projectId=projectId;
		this.projectName=projectName;
	}
	public String toString()
	{
		return projectId+" "+projectName;
	}
}

public class ListWithThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<User> ulist=new ArrayList<User>();
		ulist.add(new User(1,"User1"));
		ulist.get(0).addProject(1,"project1");
		ulist.get(0).addProject(2,"project2");
		ulist.get(0).addProject(3,"project3");
		ulist.add(new User(2,"User2"));
		ulist.get(1).addProject(1,"project1");
		ulist.get(1).addProject(2,"project2");
		

		 Map<User,List<Project>> map = new HashMap<>();
	        for (User stu : ulist) {
	        	if()
	            map.put(stu, stu.project);
	        }
	        
	        System.out.println(map);
	}

}
