package Program_1.java;

import java.util.Scanner;
public class SimpleCalculator {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter A: ");
 double num1 = scanner.nextDouble();
 System.out.print("Enter B: ");
 double num2 = scanner.nextDouble();
 System.out.print("Enter operation (+, -, *, /): ");
 char operation = scanner.next().charAt(0);
 double result;
 switch (operation) {
 case '+': result = num1 + num2; break;
 case '-': result = num1 - num2; break;
 case '*': result = num1 * num2; break;
 case '/': result = num1 / num2; break;
 default: throw new IllegalArgumentException("Invalid operation");
 }
 System.out.println("Result: " + result);
 }
}