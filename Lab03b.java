import java.util.Scanner;

// <name>
// <login>
// CS 201 <section>
// Lab Exercise 3 part b
// This program is designed to take a Celsius temperature as input
// and output the equivalent Fahrenheit temperature.
// import the Scanner class
public class Lab03b
{
  public static void main(String[] args)
  {
    double celsius;
    double fahrenheit;
    
    Scanner stdIn = new Scanner(System.in);
    
    System.out.print("Enter temperature (degrees Celsius): ");
    celsius = stdIn.nextDouble();
    
    fahrenheit = 9.0 / 5 * celsius + 32;
    
    System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    // Create an input scanner for keyboard
    // Declare celsius variable
    // Prompt for temperature in degrees Celsius.
    // Get the Celsius value from the user
    // Declare fahrenheit variable
    // Convert the Celsius temperature to Fahrenheit.
    // Output the results of the conversion in this format:
    // "<celsius> degrees Celsius is equal to <fahrenheit> degrees Fahrenheit."
    // The values in <> are the value entered and the converted value.
    // Close the input scanner
  }
}
