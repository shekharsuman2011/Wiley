package com.july19;

class Queue
{
	private int arr[]=new int[10];
	private int front=0,rear=0;
	void enqueue(int data)
	{
		if(rear>=10)
		{
			System.out.println("Queue is full");
		}
		else
		{
			arr[rear]=data;
			rear++;
		}
		
	}
	void dequeue()
	{	
		if(front<rear)
		{
			System.out.println("dequeue data is "+arr[front]);
			front++;
		}
		else
		{
			System.out.println("Queue is Empty");
		}
	}
	void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.println(arr[i]);
		}
	}
}

public class QueueUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		System.out.println("=============================================================");
		q.display();
		System.out.println("=============================================================");
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(50);
		System.out.println("=============================================================");
		q.display();
		System.out.println("=============================================================");
		q.dequeue();
		q.dequeue();
		

	}

}
