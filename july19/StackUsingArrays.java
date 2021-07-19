package com.july19;


class Stack
{
	private int arr[]=new int[10];
	private int index=-1;

	public void push(int data)
	{
		if(index>9)
		{
			System.out.println("Stack is full");
		}
		else
		{
			index++;
			arr[index]=data;	
		}
		
	}
	public void pop()
	{
		if(index<0)
		{
			System.out.println("Stack is empty");
		}
		else
		{
			System.out.println("popped element is "+arr[index]);
			index--;
		}
	}
	public void triverse()
	{
		for(int i=0;i<=index;i++)
		{
			System.out.println(arr[i]);
		}
	}
	public void peek()
	{
		System.out.println("top most element is "+arr[index]);
	}
	
}


public class StackUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Stack s=new Stack();
		s.triverse();
		System.out.println("=============================================================");
		s.push(10);
		s.push(20);
		s.push(30);
		s.peek();
		s.push(40);
		s.push(50);
		s.triverse();
		s.pop();
		System.out.println("=============================================================");
		s.triverse();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		s.pop();
		System.out.println("=============================================================");
		s.triverse();
		
		

	}

}
