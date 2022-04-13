import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        int number = myNum.nextInt();
        System.out.println("Saissisez un nombre");

        for(int i=1;i<=number;++i){
        System.out.println(i);
        }
        myNum.close();
    }
}
