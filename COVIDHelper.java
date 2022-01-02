import java.util.Scanner;

public class COVIDHelper{
    public static void main(String[] args){
        // Create Scanner for user input
        Scanner scan = new Scanner(System.in);
    
        // Create variables
        double celsiusTemp, fahrenheitTemp, fahrenheit_to_celsius, celsius_to_fahrenheit;
        int riskLevel = 0;
        String question1, question2, unitChoice;
        
        // Ask user if they want to use Celsius or Fahrenheit
        System.out.print("Welcome to the COVID-19 Helper! Would you like to use Celsius or Fahrenheit? (C for Celsius and F for Fahrenheit): ");
        unitChoice = scan.nextLine();
      
             
        // Create if statements for users to enter their temperature and decide if they have a fever
        if (unitChoice.equals("C")){
            System.out.print("Enter your last recorded body temperature (in Celsius): ");
            celsiusTemp = scan.nextDouble();
            if (celsiusTemp > 37.0){
                riskLevel += 1;
                System.out.println("You have a fever!");
                System.out.printf("Your temperature in Celsius is: %.1f \n", celsiusTemp);
                // Print the users temperature in Fahrenheit 
                celsius_to_fahrenheit = (celsiusTemp * 1.8) + 32;
                System.out.printf("Your temperature in Fahrenheit is: %.1f \n", celsius_to_fahrenheit);                
            }
            else{
                System.out.println("You do not have a fever!");
                System.out.printf("Your temperature in Celsius is: %.1f \n", celsiusTemp);
                // Print the users temperature in Fahrenheit
                celsius_to_fahrenheit = (celsiusTemp * 1.8) + 32;
                System.out.printf("Your temperature in Fahrenheit is: %.1f \n", celsius_to_fahrenheit);
            }
        }
        else if (unitChoice.equals("F")){
            System.out.print("Enter your last recorded body temperature (in Fahrenheit): ");
            fahrenheitTemp = scan.nextDouble();
            if (fahrenheitTemp > 98.6){
                riskLevel += 1;
                System.out.println("You have a fever!");
                System.out.printf("You temperature in Fahrenheit is: %.1f \n", fahrenheitTemp);
                // Print the users temperature in Celsius
                fahrenheit_to_celsius = (fahrenheitTemp - 32) / 1.8;
                System.out.printf("Your temperature in Celsius is: %.1f \n", fahrenheit_to_celsius);
            }
            else{
                System.out.println("You do not have a fever!");
                System.out.printf("You temperature in Fahrenheit is: %.1f \n", fahrenheitTemp);
                // Print the users temperature in Celsius
                fahrenheit_to_celsius = (fahrenheitTemp - 32) / 1.8;
                System.out.printf("Your temperature in Celsius is: %.1f \n", fahrenheit_to_celsius);
            }
        }
        
        // Create if statement for question 1
        System.out.print("Are you experiencing any body aches or cough? (Y for Yes and N for No): ");
        question1 = scan.next();
        if (question1.equals("Y")){
            riskLevel += 1;
        }
        else if (question1.equals("N"))
            riskLevel = riskLevel;
        
        // Create if statement for question 2
        System.out.print("Have you recently came into contact with someone who has tested positive for COVID-19? (Y for Yes and N for No): ");
        question2 = scan.next();
        if (question2.equals("Y")){
            riskLevel += 1;
        }
        else if (question2.equals("N")){
            riskLevel = riskLevel;
        }
        
        // Calculate risk factor and determine if user is ok or needs to contact local health dept.
        if (riskLevel < 1){
            System.out.println("You are not at risk for COVID-19.");
            System.out.println("\t------------------------------");
            System.out.println("\t| COVID-19 Safety Guidelines |");
            System.out.println("\t------------------------------");
            System.out.println("1. Wash your hands often.");
            System.out.println("2. Avoid close contact.");
            System.out.println("3. Wear a mask.");
            System.out.println("4. Cover coughs and sneezes.");
            System.out.println("5. Clean and disinfect frequently touched surfaces.");
            System.out.println("6. Monitor your health daily.");
            
        }
        else{
        System.out.println("You may be at risk for COVID-19 it is recommended that you contact your local health department.");
        }      
 }
} 
