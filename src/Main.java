import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size;
        int[] arr;
        StopWatch stopWatch = new StopWatch();

        System.out.print("Enter the size of the array: ");
        size = scanner.nextInt();
        arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size);
        }

        stopWatch.start();
        Arrays.sort(arr);
        stopWatch.stop();
        System.out.print("Execution time of selection sort algorithm for "
                        + size + " numbers is: " + stopWatch.getElapsedTime() + " miliseconds");
    }
}
