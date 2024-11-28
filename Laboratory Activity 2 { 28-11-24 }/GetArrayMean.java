import java.util.Scanner;

public class GetArrayMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i<n; i++){
            System.out.print("Enter number: ");
            numbers[i] = scanner.nextInt();
        }

        double mean = get_array_mean(numbers);
        System.out.printf("Mean of array is : %.2f%n", mean);

        scanner.close();
    }

    public static double get_array_mean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }
}
