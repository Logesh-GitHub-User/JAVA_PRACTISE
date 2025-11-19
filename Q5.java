import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Year: ");
        int year = scanner.nextInt();
        
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("\n"+year+" is a Leap year.");
        }
        else{
            System.out.println("\n"+year+" is NOT a Leap year.");
        }
        scanner.close();
    }
}
