package ES3;

import java.util.Scanner;

import ES3.entities.ContoCorrente;
import ES3.entities.ContoOnLine;
import ES3.exceptions.BancaException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(ES3.Main.class);

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ContoCorrente contoCorrente = new ContoCorrente("Ugo", 200.00);
        ContoOnLine contoOnLine = new ContoOnLine("Ugo(Online)", 400.00, 50.00);


        System.out.println("---CONTO CORRENTE---");

        do {
            try {
                System.out.println("Saldo corrente: " + contoCorrente.restituisciSaldo());
                System.out.println("Inserire importo da prelevare dal conto: ");
                double importo = scanner.nextDouble();

                if (importo == 0) {break;}

                contoCorrente.preleva(importo);
                System.out.println("Saldo corrente: " +contoCorrente.restituisciSaldo());
            }catch (BancaException ex) {
                System.out.println("Errore " + ex.getMessage());
                System.out.println("Saldo corrente " + contoCorrente.restituisciSaldo() );
            }
        } while (true);

        do {
            try {
                System.out.println("Inserire importo da prelevare dal conto Online:");
                double importo = scanner.nextDouble();

                if (importo == 0) {break;}

                contoOnLine.preleva(importo);
                contoOnLine.stampaSaldo();
            }catch (BancaException ex){
                System.out.println("Erroe " + ex.getMessage());
                contoOnLine.stampaSaldo();
            }

        }while (true);

        scanner.close();
    }
}
