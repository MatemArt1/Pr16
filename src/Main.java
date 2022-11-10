public class Main {
    /*
    Ben has a very simple idea to make some profit: he buys something and sells it again.
    Of course, this wouldn't give him any profit at all if he was simply to buy and sell it at the same price.
    Instead, he's going to buy it for the lowest possible price and sell it at the highest.

Task
Write a function that returns both the minimum and maximum number of the given list/array.

Examples (Input --> Output)
[1,2,3,4,5] --> [1,5]
[2334454,5] --> [5,2334454]
[1]         --> [1,1]
     */
    class MinMax {
        public static int[] minMax(int[] arr) {
            // Your awesome code here
            if (arr.length == 1) {
                int[] a = new int[]{arr[0], arr[0]};
                return a;
            } else {
                int MIN = arr[0];
                int MAX = arr[0];
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i] < MIN) MIN = arr[i];
                    if (arr[i] > MAX) MAX = arr[i];
                }
                int[] a = new int[]{MIN, MAX};
                return a;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}