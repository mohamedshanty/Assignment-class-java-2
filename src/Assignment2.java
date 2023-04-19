import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        /*Write a Java program to find the sum of first 10 natural
        numbers like: 1,2,3,4,5,6,7,8,9,10*/
        /*int sum = 0;
        for (int i = 0; i <10 ; i++){
            sum += i;
            sum++;
        }
        System.out.println("The sum of first 10 natural numbers is: "+sum);*/



        /*Write a program in Java to display n terms of natural
        number and their sum */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.print("The first " + number + " natural numbers are: ");
        int sum = 0;
        for (int i = 1; i <=number; i++){
            System.out.print(i+"");
            sum += i;
        }
        System.out.println("\nThe sum of the first " + number +" natural numbers is: " + sum);
    }
}
