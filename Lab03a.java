// <name>
// <login>
// CS 201 <section>
// Lab Exercise 3 part a
// This program is designed to take a Fahrenheit temperature as input
// and output the equivalent Celsius temperature.
// import the Scanner class
import java.util.Scanner;
public class Lab03a
{
  public static void main(String[] args)
  {
    // Create an input scanner for keyboard
    Scanner stdIn = new Scanner(System.in);
    // Declare fahrenheit variable
    double fahrenheit;
    double celsius;
    
    // Prompt for temperature in degrees Fahrenheit.
    System.out.print("Enter temperature (degrees Fahrenheit): ");
    // Get the fahrenheit value from the user
    fahrenheit = stdIn.nextDouble();
    celsius = (fahrenheit -32) * 5.0 / 9;
    
    System.out.println(fahrenheit + " degrees Fahrenheit is equals to " + celsius + " degrees Celsius.");
    // Declare celsius variable
    // Convert the Fahrenheit temperature to Celsius.
    // Output the results of the conversion in this format:
    // "<fahrenheit> degrees Fahrenheit is equal to <celsius> degrees Celsius."
    // The values in <> are the value entered and the converted value.
    // Close the input scanner
    stdIn.close();
  }
}
