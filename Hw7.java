import java.util.Scanner;

public class Hw7 {
    public static void main(String[] args) {
        Scanner porgeam6=new Scanner(System.in);
        System.out.println("enter number intgier");
        System.out.println("enter number1:");
        int number1= porgeam6.nextInt();
        System.out.println("enter number2:");
        int number2= porgeam6.nextInt();
        System.out.println("enter number3:");
        int number3= porgeam6.nextInt();
        System.out.println(number1+number2+number3);
        if (number1>=number2 && number2>=number3 || number1<=number2 && number2<=number3){
            System.out.println("in order");
        }
        else {
            System.out.println("not in order");
        }
    }
}
