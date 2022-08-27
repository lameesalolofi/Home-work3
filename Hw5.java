import java.util.Scanner;

public class Hw5 {
    public static void main(String[] args) {
        Scanner porgeam5=new Scanner(System.in);
        System.out.println("enter number intgier");
        System.out.println("enter number1:");
        int number1= porgeam5.nextInt();
        System.out.println("enter number2:");
        int number2= porgeam5.nextInt();
        System.out.println("enter number3:");
        int number3= porgeam5.nextInt();
        System.out.println(number1+number2+number3);
        if(number2==number3 && number1==number3){
            System.out.println("all the same");
        } else if (number1!=number2 &&number2!=number3 && number1!=number3) {
            System.out.println("all different");

        }
        else {
            System.out.println("neither");
        }
    }
}
