import java.util.Scanner;

public class Calcul {
        static int  Addition(int a , int b){
            return a + b ;
        }
        static int Soustraction(int a, int b){
            return a - b ;
        }
        static int Division(int a, int b){
            return a / b ;
        }
        static int Muliplication(int a, int b){
            return a * b ;
        }
    public static void main(String[] args){
        System.out.println("Les operations sont :");
        System.out.println("1.Addition");
        System.out.println("2.Soustraction");
        System.out.println("3.Dividion");
        System.out.println("4.Produit");
        
        Scanner myOperation = new Scanner(System.in);
        System.out.println("Saissisez un nombre");
        int calcul ;
        calcul= myOperation.nextInt();
        
        Scanner myNum = new Scanner(System.in);
        System.out.println("Saissisez un nombre");
        int a  ;
        int b  ;
        a = myNum.nextInt();
        b = myNum.nextInt();

        switch (calcul){
        case 1:
            int addition = Addition(a, b);
            System.out.println(addition);
            myNum.close();
        break;
        
        case 2:
            int soustraction = Soustraction(a, b);
            System.out.println(soustraction);
            myNum.close();
        break;
        
        case 3:
            int division = Division(a, b);
            System.out.println(division);
            myNum.close();
        break;
        
        case 4:
            int produit = Muliplication(a, b);
            System.out.println(produit);
            myNum.close();
        break;
        }
        myOperation.close();
    }
}
