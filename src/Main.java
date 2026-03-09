/******************************************************************************
 @author Group MW 07 SP26
 Abdullah Ahmed, Tanequa Bailey, Shreya Maipady, and Jose Quevedo
 CMPE 187
 Professor Ishie Eswar
 March 14/2026
 Data Flow
 This program merges 2 sorted arrays.
 *******************************************************************************/
import java.util.Scanner;
public class Main {
    //method to merge arrays
    public static int[] mergeArrays(int[] arrayA, int[] arrayB) {
        int arrayALength = arrayA.length;
        int arrayBLength = arrayB.length;
        int array[] = new int[arrayALength + arrayBLength];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < arrayALength && j < arrayBLength) {
            if (arrayA[i] <= arrayB[j]) {
                array[k] = arrayA[i];
                i++;
            } else {
                array[k] = arrayB[j];
                j++;
            }
            k++;
        }
        while (i < arrayALength) {


            array[k] = arrayA[i];
            k++;
            i++;


        }
        while (j < arrayBLength) {


            array[k] = arrayB[j];
            k++;
            j++;


        }
        return array;
    }


    public static void main(String[] args) {
        //User Input
        Scanner sc = new Scanner(System.in);

        int arrayA[] = null;
        boolean incorrectA = true;
        int arrayB[] = null;
        boolean incorrectB = true;
        //Array A input
        while (incorrectA) {
            incorrectA = false;
            System.out.println("Enter Array A(eg:[x, x, x])");
            String inputArrA = sc.nextLine();
            //Remove the brackets
            inputArrA = inputArrA.replace("[", "").replace("]", "");
            //split with the delimeter
            String[] strArrayA = inputArrA.split(",");
            int counterA = 0;
            arrayA = new int[strArrayA.length];
            try {
                for (String s : strArrayA) {
                    int integerForA = Integer.parseInt(s.trim());
                    arrayA[counterA] = integerForA;
                    counterA++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
                incorrectA = true;
            }

        }

        //Array B input
        while (incorrectB) {
            incorrectB = false;
            System.out.println("Enter Array B (eg:[x, x, x])");
            String inputArrB = sc.nextLine();
            inputArrB = inputArrB.replace("[", "").replace("]", "");

            //split with the delimeter
            String[] strArrayB = inputArrB.split(",");

            int counterB = 0;
            arrayB = new int[strArrayB.length];
            try {
                for (String s : strArrayB) {
                    int integerForB = Integer.parseInt(s.trim());
                    arrayB[counterB] = integerForB;
                    counterB++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid format");
                incorrectB = true;
            }

        }
            //call merge method
            int finalArray[] = mergeArrays(arrayA, arrayB);
            System.out.print("[ ");
            for (int i = 0; i < finalArray.length; i++) {
                System.out.print(finalArray[i]);
                if (i != finalArray.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");

        }
    }


