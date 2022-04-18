import java.util.ArrayList;
import java.util.Scanner;

public class Collection2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> livres = new ArrayList<String>();
        for(int i=1;i<=3;i++){
            System.out.println("Saisir un nouveau nom de livre");
            livres.add(sc.nextLine());
        } 
        for(String livre:livres){
            System.out.println(livre);
        }
    }
}
