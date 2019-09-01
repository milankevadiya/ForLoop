import java.util.Scanner;

public class Userinput {
    static int a;
    static int b;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k[] = new int[5];

        for (a = 0; a < k.length; a++) {
            System.out.println("enter 1 value");
            int a1 = scanner.nextInt();
            k[a] = a1;


            System.out.println(k[a] + "=" + a1);

        }


    }
}