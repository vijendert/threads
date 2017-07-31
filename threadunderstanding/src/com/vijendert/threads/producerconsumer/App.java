package com.vijendert.threads.producerconsumer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Message msg = new Message("Hello");
		Producer p1 = new Producer(msg);
		Producer p2 = new Producer(msg);
		Producer p3 = new Producer(msg);
		Producer p4 = new Producer(msg);
		Consumer c = new Consumer(msg);
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		c.start();
		int i = 1 >> 2;
		System.out.println(i);
	}

}
