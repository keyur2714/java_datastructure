package com.webstack.driver;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.webstack.task.StringOperation;

public class TestDriver {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		System.out.println("Hello Radhe Krishna...!");
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		List<Future<String>> resultList=new ArrayList<Future<String>>();
		
		for(int i=1;i<=5;i++) {
			StringOperation stringOperation = new StringOperation("Keyur "+i);
			Future<String> result = executorService.submit(stringOperation);
			resultList.add(result);
		}
		
		for(Future<String> result : resultList) {
			while(! result.isDone()) {
				System.out.println("Result Is : "+result.get());
			}
		}		
		System.out.println("Done...");
		
	}

}
