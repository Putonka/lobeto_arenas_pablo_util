package uo.mp.util.validate;

import java.util.Objects;

public class Validate {
	
	public static <T> T nonNull(final T object, String message) {
		if(Objects.isNull(object)) 
			throw new NullPointerException(message);
		return object;
	}
	
	public static String nonEmpty(String string, String message) {
		nonNull(string,message);
		if(string.isBlank())
			throw new IllegalArgumentException(message);
		return string;
	}
	public static double higherThan(double number, double notLess, String message) {
		if(number <= notLess) {
			throw new IllegalArgumentException("message");
		}
		return number;
	}

}
