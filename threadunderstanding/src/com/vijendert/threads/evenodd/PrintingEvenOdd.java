package com.vijendert.threads.evenodd;

public class PrintingEvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printer p = new Printer();
		EvenThreadConsumer etc = new EvenThreadConsumer(p);
		OddThreadConsumer otc = new OddThreadConsumer(p);
		etc.start();
		otc.start();
	}

}
