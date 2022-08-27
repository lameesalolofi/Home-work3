import java.util.Scanner;

public class Hw3 {
    public static void main(String[] args) {
        System.out.println(" enter integer number: ");
        Scanner porgeam3 =new Scanner(System.in);
        int number= porgeam3.nextInt();
        if(number<0){
            System.out.println(number +"=" +"negative number");
    } else if (number==0) {
            System.out.println(number +"=" +"zero number");

        } else if (number>0) {
            System.out.println(number +"=" +" positive number");

        }

    }}
