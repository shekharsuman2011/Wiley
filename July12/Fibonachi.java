package com.July12;

import java.util.*;

public class Fibonachi extends Thread {
	 private int x;
	    public int answer;
	 
	    public Fibonachi(int x) {
	        this.x = x;
	    }
	 
	    public void run() {
	        if (x == 0){ 
	            answer = 0;
	        }else if( x == 1 || x == 2 ) {
	            answer = 1;
	        }else {
	            try {
	                /*
	                 * Below we are invoking 2 threads to compute separate values
	                 * This will for a tree structure
	                 */
	            	Fibonachi f1 = new Fibonachi(x-1);
	            	Fibonachi f2 = new Fibonachi(x-2);
	                f1.start();
	                f2.start();
	                f1.join();
	                f2.join();
	                answer = f1.answer + f2.answer;
	            }catch(InterruptedException ex) { 
	                ex.printStackTrace();
	            }
	        }
	    }
	public static void main(String args[])
	{
		try {
            int inputNum = 8;
            Fibonachi f = new Fibonachi(inputNum);
            f.start();
            f.join();
            System.out.println("Fibonacci number at "+inputNum+" position is:"+f.answer);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
	}

}
