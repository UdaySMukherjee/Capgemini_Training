package queue;

import java.util.Arrays;

public class Queue {
	int[] data;
	int pointer = -1;
	int capacity = 10;
	
	Queue(){
		data = new int[capacity];
	}
	
	Queue(int size) {
		data = new int[size];
	}
	
	public boolean insert(int value) {
		if(isFull()) {
			System.out.println("Overflow");
			data = Arrays.copyOf(data, data.length*2);
			return true;
		}else {
			pointer++;
			data[pointer] = value;
			return true;
		}
	}
	
	public int delete() {
		if(isEmpty()) {
			return -1;
		}else {
			int value = data[pointer];
			for(int i = 1; i<= pointer; i++) {
				data[i-1] = data[i];
			}
			pointer--;
			return value;
		}
	}

	public boolean isEmpty() {
		return pointer == -1;
	}

	public boolean isFull() {
		return pointer == data.length-1;
	}
	
	public int getSize() {
		return pointer+1;
	}
	
	public void display() {
		for(int i=0;i<=pointer;i++) {
			if(i==pointer)
				System.out.println(data[i]+"(Rear)");
			else if(i==0)
				System.out.print("(Front)"+data[i]+"->");
			else
				System.out.print(data[i]+"->");
		}
	}
}
