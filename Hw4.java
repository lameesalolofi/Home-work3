import java.util.Scanner;

public class Hw4 {
    public static void main(String[] args) {
        System.out.println("enter number");
        Scanner porgeam4=new Scanner(System.in);
        int number = porgeam4.nextInt();
        if(number <0){
            number =number*-1;
        }
        if(number>=0&&number<=9){
            System.out.println("the digis of number "+ number + " is 1");
        } else if (number>=10&& number<=99) {
            System.out.println("the digis of number "+ number + " is 2");

        }else if (number>=100&& number<=999) {
            System.out.println("the digis of number "+ number + " is 3");

        }else if (number>=1000&& number<=9999) {
            System.out.println("the digis of number "+ number + " is 4");

        }else if (number>=10000&& number<=99999) {
            System.out.println("the digis of number "+ number + " is 5");

        }else if (number>=100000&& number<=999999) {
            System.out.println("the digis of number "+ number + " is 6");

        }
        else if (number>=1000000&& number<=9999999) {
            System.out.println("the digis of number "+ number + " is 7");

        }else if (number>=10000000&& number<=99999999) {
            System.out.println("the digis of number "+ number + " is 8");

        }else if (number>=100000000&& number<=999999999) {
            System.out.println("the digis of number "+ number + " is 9");

        }else{
            System.out.println("eroo");
        }

    }
}
