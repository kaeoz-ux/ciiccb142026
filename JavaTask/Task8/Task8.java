public class Task8 {

    public static int calculateCumulativeSum(int... numbers) {
        int totalSum = 0;

        for (int num : numbers) {
            int cumulativeSum = (num * (num + 1)) / 2;
            totalSum += cumulativeSum;
            
           System.out.print("Parameter: " + num + " -> ");

            for (int i = 1; i <= num; i++) {
                System.out.print(i);

                if (i < num) {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + cumulativeSum);
        }

        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println("Parameters: 4, 5, 10\n");
        
        int result = calculateCumulativeSum(4, 5, 10);
        
        System.out.println("\nSum of all parameters: " + result);
    }
}
