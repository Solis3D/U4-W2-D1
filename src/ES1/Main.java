package ES1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Istanzia Array
        int[] arrOfNumbers = new int[5];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        //Riempie Array con numeri randomici da 1 a 10
        for (int i = 0; i < arrOfNumbers.length; i++) {
            arrOfNumbers[i] = random.nextInt(10) + 1;
        }

        //Stampa array di partenza
        System.out.println("L'array di partenza è il seguente:");

        for (int ofNumber : arrOfNumbers) {
            System.out.print(ofNumber + " ");
        }
        System.out.println();
        System.out.println();

        do {

            try {

                System.out.println("Scrivere un numero da inserire o scegliere 0 per uscire:");
                int chosenNumber = scanner.nextInt();

                if (chosenNumber == 0){
                    break;
                }

                System.out.println("In che posizione vuoi inserire il numero? Scegliere un numero da 0 a 4.");
                int chosenIndex = scanner.nextInt();

                arrOfNumbers[chosenIndex] = chosenNumber;

                //Stampa array modificato
                for (int arrOfNumber : arrOfNumbers) {
                    System.out.print(arrOfNumber + " ");
                }
                System.out.println();

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Errore! Indice scelto non valido!");

            } catch (InputMismatchException e) {
                System.out.println("Errore! Inserire un numero intero!");
                scanner.nextLine();
            }

        }while (true);
        scanner.close();
    }
}
