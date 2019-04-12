package testing;

import java.util.Scanner;

public class Calculator {
	
	private int number1;
	private int number2;
	private int answer;
	
	
	public static void main(String[] args)
    {
		System.out.println("Enter first and second number:");
        Scanner scan = new Scanner(System.in);
        int number1,number2;
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        
        
        
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = scan.nextInt();
        
        
        switch (choose){
        case 1:
            System.out.println(add( number1,number2));
            break;
        case 2:
            System.out.println(subtract( number1,number2));
            break;      
        case 3:
            System.out.println(multiply( number1,number2));
            break;
        case 4:
            System.out.println(divide( number1,number2));
            break;
            default:
                System.out.println("Illigal Operation");


        }
    }



   
	

	public static int add(int number1, int number2) {
		int answer = number1 + number2;
		return answer;
		
	}
	
	public static int subtract(int number1, int number2) {
		int answer = number1 - number2;
		return answer;
		
	}
	
	public static int multiply(int number1, int number2) {
		int answer = number1 * number2;
		return answer;
		
	}
	
	public static int divide(int number1, int number2) {
		int answer = number1 / number2;
		return answer;
		
	}
	
	

}
