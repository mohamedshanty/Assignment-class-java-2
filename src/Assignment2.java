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
        /*multiplication();*/


        // function question 5
        /*sum();*/


        // function question 6
        /*triangle();*/


        // function question 7
        /*Scanner input = new Scanner(System.in);
        int fact;
        System.out.println("Enter your factorial");
        int number = input.nextInt();
        fact = factorial(number);
        System.out.println("Factorial of "+number+" is: "+fact);*/



        // function question 8
        /*reverse();*/



        // function question 9
        /*Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        int absValue = absoluteValue(num);
        System.out.println("Absolute value: " + absValue);*/



        // function question 10
        /*power();*/

        // function question 11
        /*signIn();*/


        /* 12- Write a Java program to print this triangle
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1*/
        /*int n=5;
        for (int i=1; i<=n; i++){
            for (int j=1 ; j<=i; j++){
                if ((i+j)%2 == 0){
                    System.out.print("1");
                }
                else {
                    System.out.print("0");
                }
            }
            System.out.println();*/


            /* 13- Write a java program the print the square numbers from 1
            , 100*/
            /*int square = 0;
            for (int i = 1; i <= 10; i++) {
                square = i * i;
                System.out.println(square + " : " + i);
            }*/



        /* 14- Write a java program to print this pattern
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * *
        * * * *
        * * *
        * *
        **/
        /*int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }*/



        /* 15- Write a java program to print this pattern:
        5 4 3 2 1
        4 3 2 1
        3 2 1
        2 1
        1*/
        /*int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }*/


        /* 16- Write a java program to allow the user to input 3 values
        and get the max and the min value */
        /*Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = input.nextInt();
        int max = Math.max(Math.max(num1, num2), num3);
        int min = Math.min(Math.min(num1, num2), num3);
        System.out.println("The max value is: " + max);
        System.out.println("The min value is: " + min);*/


        /* 17- Write a java program that ask the user to input a
        number and print if it positive or negative or zero*/
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        input.close();
    }
}

    // function
    /* 4- Write a Function in Java to display the multiplication
    table vertically from 1 to n*/
    /*public static int multiplication(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = input.nextInt();
        for (int i = 1 ; i<= number ; i++){
            System.out.printf("1 * %d=%d",i,i);
            System.out.println("");
        }
        return number;*/




    /* 5- write Java Function in Java to get the sum of the first
    100 odd numbers from 1 to 100 like :
    1, 3, 5, 7 .......
    The sum is: {get the sum}*/
    /*public static int sum(){
        int sum =0;
        for (int i = 1 ; i<=100 ; i++){
            if (i % 2 == 1){
                sum += i;
            }
        }
        System.out.println("your summation odd number from 1 to 100 is :"+sum);
        return sum;
    }*/




    /* 6- Write a program in Java to make such a pattern like
    right angle triangle with a number which will repeat a
    number in a row */
    /*public static void triangle(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
    }
    }*/



    /* 7- Write a Function in Java to calculate the factorial for
    given number*/
    /*static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }*/



    /* 8- Write a Java Function to input 5 numbers and get the
    reverse*/
    /*public static void reverse(){
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, num4, num5;

        // Input numbers
        System.out.println("Enter 5 numbers: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();

        // Reverse numbers using for loop
        System.out.print("Outputs: ");
        for (int i = 5; i >= 1; i--) {
            switch (i) {
                case 1:
                    System.out.print(num5 + " ");
                    break;
                case 2:
                    System.out.print(num4 + " ");
                    break;
                case 3:
                    System.out.print(num3 + " ");
                    break;
                case 4:
                    System.out.print(num2 + " ");
                    break;
                case 5:
                    System.out.print(num1 + " ");
                    break;
                default:
                    break;
            }
        }
    }*/




    /* 9- Write a Java Function to get the absolutes Value like:
    Enter The Nubmer:-10
    outputs:10
    Note/ don’t use Math (build the function)*/
    /*public static int absoluteValue(int num) {
        if (num < 0) {
            return -num;
        } else {
            return num;
        }
    }*/



    /* 10- Write a Java Function to get the power for numbers like:
    Enter The Number:6
    Enter The Power:36
    Note/ don’t use Math (build the function)*/
    /*public static int power(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base power:");
        int number = input.nextInt();
        int power = number * number;
        System.out.println("Your power is " + power);
        return power;
    }*/




    /* 11- Write a Java Function and call It signIn, that ask the
    user to input the username, if username equal Alazhar ,
    ask him to input password, if password equal university,
    print Sign In Successfully like:
    Enter The Username:
    Alazhar
    Enter The Password:
    university
    Sign In Successfully*/
    /*public static void signIn() {
        Scanner input = new Scanner(System.in);

        // Input username
        System.out.println("Enter the username: ");
        String username = input.nextLine();

        // Check if username is correct
        if (username.equals("Alazhar")) {

            // Input password
            System.out.println("Enter the password: ");
            String password = input.nextLine();

            // Check if password is correct
            if (password.equals("university")) {
                System.out.println("Sign in successful!");
            } else {
                System.out.println("Incorrect password.");
            }

        } else {
            System.out.println("Incorrect username.");
        }
    }*/

