package com.vijendert.threads.producerconsumer;

public class Producer extends Thread {
	private Message message;

	public Producer(Message msg) {
		this.message = msg;
	}

	@Override
	public void run() {
		try {
			message.setMsg(message.msg);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
