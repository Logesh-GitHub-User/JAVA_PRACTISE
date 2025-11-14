import java.util.Scanner;

public class Q1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Line: ");
        String s = scanner.nextLine();
        
        int upper=0;
        int lower=0;
        int digits=0;
        int spaces=0;
        
        for(int i=0;i<s.length();i++){
            if((char)s.charAt(i) == 32){
                spaces++;
            }
            else if((char)s.charAt(i)>=48 && (char)s.charAt(i)<=57){
                digits++;
            }
            else if((char)s.charAt(i) >= 65 && (char)s.charAt(i) <= 90){
                upper++;
            }
            else if((char)s.charAt(i) >= 97 && (char)s.charAt(i) <= 122){
                lower++;
            }
        }
        
        System.out.println("\nAccording to your string input: ");
        System.out.println("Upper case characters : "+upper);
        System.out.println("Lower case characters : "+lower);
        System.out.println("Space characters      : "+spaces);
        System.out.println("Digit characters      : "+digits);
        
        scanner.close();
    }
}
