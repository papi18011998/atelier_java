import java.util.Scanner;
public class Programme6 {
    public static void main (String[] args){
        Scanner myNum = new Scanner(System.in);
        
        //System.out.println("Enter a number");
        int [] tableau = new int [5] ;
        int somme = 0;
        for(int i=0;i<tableau.length;i++){
        System.out.println("Enter a number");
        
        tableau[i] = myNum.nextInt();
       somme = somme + tableau[i];
       }
        System.out.println(somme/tableau.length);
        myNum.close();
    }
    
}
