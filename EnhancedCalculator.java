import java.util.Scanner;

public class EnhancedCalculator {
    // Basic Arithmetic Methods
    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
        return a / b;
    }

    // Scientific Calculations
    public static double squareRoot(double a) {
        if (a < 0) {
            System.out.println("Error: Negative input for square root.");
            return 0;
        }
        return Math.sqrt(a);
    }

    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Unit Conversions: Temperature
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    // Unit Conversions: Currency (example: USD to INR)
    public static double usdToInr(double usd) {
        double conversionRate = 83.0;  // Example rate
        return usd * conversionRate;
    }

    public static double inrToUsd(double inr) {
        double conversionRate = 83.0;  // Example rate
        return inr / conversionRate;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enhanced Console-based Calculator");
        boolean keepRunning = true;
        
        while (keepRunning) {
            System.out.println("\nSelect an option:");
            System.out.println("1: Basic Arithmetic");
            System.out.println("2: Scientific Calculations");
            System.out.println("3: Unit Conversions");
            System.out.println("4: Exit");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter two numbers:");
                    double num1 = sc.nextDouble();
                    double num2 = sc.nextDouble();
                    
                    System.out.println("Select operation: 1:Add, 2:Subtract, 3:Multiply, 4:Divide");
                    int operation = sc.nextInt();

                    switch (operation) {
                        case 1: System.out.println("Result: " + add(num1, num2)); break;
                        case 2: System.out.println("Result: " + subtract(num1, num2)); break;
                        case 3: System.out.println("Result: " + multiply(num1, num2)); break;
                        case 4: System.out.println("Result: " + divide(num1, num2)); break;
                        default: System.out.println("Invalid operation.");
                    }
                    break;

                case 2:
                    System.out.println("Select operation: 1:Square Root, 2:Power");
                    int sciChoice = sc.nextInt();
                    if (sciChoice == 1) {
                        System.out.println("Enter the number:");
                        double num = sc.nextDouble();
                        System.out.println("Result: " + squareRoot(num));
                    } else if (sciChoice == 2) {
                        System.out.println("Enter base and exponent:");
                        double base = sc.nextDouble();
                        double exponent = sc.nextDouble();
                        System.out.println("Result: " + power(base, exponent));
                    } else {
                        System.out.println("Invalid operation.");
                    }
                    break;

                case 3:
                    System.out.println("Select conversion: 1: C to F, 2: F to C, 3: USD to INR, 4: INR to USD");
                    int convChoice = sc.nextInt();
                    switch (convChoice) {
                        case 1: 
                            System.out.println("Enter Celsius:");
                            double celsius = sc.nextDouble();
                            System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                            break;
                        case 2: 
                            System.out.println("Enter Fahrenheit:");
                            double fahrenheit = sc.nextDouble();
                            System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
                            break;
                        case 3: 
                            System.out.println("Enter USD:");
                            double usd = sc.nextDouble();
                            System.out.println("INR: " + usdToInr(usd));
                            break;
                        case 4: 
                            System.out.println("Enter INR:");
                            double inr = sc.nextDouble();
                            System.out.println("USD: " + inrToUsd(inr));
                            break;
                        default: System.out.println("Invalid conversion.");
                    }
                    break;

                case 4:
                    keepRunning = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}
