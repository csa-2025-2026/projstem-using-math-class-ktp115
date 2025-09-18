import java.util.Scanner;    // optional to use user input
 
public class Main
{
    public static void main(String[] args)
    {
        // You can optionally use the Scanner for user input
        Scanner scan = new Scanner(System.in);
        //1
        int N;
        System.out.println("Enter a positive integer: ");
        N = scan.nextInt();
        printRandom3(N);
        //2
        double x1;
        double x2;
        double y1;
        double y2;

        System.out.println("Enter the first x-coordinate: ");
        x1 = scan.nextDouble();
        System.out.println("Enter the second x-coordinate: ");
        x2 = scan.nextDouble();
        System.out.println("Enter the first y-coordinate: ");
        y1 = scan.nextDouble();
        System.out.println("Enter the second y-coordinate: ");
        y2 = scan.nextDouble();

        System.out.println("Slope: " + calcSlope(x1, x2, y1, y2););

    }
    
    public static void printRandom3(int num)
    {
        //random whole num between a and b 
        //(int)(Math.random()* (b-a+1)+a)
        int lowerBound = 2;
        int upperBound = num + 2;
        System.out.println("Numbers: ");
        System.out.println((int) (Math.random() * (upperBound - lowerBound + 1)+ lowerBound));
        System.out.println((int) (Math.random() * (upperBound - lowerBound + 1)+ lowerBound));
        System.out.println((int) (Math.random() * (upperBound - lowerBound + 1)+ lowerBound));

    }
    
    public static double calcSlope(double x1, double x2, double y1, double y2)
    {
        double result = ((y2 - y1)/(x2 - x1));
        return result;
    }
    
    public static int roundedDist(double a, double b)
    {
        double dist = Math.abs(b - a);
		int rounded = (int) (dist + 0.5);
        return rounded;
    }
}
