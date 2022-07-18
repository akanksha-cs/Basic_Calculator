package BasicCalaclutor;
import java.util.Scanner;
class Cal{
	 int a,b;
	 char op;
	 
	 Cal(int a , int b){
		 this.a=a;
		 this.b=b;
		 
	 }
	 
	 int add() {
		 return a+b;
	 }
	 
	 int sub() {
		 return a-b;
	 }
	 
	 int mul() {
		 return a*b;
	 }
	 
	 int div() {
		 return a/b;
	 }
	 
}
public class calculator {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter first number : ");
		int a=sc.nextInt();
		
		System.out.print("Enter second number : ");
		int b=sc.nextInt();
		
		System.out.print("Enter any Operator from +, - , /, * : ");
		//char op = sc.next().charAt(0);
		String op=sc.next();
		
		int c=0;
		
		sc.close();
		
		Cal obj=new Cal(a,b);
		
		switch(op){

	   
	      case "+" :c = a+b;
	        System.out.println(a + " + " + b + " = " + c);
	        break;

	      
	      case "-":
	        c = a - b;
	        System.out.println(a + " - " + b + " = " + c);
	        break;

	        
	      case "*":
		        c = a * b;
		        System.out.println(a + " * " + b + " = " + c);
		        break;

	      
	      case "/":
	    	  c = a / b;
		      System.out.println(a + " / " + b + " = " + c);
		      break;

	      default:
	        System.out.println("Invalid operator!");
	    }
		
	    
	  }
}
