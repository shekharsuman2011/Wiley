package com.July12;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        //System.out.println("MainClass "+Thread.currentThread().getId()+" "+Thread.currentThread().getPriority());
		        //System.out.println(" -- "+Thread.currentThread().isDaemon());

//		        for(int i =0;i<100000;i++){
//		            System.out.println("COl Val "+i);
//		        }
		        //System.out.println("MainClass I am good how about u ");

		        // create a thread
//		        Thread thread2 = new Thread("SampleThread");
//		        Thread thread1 = new Thread("MyThread1");
		//
//		        thread2.setPriority(Thread.MAX_PRIORITY);
		//
//		        thread1.setDaemon(true);
//		        // we can priority to the threads
//		        //1 - 10
//		        // 1 - lowest
//		        // 10 - highest
//		        // 5 - Normal
		//
//		        // starting the thread
//		        thread1.start();
//		        thread2.start();
		//
//		        // transform into a daemon thread
//		        thread1.setPriority(8);
		//
//		        System.out.println(thread2.getId() + "-- "+thread2.getPriority());
//		        System.out.println(thread1.getId() +"-- "+thread1.getPriority());

//		        UserService userService1 = new UserService();
//		        UserService userService2 = new UserService();
		//
//		        // START : THREAD 1
//		        userService1.setName("USERSERVICE-1");
//		        userService1.start();
		//
//		        // START : THREAD 2
//		        userService2.setName("USERSERVICE-2");
//		        userService2.start();
		//
//		        userService1.setPriority(1);


		        // CREATE THREADS USING RUNNABLE

		        EmpService empService = new EmpService();

		        Thread empThread1 = new Thread(empService);

		        Thread empThread2 = new Thread(empService);

		        // start the thread
		        empThread1.start();
		        empThread2.start();

		        // obj1 -> t1
		            //list
		        // obj2 -> t3
		            //list
		        // obj3 -> t2
		            //list

		        empService.getIntegers().forEach(in-> System.out.println("INT "+in));

		    }
		}

		/**
		 * ways to create threads
		 *  1. Thread class
		 *  2. Runnable Interface
		 *  3. Callable Interface
		 *  4. Executor Service / Framework
		 *
		 *  Types of Threads
		 *  1. Priority Threads - they have high priority & can manipulate the JVM from processing
		 *  2. Daemon Threads - they are low priority threads & cant prevent JVM from exiting , they always run in background
		 *
		 * Lifecycle of a Thread:
		 *
		 * 1. New
		 * 2. Runnable
		 * 3. Waiting / Sleep
		 * 4. Blocked
		 * 5. Terminated - final state
		 * */

		// Option 1: create by extending thread class
		class UserService extends Thread{

		    @Override
		    public void run() {
		        for(int i=0;i<10;i++){
		            System.out.println(Thread.currentThread().getName() + " ---- "+i);
		        }
		    }
		}
		// create by implementing runnable interface
		class EmpService implements Runnable{

		    private Set<Integer> integers = Collections.emptySet();

		    @Override
		    public void run() {
		        integers = new TreeSet<Integer>();

		        for (int i = 100; i > 0 ; i--) {
		            integers.add(i);
//		            try {
//		                //Thread.sleep(1000);
//		            }catch (InterruptedException inEx){
//		                System.err.println(inEx);
		           
//		        }
		            System.out.println(Thread.currentThread().getName() + " ---- "+i);
		        }x
		    }

		    public Set<Integer> getIntegers() {
		        return integers;
		    }

}
