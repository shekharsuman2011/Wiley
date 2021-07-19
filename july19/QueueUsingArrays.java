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
		System.out.println("=============================================================");
		for(int i=front;i<rear;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("=============================================================");
	}
}

public class QueueUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q=new Queue();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.enqueue(50);
		q.display();
		q.dequeue();
		q.dequeue();
		

	}

}
