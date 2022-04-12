import java.util.Scanner;
public class Programme4 {
    public static void main (String[] args){
        Scanner myNum= new Scanner(System.in);
        
        System.out.println("Enter a number");

        int num1 = myNum.nextInt();
        int num2 = myNum.nextInt();
        System.out.println(num1/num2);
        myNum.close();
    }
}
