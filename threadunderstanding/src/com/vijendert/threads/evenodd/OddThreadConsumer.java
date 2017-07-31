package com.vijendert.threads.evenodd;

public class OddThreadConsumer extends Thread {
	private Printer printer;

	public OddThreadConsumer(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0)
				try {
					printer.printOdd(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
		}
	}

}
