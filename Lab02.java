/*
 *
 * Purpose: This program computes the y-coordinate of a point on
 * a line given its slope and y-intercept, and an x-coordinate.
 *
 * By removing a ’;’, at compilation the following happened.
 * <your description of what happens> it gives a compilation error
 * <your description (continued if necessary)>
 * <your description (continued if necessary)>
 *
 * By substituting ’m / x’ for ’m * x’, the following happened.
 * <your description of what happens> it changes from multiplication to division
 * <your description (continued if necessary)>
 * <your description (continued if necessary)>
 *
 * By removing a double quote,
 * the following happened.
 * <your description of what happens> it gives a complication error
 * <your description (continued if necessary)>
 * <your description (continued if necessary)>
 */
public class Lab02
{
  public static void main(String[] args)
  {
    // m is the line’s slope
    double m = 0.6667; // Line slope
    // b is the line’s y-intercept
    double b = 2.0; // y-intercept
    // x is the x-coordinate of the point of interest
    double x = 7.0; // x-coordinate of the point interest
    // Compute the y-coordinate of the point of interest
    double y; // y is the y-coordinate of the point of interest
    y = m * x + b;
    // Display y-coordinate=
    System.out.print("y = ");
    System.out.print(y);
    System.out.print(" when m = ");
    System.out.print(m);
    System.out.print(", ");
    System.out.print("b = ");
    System.out.print(b);
    System.out.print(" and x = ");
    System.out.println(x);
  }
}