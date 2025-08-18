package day6_Arrays;
public class PrimeNumbersInArray {
    
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("Prime numbers in the array:");
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + "  ");
            }
        }
    }
}