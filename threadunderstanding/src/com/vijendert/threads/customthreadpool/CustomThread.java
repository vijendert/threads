package com.vijendert.threads.customthreadpool;

import com.vijendert.threads.customblockingqueue.BlockingQueue;

public class CustomThread extends Thread {
	BlockingQueue bq;
	private boolean isStopped;

	public CustomThread(BlockingQueue bq) {
		this.bq = bq;
	}

	@Override
	public void run() {
		while (!isStopped()) {
			try {
				Runnable runable = (Runnable) bq.dequeue();
				runable.run();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void doStop() {
		isStopped = true;
		this.interrupt();
	}

	public synchronized boolean isStopped() {
		return isStopped;
	}
}
