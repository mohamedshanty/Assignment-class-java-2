import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args){
        /* 1- Write a Java program to find the sum of first 10 natural
        numbers like: 1,2,3,4,5,6,7,8,9,10*/
        /*int sum = 0;
        for (int i = 0; i <10 ; i++){
            sum += i;
            sum++;
        }
        System.out.println("The sum of first 10 natural numbers is: "+sum);*/



        /* 2- Write a program in Java to display n terms of natural
        number and their sum */
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        System.out.print("The first " + number + " natural numbers are: ");
        int sum = 0;
        for (int i = 1; i <=number; i++){
            System.out.print(i+"");
            sum += i;
        }
        System.out.println("\nThe sum of the first " + number +" natural numbers is: " + sum);*/



        /* 3- Write a program in Java to display the cube of the
        number up to given an integer*/
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        for (int i =1 ; i<= number ; i++){
            System.out.printf("number%d: ",i);
            int a = i * i * i ;
            System.out.print(a);
            System.out.println("");
        }*/



        // function question 4
        multiplication();
    }

    // function
    /* 4- Write a Function in Java to display the multiplication
    table vertically from 1 to n*/
    public static int multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        for (int i = 1 ; i<= number ; i++){
            System.out.printf("1 * %d=%d",i,i);
            System.out.println("");
        }
        return number;
    }
}
