import java.util.Scanner;
import java.util.*;

public class CircleCal {
 private static final double PI = 3.14;
 private final double radius;
 public CircleCal(double radius) {
 this.radius = radius;
 }
 
 public double CircleLen() {
	 return 2 * Math.PI * radius;
 }
 
 public double CircleAr() {
	 return Math.PI * radius * radius;
 }
 
 public double CircleC() {
	 double b;
	 b = Math.PI * 2 * radius;
	 return b;
 }
 
 
 public static void main(String[] args) {
 System.out.println("------------------------------------------------------------");
 System.out.println("CircleCalc v1.0");
 System.out.println();
 System.out.println("Calculates and prints information for a user-supplied radius");
 System.out.println("------------------------------------------------------------");
 System.out.print("Enter the circle's radius: ");
 Scanner in = new Scanner(System.in);
 CircleCal c = new CircleCal(in.nextFloat());
 // TODO: compute and print the circumference and area of the circle
 System.out.println("Length of Circle is: ");
 System.out.printf("%.2f\n", c.CircleLen());
 System.out.println("Area of Circle is: ");
 System.out.printf("%.2f\n", c.CircleAr());
  int a = 5, b = 2, d = 6, f = 9, g = 8;
  System.out.println("Test");
  System.out.println("Test");
  System.out.println("Final test");
 }
}
