package com.vijendert.threads.customblockingqueue;

import java.util.Stack;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> chStack = new Stack<>();
		String str = "Jai Ganeshji";
		char[] charArray = str.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			chStack.push(charArray[i]);
		}
		String output = "";
		while (!chStack.isEmpty()) {
			output += chStack.pop();
		}
		System.out.println(output);
	}

}
