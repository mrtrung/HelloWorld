package com.multithread;

import java.util.concurrent.atomic.AtomicInteger;

public class MultiThread {
	
	private static AtomicInteger	counter	= new AtomicInteger();
	
	public static int getCount() {
		return counter.getAndIncrement();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	
}
