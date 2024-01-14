import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int hour = scanner.nextInt();
        int min = scanner.nextInt();

        min -= 45;

        if (min < 0) {
            if (hour == 0){
                hour = 24;
            }
            min += 60;
            hour--;
        }

            System.out.println(hour + " " + min);


    }
}
