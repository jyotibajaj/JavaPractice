package linkedlist.com;

import static org.junit.Assert.*;

import org.junit.Test;

public class LinkedListTest {

	@Test
	public void testAddInTheEnd() {
		LinkedList list = new LinkedList();
		list.addInTheEnd(5);
		list.addInTheEnd(6);
		int[] att = list.printLinkedList();
		assertEquals(6, att[att.length - 1]);
	}

	// test when index is invalid
	@Test
	public void testAddAtParticularIndex() {
		LinkedList list = new LinkedList();
		try {
			list.addAtParticularIndex(4, 1);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("Not a valid index")
							.toString(),
					e.toString());
		}

		try {
			list.addAtParticularIndex(4, -11);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("Not a valid index")
							.toString(),
					e.toString());
		}

	}

	@Test
	public void testGetNodeFromParticularIndex() {
		LinkedList list = new LinkedList();
		list.addInTheEnd(5);
		list.addInTheEnd(6);
		int data = 4;
		list.addAtParticularIndex(data, 1);
		assertEquals(4, list.getDataFromParticularIndex(1));

	}

	@Test
	public void testRemoveNodeFromParticularIndex() {
		LinkedList list = new LinkedList();
		list.addInTheEnd(5);
		list.addInTheEnd(6);
		int data = 4;
		list.addAtParticularIndex(data, 1);
		assertEquals(6, list.removeNodeFromParticularIndex(2));

	}

	@Test
	public void testReversedLinkedList() {
		LinkedList list = new LinkedList();
		int count = 7;
		list.addInTheEnd(4);
		list.addInTheEnd(5);
		list.addInTheEnd(6);
		int[] arrayBeforeReversal = list.printLinkedList();
		assertEquals(6, arrayBeforeReversal[2]);
		list.reverseLinkedList();
		int[] arrayAfterReversal = list.printLinkedList();
		for (int i = 0; i < arrayAfterReversal.length; i++) {
			System.out.println(arrayAfterReversal[i]);
			assertEquals(--count, arrayAfterReversal[i]);

		}
		assertEquals(6, arrayAfterReversal[0]);

	}

	@Test
	public void testFindMiddleNode() {
		LinkedList list = new LinkedList();
		// check if list is empty
		//assertEquals(0, list.findMiddleNode());
		// check if only one node is present
		list.addInTheEnd(4);
		assertEquals(4, list.findMiddleNode());
		// check if three nodes are present
		list.addInTheEnd(5);
		list.addInTheEnd(6);
		assertEquals(5, list.findMiddleNode());
		list.addInTheEnd(7);
		// check if four nodes are present
		assertEquals(6, list.findMiddleNode());
		list.addInTheEnd(8);
		// check if five nodes are present
		assertEquals(6, list.findMiddleNode());

	}

	@Test
	public void testFindNthLastNode() {
		LinkedList list = new LinkedList();
		// check if list is empty
		try {
			list.findNthLastNode(1);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid value of n")
							.toString(),
					e.toString());
		}

		// check if only one node is present
		list.addInTheEnd(4);
		assertEquals(4, list.findNthLastNode(1));
		// check if three nodes are present
		list.addInTheEnd(5);
		list.addInTheEnd(6);
		assertEquals(5, list.findNthLastNode(2));
		// check if value of n is greater than length of list
		try {
			list.findNthLastNode(-1);
		} catch (Exception e) {
			assertTrue(e instanceof IllegalArgumentException);
			assertEquals(
					new IllegalArgumentException("invalid value of n")
							.toString(),
					e.toString());
		}
	}

	@Test
	public void testArrangeEvenAfterOdds() {
		LinkedList list = new LinkedList();
		// check if three nodes are present
		list.addInTheEnd(6);
		list.addInTheEnd(5);
		int[] arr = list.printLinkedList();
		list.mergeEvenAfterOdds();
		int[] array = list.printLinkedListAfterMerging();
		assertEquals(5, array[0]);

	}
}
