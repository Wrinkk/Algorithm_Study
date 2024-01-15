import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int [] arr = new int[10];

        for (int i = 0; i < 10; i++) {

            int num = scanner.nextInt();
            arr[i] = num % 42;
        }
        Set<Integer> num2 = new HashSet<>();
        for (Integer arr1 : arr) {
            num2.add(arr1);
        }
        System.out.println(num2.size());
    }
}