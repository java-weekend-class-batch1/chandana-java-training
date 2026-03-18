package com.training.CommandLineArgumentsFunctions;



public class TemperatureConverter {

	    // Conversion methods
	    public double cToF(double c) {
	        return (c * 9 / 5) + 32;
	    }

	    public double fToC(double f) {
	        return (f - 32) * 5 / 9;
	    }

	    public double cToK(double c) {
	        return c + 273.15;
	    }

	    public double kToC(double k) {
	        return k - 273.15;
	    }

	    public double fToK(double f) {
	        return cToK(fToC(f));
	    }

	    public double kToF(double k) {
	        return cToF(kToC(k));
	    }

	    public static void main(String[] args) {

	        // Validate arguments
	        if (args.length != 2) {
	            System.out.println("Usage: java TempConverter --c2f 100");
	            return;
	        }

	        String flag = args[0];
	        double value;

	        try {
	            value = Double.parseDouble(args[1]);
	        } catch (NumberFormatException e) {
	            System.out.println("Invalid number!");
	            return;
	        }
	        TemperatureConverter tc = new TemperatureConverter();
	        double result;

	        switch (flag) {
	            case "--c2f":
	                result = tc.cToF(value);
	                System.out.printf("%.0f°C = %.0f°F%n", value, result);
	                break;

	            case "--f2c":
	                result = tc.fToC(value);
	                System.out.printf("%.0f°F = %.0f°C%n", value, result);
	                break;

	            case "--c2k":
	                result = tc.cToK(value);
	                System.out.printf("%.0f°C = %.2fK%n", value, result);
	                break;

	            case "--k2c":
	                result = tc.kToC(value);
	                System.out.printf("%.2fK = %.2f°C%n", value, result);
	                break;

	            case "--f2k":
	                result = tc.fToK(value);
	                System.out.printf("%.0f°F = %.2fK%n", value, result);
	                break;

	            case "--k2f":
	                result = tc.kToF(value);
	                System.out.printf("%.2fK = %.0f°F%n", value, result);
	                break;

	            default:
	                System.out.println("Invalid flag!");
	                System.out.println("Valid flags: --c2f, --f2c, --c2k, --k2c, --f2k, --k2f");
	        }
	    }
		}