public class Assignment2 {
    public static void main(String[] args){
        /*Write a Java program to find the sum of first 10 natural
        numbers like: 1,2,3,4,5,6,7,8,9,10*/
        int sum = 0;
        for (int i = 0; i <10 ; i++){
            sum += i;
            sum++;
        }
        System.out.println("The sum of first 10 natural numbers is: "+sum);
    }
}
