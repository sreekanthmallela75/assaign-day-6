package javaprogram;

public class SquareRootFunction {
	public class MathEx {
	    public static void main(String[] args) {
	        sqrt();
	    }

	    private static void sqrt() {
	        System.out.println(Math.sqrt(16.0f)); // 4.0

	        System.out.println(Math.sqrt(-16.0f)); // NaN

	        System.out.println(Math.sqrt(0)); // 0.0

	        System.out.println(Math.sqrt(-0)); // 0.0

	        // cast to int
	        System.out.println((int) Math.sqrt(64)); // 8

	        System.out.println(Math.sqrt(Double.POSITIVE_INFINITY)); // +Inf
	    }
}
}
