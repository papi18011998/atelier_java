import java.util.Scanner;
public class Programme7 {
    public static void main(String[] args) {
        Scanner myNum = new Scanner(System.in);
        System.out.println("Saissisez un nombre");

        int number = myNum.nextInt();
        if(number<0){
            System.out.println("Le nombre est negative");
        }
        else if(number>0){
            System.out.println("Le nombre est positive");

        }
        else
        {
            System.out.println("Le nombre est null");
        }
        myNum.close();
    }
}
