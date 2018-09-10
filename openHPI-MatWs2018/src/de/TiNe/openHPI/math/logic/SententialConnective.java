package de.TiNe.openHPI.math.logic;

public class SententialConnective {
	
	public static boolean scAnd (boolean a, boolean b) {
		return a && b;
	}
	
	public static boolean scOr (boolean a, boolean b) {
		return a || b;
	}
	
	public static boolean scNot (boolean a) {
		return !a;
	}
	
	public static boolean scImplicates (boolean a, boolean b) {
		return scOr(scNot(a), b);
	}

	public static boolean scIsEquivalent(boolean a, boolean b) {
		return scAnd(scImplicates(a, b), scImplicates(b, a));
	}
}
