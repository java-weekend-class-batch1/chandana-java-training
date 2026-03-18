package com.training.Polymorphismassgn;
	class MathOps {

	    public int compute(int a, int b) {
	        System.out.println("MathOps: compute(int, int)");
	        return a + b;
	    }

	    public double compute(double a, double b) {
	        System.out.println("MathOps: compute(double, double)");
	        return a * b;
	    }

	    public int compute(int a, int b, int c) {
	        System.out.println("MathOps: compute(int, int, int)");
	        return a + b + c;
	    }
	}

	class AdvancedMathOps extends MathOps {
	    @Override
	    public double compute(double a, double b) {
	        System.out.println("AdvancedMathOps: compute(double, double)");
	        System.out.println("Logging: a = " + a + ", b = " + b);
	        return a * b * 2;
	    }

	    public int compute(int a) {
	        System.out.println("AdvancedMathOps: compute(int)");
	        return a * a;
	    }
	}

	public class Math {
	    public static void main(String[] args) {

	        MathOps base = new MathOps();
	        MathOps ref = new AdvancedMathOps(); 
	        AdvancedMathOps adv = new AdvancedMathOps();

	        System.out.println("---- Overloading (Compile-time) ----");
	        base.compute(2, 3);
	        base.compute(2.5, 3.5);
	        base.compute(1, 2, 3);

	        System.out.println("\n---- Overriding (Runtime) ----");
	        ref.compute(2.5, 3.5); 

	        System.out.println("\n---- Additional Overloading ----");
	        adv.compute(5); 
	    }
	}