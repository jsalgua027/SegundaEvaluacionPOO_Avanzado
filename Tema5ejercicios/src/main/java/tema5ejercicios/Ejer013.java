/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5ejercicios;

import java.util.Scanner;

/**
 *
 * @author Windows10
 */
public class Ejer013 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Initialize an array to store the frequencies of each integer
        int[] frequencies = new int[20];
        Scanner scanner = new Scanner(System.in);
// Loop until a zero is entered
        int input = 1;
        while (input != 0) {
            System.out.print("Enter an integer between 1 and 20 (0 to end): ");
            input = scanner.nextInt();

            // Check if the input is within the valid range (1-20)
            if (input >= 1 && input <= 20) {
                // Increment the frequency of the input integer
                frequencies[input - 1]++;
            }
        }

// Print the histogram
        System.out.println("\nHistogram:");
        for (int i = 0; i < 20; i++) {
            System.out.print(i + 1 + ": ");
            // Print the appropriate number of '*' characters for the frequency of the integer
            for (int j = 0; j < frequencies[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
