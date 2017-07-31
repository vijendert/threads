package com.vijendert.threads.customblockingqueue;

import java.util.LinkedList;
import java.util.Queue;

/**
 * A blocking queue which does not have allow any thread to add when queue is
 * full
 * 
 * @author vijethak
 *
 */
public class BlockingQueue {
	private static final int MAX_SIZE = 10;
	private static Queue<Object> queue = new LinkedList<>();

	public synchronized void enqueue(Object obj) throws InterruptedException {
		while (queue.size() == MAX_SIZE) {
			wait();
		}
		if (queue.isEmpty()) {
			notifyAll();
		}
		queue.add(obj);
	}

	public synchronized Object dequeue() throws InterruptedException {
		while (queue.isEmpty()) {
			wait();
		}
		if (queue.size() == MAX_SIZE) {
			notifyAll();
		}
		return queue.remove();
	}
}
