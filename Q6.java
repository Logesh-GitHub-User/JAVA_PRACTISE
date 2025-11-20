//Unchecked Version
import java.util.Scanner;
import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number to check if it is Prime: ");
        String num = scanner.nextLine();
        
        String rev = "";
        for(int i=num.length()-1;i>=0;i--){
            rev+=num.charAt(i);
        }
        
        int number = Integer.parseInt(num);
        int reverse = Integer.parseInt(rev);
        
        int count = 0;
        for(int j=2;j<(int)Math.sqrt(number);j++){
            if(number%j==0) count++;
            if(reverse%j==0) count++;
        }
        
        if(count==0){
            System.out.println("\n"+number+" and "+reverse+" are both Prime.");
        }
        else{
            System.out.println("\n"+number+" and "+reverse+" are both NOT Prime.");
        }
        scanner.close();
    }
}
