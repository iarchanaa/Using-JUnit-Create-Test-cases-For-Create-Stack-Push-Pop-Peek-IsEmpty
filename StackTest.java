package com.dcu.assignment;

import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.Test;

public class StackTest {

	private static int DEFAULT_TEST_CAPACITY = 3;
	Stack emtyStack = new Stack(DEFAULT_TEST_CAPACITY);

	@Test
	public void testIsEmpty() {
		assertTrue("not isEmpty after construction", emtyStack.isEmpty());
		emtyStack.push(1);
		assertFalse("isEmpty after push", emtyStack.isEmpty());
		emtyStack.pop();
		assertTrue("not isEmpty after push/pop", emtyStack.isEmpty());
	}
	@Test
	public void testPushEmpty() {
		assertEquals(emtyStack.isEmpty(), Boolean.TRUE);
		assertEquals(-1, emtyStack.peek());
		emtyStack.push(1);
		assertEquals(1, emtyStack.pop());
	}

	@Test(expected = StackOverflowError.class)
	public void testPushStackisFull() {
		assertEquals(emtyStack.isEmpty(), Boolean.TRUE);
		emtyStack.push(1);
		emtyStack.push(2);
		emtyStack.push(3);
		// Adding Extra Element
		emtyStack.push(4);
	}

	@Test
	public void testPopNormal() {
		assertEquals(emtyStack.isEmpty(), Boolean.TRUE);
		emtyStack.push(1);
		assertEquals( 1, emtyStack.pop());
	}

	@Test
	public void testPopStackisEmpty() {
		assertEquals(emtyStack.isEmpty(), Boolean.TRUE);
		int data = emtyStack.peek();
		assertEquals(data, -1);
	}

	@Test
	public void testPopStackisFull() {
		assertEquals(emtyStack.isEmpty(), Boolean.TRUE);
		emtyStack.push(1);
		assertEquals( 1, emtyStack.pop()); // pop on 1st
		emtyStack.push(2);
		assertEquals( 2, emtyStack.pop());
		emtyStack.push(3);
		assertEquals( 3, emtyStack.pop());

	}

	@Test
	public void testPeekNormal() {
		assertEquals(emtyStack.isEmpty(), Boolean.TRUE);
		emtyStack.push(1);

		assertEquals( 1, emtyStack.peek());
		emtyStack.push(2);
		assertEquals(2, emtyStack.peek());
		emtyStack.push(3);
		assertEquals(3, emtyStack.peek());
		emtyStack.pop();
		assertEquals(2, emtyStack.peek());
		emtyStack.pop();
		assertEquals(1, emtyStack.peek());
		emtyStack.pop();
		emtyStack.peek();
		assertEquals(-1, emtyStack.peek());
	}

	@Test
	public void testPeekStackisEmpty() {
		assertEquals(emtyStack.isEmpty(), Boolean.TRUE);
		int data = emtyStack.peek();
		assertEquals(data, -1);
	}

}




