package com.webstack.action;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.webstack.util.CallableTask;
import com.webstack.util.EmployeeTask;
import com.webstack.util.NumberThread;

public class TestDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Thread t1 = new NumberThread();
		t1.setName("T1");
		t1.start();
		Thread t2 = new NumberThread();
		t2.setName("T2");
		t2.start();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Thread t3 = new NumberThread();
		t3.setName("T3");
		t3.start();
		try {
			t3.join();		
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("======================");
		
		for(int i=1;i<=10;i++) {
			Thread t4=new Thread(new EmployeeTask(i));
			t4.start();
		}*/
		
		System.out.println("*********");
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
	/*	for(int i=1;i<=5;i++) {			
			executorService.submit(t3);
		}
		
		for(int i=1;i<=10;i++) {			
			executorService.submit(()->{
				int k=1;
				System.out.println("Executor Service : "+k);
			});
		}
	*/
		
		Future<String> f = executorService.submit(new CallableTask());
		
		for(int i=1;i<=10;i++) {
			System.out.println(f.isDone()+" === ");
			if(f.isDone()) {
				try {
					System.out.println(f.get()+" **");
				} catch (InterruptedException | ExecutionException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
			}else {
				for(int j=1;j<=10;j++) {
					System.out.println("==== "+j);
				}
			}
		}
		
		
		
		
	}

}
