package Lab11;
import java.util.Scanner;
public class Businessexample {
	static double totalgross=0,totalprice=0;
	static Scanner read=new Scanner(System.in);
	public static void main(String[]args) {
		
		System.out.println("\t\t*******************************");
		System.out.println("\t\tEnter 0 to stop the programme");
		System.out.println("\t\t*******************************");
		System.out.println();
		System.out.println("\t\t --------------------");
		System.out.println("\t\t|PACKAGE CODE 1=RM50 |");
		System.out.println("\t\t|PACKAGE CODE 2=RM100|");
		System.out.println("\t\t|PACKAGE CODE 3=RM200|");
		System.out.println("\t\t --------------------");
		System.out.println();
		
		System.out.print("Enter package code: ");
		int code=read.nextInt();
		double price = 0,donation=0;
		int totalpack=0;
		int quantity;
		//int totalpackage=0;
		
		//using while statement to stop the loop 
		while(code!=0) {
			if(code<4) {
			quantity=inputQuantity(code);
			totalpack=calcTotalPackage(quantity,totalpack); //invoke method 
			//using if statement to determine the package code  
			if(code==1) {
				price=50*quantity; //calculate price
			}
			else if (code==2) {
				price=100*quantity; //calculate price
			}
			else if(code==3) {
				price=200*quantity; //calculate price
			}
			}
			else {
				System.out.println("Invalid package");
				quantity=0;
				price=0;
			}
			totalprice=totalprice+price;
			double totalgross=calcGrossSaleAllPackage(price,totalprice);
			
			System.out.println();
			System.out.print("Enter package code: ");
			code=read.nextInt();
		}
		System.out.println("PROGRAMME HAS STOP");
			if(totalgross>100000) {
				donation=0.15;
			}
			else if(totalgross>10000) {
				donation=0.10;
			}
			else if(totalgross>1000) {
				donation=0.05;
			}
			double donate=calcDonation(totalgross,donation);
			double nett=calcNetSale(totalgross,donate);
			
		
		printInformation(totalpack,totalgross,donate,nett);
		
	}
	//method to read input quantity 
	public static int inputQuantity(int packageCode) {
		System.out.print("Enter quantity of the package " +packageCode+": ");
		int quantity=read.nextInt();//input statement
		return quantity;
	}
	//method to calculate calculate Total package
	public static int calcTotalPackage(int quantity,int totalPackage) {
		totalPackage=quantity+totalPackage;
		return totalPackage;
	}
	//method to calculate gross 
	public static double calcGrossSaleAllPackage(double totalprice,double totalGrossSaleAllPackage) {
		totalgross=totalgross+totalprice;
		return totalgross;
	}
	//methd to calculate donation based on gross sale 
	public static double calcDonation(double totalGrossSaleAllPackage, double donation) {
		double donate=totalGrossSaleAllPackage*donation;
		return donate;
	}
	//method to calculate nett sale
	public static double calcNetSale(double totalGrossSaleAllPackage, double donation) {
		double nettsale=totalGrossSaleAllPackage-donation;
		return nettsale;
	}
	//method to print output
	public static void printInformation(int totalPackage,double totalGrossSaleAllPackage,double donation,double nettsale) {
		System.out.println("---------------------------------------------");
		System.out.printf("Total package:%d",totalPackage);
		System.out.printf("\nTotal gross sales of all packages:RM%.2f",totalGrossSaleAllPackage);
		System.out.printf("\nTotal donation:RM%.2f",donation);
		System.out.printf("\nNett sale:RM%.2f", nettsale);
	}

}