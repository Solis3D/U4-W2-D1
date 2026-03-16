package ES2;

import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

   public static void main(String[] args) {

       int km = 0;
       int litri = 1;
       int result = 0;
       Scanner scanner = new Scanner(System.in);

       System.out.println();
       System.out.println("CALCOLATORE KM PER LITRO DI CARBURANTE");
       System.out.println();

       System.out.println("Digitare i km percorsi... ");
       km = scanner.nextInt();
       System.out.println();

       try {
       System.out.println("Digitare i litri di carburante consumati...");
       litri = scanner.nextInt();
       result = km / litri;

       System.out.println("km per litro: " + result);

       } catch (ArithmeticException e) {
           logger.error("Errore: divisione per 0!", e);
           System.out.println();
           System.out.println("Inserire un valore maggiore di 0! I litri non possono essere 0!");
       }

    }
}
