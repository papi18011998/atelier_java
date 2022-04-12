public class Boucles {
    public static void main(String[] args) {
        // boucle for en java
        System.out.println("=========================================La boucle for=========================================");
        int nombre_repetition;
        for(nombre_repetition =1; nombre_repetition<=10;nombre_repetition++){
            System.out.println("bonjour"+nombre_repetition);
        }
        // boucle while en java
        System.out.println("=========================================La boucle while=========================================");
        nombre_repetition = 1;
        while (nombre_repetition<=10) {
            System.out.println("bonjour"+nombre_repetition);
            nombre_repetition++;
        }
        // boucle do .. while 
        System.out.println("=========================================La boucle do while=========================================");
        nombre_repetition = 1;
        do {
            System.out.println("bonjour"+nombre_repetition);
            nombre_repetition++;
        } while (nombre_repetition<=10);
    }
}
