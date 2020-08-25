// --------------------------------------------
//              RitterArrays.java
//               Ryan Ritter
// --------------------------------------------

import java.util.Scanner;
public class RitterArrays{
    
    public static void printArray(int [] x){
        System.out.print("The array is: ["); 
        for (int i = 0 ; i < x.length; i++){
			System.out.print(x[i] + " ");
        }
        System.out.println("]");
    }

    public static int minimum(int[] array){ 
        int min = array[0];
        int index;
        for (index = 0; index < array.length; index++){
            if (array[index] < min){ 
                min = array[index];
            }
        }
        return min;
    }

    public static int maximum(int[] array){ 
        int max = array[0];
        int index;
        for (index = 0; index < array.length; index++){
            if (array[index] > max){ 
                max = array[index];
            }
        }
        return max;
    }
    public static double average(int[] array){ 
        double avg = 0.0;
        int index;
        double sumOfElements = 0.0;
        for (index = 0; index < array.length; index++){
            sumOfElements += array[index];
            avg = sumOfElements / array.length;
        }
        return avg;
    }
    public static void sortArray(int arr[]){ 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){  
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                }  
            }   
        }
        printArray(arr);
    }


    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        int numOfInputs = 1;
        do{ 
            System.out.print("Enter the total number of integers to be in the array \n");
            numOfInputs = kb.nextInt();    
        }while(numOfInputs < 0);
        
        int[] myArray = new int [numOfInputs];

        for(int i = 0; i < myArray.length; i++){
            System.out.println("Enter the next digit in the array: ");
            myArray[i] = kb.nextInt();
            
        }
        printArray(myArray);
        sortArray(myArray);
        System.out.println("The minimum value is " + minimum(myArray));
        System.out.println("The maximum value is " + maximum(myArray));
        System.out.println("The average of values is " + average(myArray));


    }
}

    