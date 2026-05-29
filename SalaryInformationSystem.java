import java.util.*;
class SalaryInformationSystem{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("|\t\tSALARY INFORMATION SYSTEM               |");
		System.out.println("---------------------------------------------------------\n");
		
		System.out.println("\t\t[1] Calculate Income Tax");
		System.out.println("\t\t[2] Calculate Annual Bonus");
		System.out.println("\t\t[3] Calculate Loan Amount\n");
		
		System.out.print("Enter an option to continue > ");
		int option = input.nextInt();
		
		double salary;
		double monthlyTax;
		double bonus;
		double annualInterestRate =0.15;
		double monthlyInstallment;
		double loanAmount;
		int year;
		
		switch(option){
			case 1:
				System.out.println("---------------------------------------------------------");
				System.out.println("|\t\tCalculate Income Tax                    |");
				System.out.println("---------------------------------------------------------\n");
				System.out.print("Input Employee name - ");
				String name = input.nextLine();
				input.nextLine();
				
				System.out.print("Input Employee salary - ");
				salary = input.nextDouble();
				
				//Calculate monthly income tax
				if(salary <= 100000){
					System.out.println("No tax include for this income: "+ salary);
					monthlyTax =0;
					System.out.println("You have to pay Income Tax per month: "+ monthlyTax);
				}else if(salary <=141667){
					monthlyTax = (salary-100000) * 0.06;
					
				}else if(salary <= 183333){
					monthlyTax = 41667 * 0.06 + (salary-141667)*0.12;
					
				}else if(salary <= 225000){
					monthlyTax = 41667*(0.06+0.12) + (salary-183333)*0.18;
					
				}else if(salary <= 266667){
					monthlyTax = 41667*(0.06+0.12+0.18) + (salary-225000)*0.24;
					
				}else if (salary <= 308333){
					monthlyTax = 41667*(0.06+0.12+0.18+0.24) + (salary-266667)*0.30;
					
				}else{
					monthlyTax = 41667*(0.06+0.12+0.18+0.24+0.30) + (salary-308333)*0.36;
					
				}
				if(salary > 100000){
					System.out.println("\nYou have to pay Income Tax per month: "+(int)(monthlyTax));
				}
				break;
				
			case 2:
				System.out.println("---------------------------------------------------------");
				System.out.println("|\t\tCalculate Annual Bonus                  |");
				System.out.println("---------------------------------------------------------\n");
				
				System.out.print("Input Employee name - ");
				name = input.nextLine();
				input.nextLine();
				
				System.out.print("Input Employee salary - ");
				salary = input.nextDouble();
				
				//Calculate Anual Bonus
				if(salary < 100000){
					bonus = 5000;
				}else if(salary < 200000){
					bonus = salary *0.10;
				}else if(salary < 300000){
					bonus = salary *0.15;
				}else if(salary < 400000){
					bonus = salary *0.20;
				}else{
					bonus = salary *0.35;
				}
				
				System.out.println("\nAnnual bonus	- "+ bonus);
				
				break;
				
			case 3:
				System.out.println("---------------------------------------------------------");
				System.out.println("|\t\tCalculate Loan amount                   |");
				System.out.println("---------------------------------------------------------\n");
				
				System.out.print("Input Employee name - ");
				name = input.nextLine();
				input.nextLine();
				
				System.out.print("Input Employee salary - ");
				salary = input.nextDouble();
				
				//calculate loan amount
				monthlyInstallment = salary * 0.60;
				if(salary > 50000){
					System.out.print("Enter number of year: ");
					year = input.nextInt();
					
					if(year <= 5){
						int n = year *12;
						loanAmount = monthlyInstallment *(1 - (1/Math.pow((1+(annualInterestRate/12)),n)))/(annualInterestRate/12);	
						
						double roundAmount = Math.round(loanAmount/1000.0)*1000;
						
						System.out.println("\nYou can get Loan Amount : "+ roundAmount);
					}else{
						System.out.println("You cannot get loan for more than 5 years");
					}
				}else{
					System.out.println("\tYou can not get a loan because your salary less than Rs. 50 000...");
				}
				
				break;
				
			default: 
				System.out.println("Invalid Option. Please input 1,2,or 3 options.");
		}
		
	}
}

