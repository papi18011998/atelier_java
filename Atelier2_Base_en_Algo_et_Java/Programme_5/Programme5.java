import java.util.Scanner;
public class Programme5 {
    public static void main(String[] args){
        Scanner myNum = new Scanner(System.in);
        
        System.out.println("Enter a number");

        int num1 = myNum.nextInt();
        int num2 = 0;
        do{
            System.out.println("Enter a divider");
            num2 = myNum.nextInt();
        }
        while(num2 == 0);
        System.out.println(num1/num2);
        myNum.close();
        
    }
}
