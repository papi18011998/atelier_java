import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        // affichage de 1 au nombre
        Scanner sc = new Scanner(System.in);
        int nombre = 0;
        System.out.println("Saisir un nombre");
        nombre = sc.nextInt();
        if (nombre>0) {
            for(int i = 1; i<=nombre;i++){
                System.out.println(i);
            }
        }else{
            for(int i = nombre; i<=1;i++){
                System.out.println(i);
            }
        }

    }
}
