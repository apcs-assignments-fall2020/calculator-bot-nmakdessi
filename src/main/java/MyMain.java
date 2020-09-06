import java.net.SocketTimeoutException;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class MyMain {

    // Calculates the median of the three inputs
    public static int median(int a, int b, int c) {
        if(a > b && b > c){
            return b;
        }
        else if(b>a && a>c){
            return a;
        }
        else if(a>c && c>b){
            return c;
        }
        else if(a < b && b < c){
            return b;
        }
        else if(b < a && a < c){
            return a;
        }
        else if(a < c && c < b){
            return c;
        }
        else{
            return a;
        }
// not sure what to do if they are equal numbers
    }

    // Returns the input with the larger absolute value
    public static int magnitude(int a, int b) {
        if (Math.abs(a) > Math.abs(b) ) { 
            return a; 
        }
        else {
            return b; 
        }
    }

    
    public static double pythagoras(int a, int b) {
        return Math.sqrt((a*a) + (b*b));
    }

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("which program would you like to run?");
        String method = scan.nextLine();
        if (method.equalsIgnoreCase("median")){
            System.out.println("what is the first number?");
            int a = scan.nextInt();
            System.out.println("what is the second number?");
            int b = scan.nextInt();
            System.out.println("what is the third number?");
            int c = scan.nextInt();
            System.out.println("The median is " + median(a, b, c));
        }
        else if (method.equalsIgnoreCase("magnitude")){
            System.out.println("What is the first number?");
            int a = scan.nextInt();
            System.out.println("What is the second number?");
            int b = scan.nextInt();
            System.out.println("The larger absolute value is " + magnitude(a, b));
        }
        else if (method.equalsIgnoreCase("pythagoras")){
            System.out.println("What is the first number?");
            int a = scan.nextInt();
            System.out.println("What is the second number?");
            int b = scan.nextInt();
            System.out.println("The larger absolute value is " + pythagoras(a, b));
        }
        else{
            System.out.println("Command not recognized");
        }
        scan.close();
    }

}
