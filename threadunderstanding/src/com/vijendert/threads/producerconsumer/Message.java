package com.vijendert.threads.producerconsumer;

public class Message {
	private boolean msgSet = false;
	public String msg;

	public Message(String msg) {
		this.msg = msg;
	}

	public void getMsg() throws InterruptedException {
		while (true) {
			synchronized (this) {
				while (!msgSet) {
					wait();
				}
				System.out.println("Message Received " + msg);
				msgSet = false;
				notifyAll();
			}
		}

	}

	public void setMsg(String msg) throws InterruptedException {
		synchronized (this) {
			// if message is already set wait for it to be consumed
			while (msgSet) {
				wait();
			}
			this.msg = msg;
			msgSet = true;
			notifyAll();
		}

	}
}
