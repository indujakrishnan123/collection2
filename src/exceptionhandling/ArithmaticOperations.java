package exceptionhandling;

public class ArithmaticOperations {
public static int a=10;
public static int b=0; 
	public static void main(String[] args) {
	System.out.print("addition is"+(a+b));
	System.out.print("sub is"+(a-b));
	
	try {
	System.out.print("multiplicat is"+(a/b));
	}
	catch(ArithmeticException ex) {
		System.out.print(ex.getMessage());
		ex.printStackTrace();
	}
finally {
	System.out.print("hlw");
}
}}
