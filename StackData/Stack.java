package StackData;

import java.util.Arrays;

public class Stack {
	private int[] data;
	private int pointer = -1;
	final private int initial_capacity = 10;
	
	Stack(){
		data = new int[initial_capacity];
	}
	
	public void push(int value) {
		if(isFull()) {
			data = Arrays.copyOf(data, data.length*2);
		}
		data[++pointer] = value;
	}
	
	public boolean isFull() {
		return pointer == data.length-1;
	}

	public int pop() {
		if(isEmpty()) {
			return -1;
		}else {
			return data[pointer--];
		}
	}
	
	public boolean isEmpty() {
		return pointer == -1;
	}

	public int peek() {
		if(isEmpty()) {
			return -1;
		}else {
			return data[pointer];
		}
	}
	
	public void display() {
		for(int i = pointer; i>=0;i--) {
			if(i==pointer)
				System.out.println(data[i]+"<--TOP");
			else
				System.out.println(data[i]);
		}
	}
}
