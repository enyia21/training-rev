package main;
import java.util.Scanner;
public class Converter {
    public static void printMenuSelection(){
        System.out.println("Please select an option: ");
        System.out.println("1. Cups To Teaspoons");
        System.out.println("2. Miles to Kilometers");
        System.out.println("3. US Gallons to Imperial Gallons");
        System.out.println("4. Quit");
    }

    public static void convertCupsToTeaspoons(int cups) {
		int teaspoons = cups * 48;
		System.out.println("There are " + teaspoons + " teaspoons in " + cups + " cup(s)");
	}
	
	public static void milesToKilometers(int miles) {
		double km = (double)miles * 1.60934;
		System.out.println("There are " + km + " kilometers in " + miles + " mile(s)");
	}
	
	public static void gallonsToImperialGallons(int gallons) {
		double imperialGallons = (double)gallons * 0.832674;
		System.out.println("There are " + imperialGallons + " imperial gallon(s) in " + gallons + " gallons(s)");
    }
    public static void main(String[] args){
        int menuSelection = 0;
        int cups;
        int miles;
        int gallons;

        Scanner userInput = new Scanner(System.in);
        while (menuSelection != 4) {
            Converter.printMenuSelection();
            menuSelection = userInput.nextInt();
            switch (menuSelection){
                case 1:
                System.out.print("Enter cups: ");
                cups = userInput.nextInt();
                Converter.convertCupsToTeaspoons(cups);
                break;
                case 2: 
                System.out.print("Enter miles: ");
                miles = userInput.nextInt();
                Converter.milesToKilometers(miles);
                break;
                case 3:
                System.out.print("Enter gallons? ");
                gallons = userInput.nextInt();
                Converter.gallonsToImperialGallons(gallons);
                break;
            }
        }
        userInput.close();
    }
}
