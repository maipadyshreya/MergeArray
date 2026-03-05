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
        //Array A input
        System.out.println("Enter Array A");
        String inputArrA = sc.nextLine();
        //Remove the brackets
        inputArrA = inputArrA.replace("[", "").replace("]", "");
        //split with the delimeter
        String[] strArrayA = inputArrA.split(",");
        int counterA = 0;
        int arrayA[] = new int[strArrayA.length];
        for (String s : strArrayA) {
            int integerForA = Integer.parseInt(s.trim());
            arrayA[counterA] = integerForA;
            counterA++;
        }


        //Array B input
        System.out.println("Enter Array B");
        String inputArrB = sc.nextLine();
        inputArrB = inputArrB.replace("[", "").replace("]", "");


        //split with the delimeter
        String[] strArrayB = inputArrB.split(",");




        int counterB = 0;
        int arrayB[] = new int[strArrayB.length];
        for (String s : strArrayB) {
            int integerForB = Integer.parseInt(s.trim());
            arrayB[counterB] = integerForB;
            counterB++;
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

