package com.vijendert.threads.producerconsumer;

public class Consumer extends Thread {
	private Message message;

	public Consumer(Message msg) {
		this.message = msg;
	}

	@Override
	public void run() {
		try {
			this.message.getMsg();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
