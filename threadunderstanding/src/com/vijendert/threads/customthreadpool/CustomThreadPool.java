package com.vijendert.threads.customthreadpool;

import java.util.ArrayList;
import java.util.List;

import com.vijendert.threads.customblockingqueue.BlockingQueue;

public class CustomThreadPool {
	// will have threads
	List<CustomThread> threadLst = new ArrayList<>();
	BlockingQueue bq = new BlockingQueue();

	public CustomThreadPool(int maxNumberOfThreads) {
		for (int i = 0; i < maxNumberOfThreads; i++) {
			threadLst.add(new CustomThread(bq));
		}
		for (CustomThread cs : threadLst) {
			cs.start();
		}
	}

	public synchronized void execute(Runnable task) throws InterruptedException {
		bq.enqueue(task);
	}

	public synchronized void stopThreads() {
		for (CustomThread ct : threadLst) {
			ct.doStop();
		}
	}

}
