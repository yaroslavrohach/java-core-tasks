package edu.javacore;

public class ArraysTask {
    /*
    Increase by 2
        The sequence of integers is given. Increase by 2 each its non-negative element.
     */
    public int[] increaseBy2(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
        if ( arr[i]  >= 0 ) {
            arr[i] = arr[i] + 2;
        }
        
       }
        return arr;
    }

    /*
    The first is not greater for 2,5
        Array of real numbers is given. Find the first element in array which value does not exceed 2.5.
        In the case of absence the specified element return 0
    */
    public double findFirstNumber(double[] arr) {
        for (double element : arr) {
            if (element < 2.5) {
                return element;
            }
            
        }
        return 0;
    }

    /*
    The arithmetic mean of positive
    The sequence of real numbers is given. Find the arithmetic mean of positive numbers.
    If the array doesn't have positive number return 0.
     */
    public double arithmeticalMean(double[] arr) {
        double sum = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum = sum + arr[i];
                k++;

            }
        }
        return sum / k;
    }

    /*
        The sequence of integers is given. Find max int value in sequence
     */
    public int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
    Maximum of absolute values
    The sequence of real numbers is given. Lets find their absolute values. Find the maximum value among these absolute values.
     */
    public double maxOfAbsoluteValues(double[] arr) {
        double max = Math.abs(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) > Math.abs(max)) {
                max = arr[i];
            }
        }
        return max;
    }

    /*
    Negative elements
        The sequence of n real numbers is given. Find the sum of negative elements in it.
     */
    public double negativeElementsSum(double[] arr) {
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                sum = sum + arr[i];
            }
        }
        return sum;
    }

    /*
    Reverse array
    Array of int is given. Return the given array in the reverse order
     */
    public int[] reverseArray(int[] arr) {
        int [] arr2 = new int [arr.length];
           for (int i = 0; i < arr2.length; i++) {
            arr2[arr.length - 1 - i] = arr[i]; 
           }
        return arr2;
    }
}
