import java.util.Scanner;

public class Lab04
{
  public static void main (String [] args)
  {
    int pens;
    int notebooks;
    Scanner stdIn = new Scanner(System.in);
    
    System.out.println("Welcome to Office Min");
    
    System.out.print("How many pens: ");
    pens = stdIn.nextInt();
    
    System.out.print("How many notebooks: ");
    notebooks = stdIn.nextInt();
    
    System.out.println("Thank you, your bill is as follows . . . .");
    
    double penCost = pens * .5;
    double noteCost = notebooks * 1.0;
    
    System.out.println("Pens: $"+ penCost);
    System.out.println("Notebooks: $"+ noteCost);
    
    System.out.println("Subtotal: $"+ (penCost+noteCost));
    
    double salesTax = (penCost+noteCost) * .055;
    System.out.println("Sales tax: $"+ salesTax);
    System.out.println("Grand-Total: $"+ (penCost + noteCost + salesTax));
    
  }
}
