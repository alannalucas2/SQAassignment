package codingStandards;

import java.util.Scanner;



public class Employee {
	
	private String name;
	private int duration; //in months  
	
	
	
	public Employee() {
		
	}
	
	
	public Employee(String name, String address, int age, int duration) {
		this.name = name;
		this.duration = duration;
	}
	
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		
		String name = "";
		int duration = 0;
		
		
		System.out.println("What is your name?");
	    name = scanner.nextLine();
	    
	    System.out.println("How long have you been working in this company?");
	    duration = scanner.nextInt();
		
		
		/*
		 * This comment is to demonstrate how we use comments in this company. 
		 * if you have a comment to write that is long and similar to paraghraph form,
		 * Split it up like i have done here. single line comments can be done as 
		 * demonstrated below and above at variables. 
		 */
	    
	    
	    
	    //this is the format we use for an if/else statement
		if (duration >= 12) {
			
			//line over 2 lines to be inside the character limit
			System.out.println("Thank you " + name + ", " + duration + 
					" is a long time, we appreciate your work for us!");
			
		}else {
			System.out.println("Thank you " + name +
					" for joining our company! We hope you have enjoyed your last " 
					+ duration + " months here!");
		}
		
	}
	
	
	
		
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getDuration() {
		return duration;
	}
	
	public void setDuration(int duration) {
		this.duration = duration;
	}
	
	
	
	
	
	
	

}
