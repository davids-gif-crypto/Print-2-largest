public class MyProgram {
    public static void main(String[] args) {
        twoBiggest();
    }

    public static void twoBiggest() {
        int[] arr = {5, 6, 17, 1};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

      
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];

            if (num > max) {
                secondMax = max; 
                max = num;
            } else if (num > secondMax) {
                secondMax = num;
            }
        }

        System.out.println("Biggest: " + max);
        System.out.println("Second biggest: " + secondMax);
    }
}
