package com.vijendert.threads.evenodd;

public class EvenThreadConsumer extends Thread {

	private Printer printer;

	public EvenThreadConsumer(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0)
				try {
					printer.printEven(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}

}
