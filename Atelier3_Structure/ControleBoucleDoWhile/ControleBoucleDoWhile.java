import java.util.Scanner;
public class ControleBoucleDoWhile {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        int num1 ;
        do {
            System.out.println("Saissisez un nombre");
            num1 = myNum.nextInt();
        }
        while(num1<=0);
        myNum.close();
    }
    
}
