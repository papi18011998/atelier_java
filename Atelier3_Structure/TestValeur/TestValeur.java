import java.util.Scanner;

public class TestValeur {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        int number1 = myNum.nextInt();
        int number2 = myNum.nextInt();
        System.out.println("Entrer un nombre");
        System.out.println(number1+number2);

        if(number1>number2){
            System.out.println(number1);
        }
        else{
            System.out.println("Le plus grand nombre est :" + number2);
        }
        myNum.close();
    }
}
