import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] values = new double[3];
        for(int i=0;i<3;i++){
            System.out.print("Enter Value "+(i+1)+": ");
            values[i] = scanner.nextDouble();
        }
        
        Arrays.sort(values); //This will sort the given array.
    
        System.out.println("Minimum value: "+values[0]);
        System.out.println("Maximum value: "+values[2]);
        System.out.println("\nThe middle value is: "+values[1]); //Element at index 1 will be the middle element.

        scanner.close();
    }
}
