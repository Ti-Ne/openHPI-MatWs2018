package de.TiNe.openHPI.math.logic;

import junit.framework.TestCase;

public class TestMathLogic extends TestCase {

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	// test logical AND operation 
	public void testScAnd() {
		assertEquals(SententialConnective.scAnd(true, true), true);
		assertEquals(SententialConnective.scAnd(false, false), false);
		assertEquals(SententialConnective.scAnd(true, false), false);
		assertEquals(SententialConnective.scAnd(false, true), false);
	}
	
	// test logical OR operation 
	public void testScOr() {
		assertEquals(SententialConnective.scOr(true, true), true);
		assertEquals(SententialConnective.scOr(false, false), false);
		assertEquals(SententialConnective.scOr(true, false), true);
		assertEquals(SententialConnective.scOr(false, true), true);
	}
	
	// test logical NOT operation 
	public void testScNot() {
		assertEquals(SententialConnective.scNot(true), false);
		assertEquals(SententialConnective.scNot(false), true);
	}
	
	// test logical IMPLICATION
	public void testScImplicates() {
		assertEquals(SententialConnective.scImplicates(true, true), true);
		assertEquals(SententialConnective.scImplicates(false, false), true);
		assertEquals(SententialConnective.scImplicates(true, false), false);
		assertEquals(SententialConnective.scImplicates(false, true), true);
	}
	
	// test logical EQUIVALENCE
	public void testScIsEquivalent() {
		assertEquals(SententialConnective.scIsEquivalent(true, true), true);
		assertEquals(SententialConnective.scIsEquivalent(false, false), true);
		assertEquals(SententialConnective.scIsEquivalent(true, false), false);
		assertEquals(SententialConnective.scIsEquivalent(false, true), false);
	}
}
