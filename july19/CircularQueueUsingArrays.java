package com.july19;

class CircularQueue
{
	  int size = 5;
	  int front=-1, rear=-1;
	  int arr[] = new int[size];

	  boolean isFull() 
	  {
	    if (front == 0 && rear == size - 1)
	    {
	      return true;
	    }
	    if (front == rear + 1) 
	    {
	      return true;
	    }
	    return false;
	  }

	  boolean isEmpty() 
	  {
	    if (front == -1)
	      return true;
	    else
	      return false;
	  }

	 
	  void enqueue(int data) 
	  {
	    if (isFull()) {
	      System.out.println("Queue is full");
	    } else {
	      if (front == -1)
	        front = 0;
	      rear = (rear + 1) % size;
	      arr[rear] = data;
	      System.out.println("Inserted data is " + data);
	    }
	  }

	 
	  void dequeue()
	  {
	    if (isEmpty())
	    {
	      System.out.println("Queue is empty");
	    } 
	    else 
	    {
		  System.out.println("Deleted data is "+arr[front]);
	      front = (front + 1) % size;
	    }

	  }

	  void display()
	  {
		  System.out.println("=============================================================");
		  int temp=front;
		  while(temp!=rear)
		  {
	    	if(temp==size)
	    	{
	    		temp=0;
	    	}
	    	System.out.println(arr[temp]);
	    	temp++;
		  }
		  System.out.println(arr[temp]);
		  System.out.println("=============================================================");
	  }

}

public class CircularQueueUsingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularQueue q = new CircularQueue();

	    q.dequeue();
	    q.enqueue(1);
	    q.enqueue(2);
	    q.enqueue(3);
	    q.enqueue(4);
	    q.enqueue(5);
	    q.enqueue(6);
	    q.display();
	    q.enqueue(7);
	    q.display();
	    q.enqueue(8);

	}

}
