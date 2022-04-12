import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        // moyenne de 5 nombres ecrit au clavier
        Scanner sc = new Scanner(System.in); 
        int [] nombres = new int[5];
        int i = 0;
        int somme =0;
        for(i=0;i<nombres.length;i++){
            System.out.println("Saisir le nombre "+ (i+1));
            nombres[i] = sc.nextInt();
            somme = somme + nombres[i];
        }
        int moyennne = somme / nombres.length;
        System.out.println("La moyenne des nombres fait: "+moyennne);
    }    
}
