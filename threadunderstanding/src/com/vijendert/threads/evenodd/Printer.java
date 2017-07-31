package com.vijendert.threads.evenodd;

//This is the object that two treads are gonna share
public class Printer {

	private boolean isEven = false;

	public void printOdd(int i) throws InterruptedException {
		synchronized (this) {
			while (isEven) {
				wait();
			}
			System.out.println(i);
			isEven = true;
			notifyAll();
		}
	}

	public void printEven(int i) throws InterruptedException {
		synchronized (this) {
			while (!isEven) {
				wait();
			}
			System.out.println(i);
			isEven = false;
			notifyAll();
		}

	}

}
