package com.dcu.assignment;

public class Stack {
	private int arr[];
	private int top;
	private static int DEFAULT_CAPACITY = 3;

	public Stack(int size) {
		arr = new int[size];
		top = -1;
	}

	public Stack() {
		arr = new int[DEFAULT_CAPACITY];
		top = -1;
	}

	public void push(int x) {
		if (isFull()) {
			System.out.println("OverFlow\nProgram Terminated\n");
			throw new StackOverflowError();
		} else {
			System.out.println("Inserting " + x);
			arr[++top] = x;
		}
	}

	public int pop() {
		if (isEmpty()) {
			System.out.println("UnderFlow\nProgram Terminated");
			return -1;
		}
		System.out.println("Removing " + peek());
		return arr[top--];
	}
	public int peek() {

		if (!isEmpty())
			return arr[top];
		else
			return -1;
	}

	public int size() {
		return top + 1;
	}

	public Boolean isEmpty() {
	
		return top == -1;
		
	}

	public Boolean isFull() {
		return top == arr.length - 1;
	}

	public int testing() {
		return 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack s = new Stack(3);
		s.push(1);
		s.push(2);
		s.pop();
		s.pop();

		s.push(3);

		System.out.println("Top element is: " + s.peek());
		System.out.println("Stack size is " + s.size());

		s.pop();
		
		if (s.isEmpty())
			System.out.println("Stack is Empty");
		else
			System.out.println("Stack is Not Empty");

	}

}
