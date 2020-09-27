import java.util.Scanner; 
import java.lang.Math;

public class Calculator{
    public double add(double x, double y){
        return 0.0;
    }

    public double subtract(double x, double y){
        return 0.0;
    }

    public double multiply(double x, double y){
        return 0.0;
    }

    public double divide(double x, double y){
        return 0.0;
    }

    public double squareRoot(double x){
        return 0.0;
    }

    public double power(double x, int power){
        return 0.0;
    }

    public static void main(String args[]){
        Calculator calculator = new Calculator();
        Scanner scan = new Scanner(System.in);
        boolean isRunning = true;

        while(isRunning){
            System.out.print("Please Enter a command: ");
            String line = scan.nextLine();
            String[] input = line.split(" ");

            switch(input[0]){
                case "-a":
                    System.out.print("The sum of " + input[1] + " and " + input[2] + " is: ");
                    System.out.println(calculator.add(Double.parseDouble(input[1]), Double.parseDouble(input[2])));
                    break;
                case "-s":
                    System.out.print("The difference between " + input[1] + " and " + input[2] + " is: ");
                    System.out.println(calculator.subtract(Double.parseDouble(input[1]), Double.parseDouble(input[2])));
                    break;
                case "-m":
                    System.out.print("The product of " + input[1] + " and " + input[2] + " is: ");
                    System.out.println(calculator.multiply(Double.parseDouble(input[1]), Double.parseDouble(input[2])));
                    break;
                case "-d":
                    System.out.print("The quotient of " + input[1] + " and " + input[2] + " is: ");
                    System.out.println(calculator.divide(Double.parseDouble(input[1]), Double.parseDouble(input[2])));
                    break;
                case "-r":
                    System.out.print("The square root of " + input[1] + " is: ");
                    System.out.println(calculator.squareRoot(Double.parseDouble(input[1])));
                    break;
                case "-p":
                    System.out.print(input[1] + " to the power of " + input[2] + " is: ");
                    System.out.println(calculator.power(Double.parseDouble(input[1]), Integer.parseInt(input[2])));
                    break;
                default:
                    isRunning = false;
            }
            System.out.println("");
        }
        scan.close();
    }
}