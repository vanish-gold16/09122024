import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        /*int[] pole = new int[6];
        for (int i = 0; i < pole.length; i++) {
            int currentNumber = i;
            currentNumber++;
            System.out.print("Enter number " + currentNumber + ": ");
            pole[i] = scanner.nextInt();
        }

        for (int i = 0; i < pole.length; i++) {
            int currentNumber = i;
            currentNumber++;
            System.out.println("Number " + currentNumber + " is " + pole[i]);
        } */


        int[] pole = new int[10];
        for (int i = 0; i < pole.length; i++) {
            pole[i] = random.nextInt(-100, 100);
        }
        System.out.print("Pole = ");
        for (int i = 0; i < pole.length; i++) {
            System.out.print(" " + pole[i]);
        }
        System.out.print("\nReversed pole = ");
        int reversedPole = pole.length - 1;
        for (int i = reversedPole; i >= 0; i--) {
            System.out.print(" " + pole[i]);
        }
        System.out.println("\nTask 3:\n");
        System.out.print("Positive numbers: ");
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] > 0){
                System.out.print(pole[i] + " ");
            }
        }
        System.out.print("\nNegative numbers: ");
        for (int i = 0; i < pole.length; i++) {
            if (pole[i] < 0){
                System.out.print(pole[i] + " ");
            }
        }
        System.out.print("\nZero's: ");
        for (int i = 0; i < pole.length; i++) {
            if(pole[i] == 0){
                System.out.println(pole[i] + " ");
            }
        }
        System.out.print("\nSingle-digit numbers: ");
        for (int i = 0; i < pole.length; i++) {
            if(pole[i] < 10 && pole[i] > -10){
                System.out.print(pole[i] + " ");
            }
            else
                System.out.println("None");
        }
        System.out.println("Average: ");
        int prumer = (pole[0] + pole[1]
    }
}