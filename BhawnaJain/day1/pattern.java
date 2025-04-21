import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number :");
        int it = scn.nextInt();
        System.out.print("Enter character:");
        char c = scn.next().charAt(0);

        for (int j = 0; j < it; j++) {
            for (int i = 0; i < it - j; i++) {
                System.out.print(c);
            }
            for (int k = 0; k < j; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < j - 1; i++) {
                System.out.print(" ");
            }
            if (j == 0) {
                for (int i = 0; i < it - 1; i++) {
                    System.out.print(c);
                }
            } else {
                for (int i = 0; i < it - j; i++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }

        for (int j = 1; j < it; j++) {
            for (int i = 0; i <= j; i++) {
                System.out.print(c);
            }
            for (int k = 0; k < it - j - 1; k++) {
                System.out.print(" ");
            }
            for (int i = 0; i < it - j - 2; i++) {
                System.out.print(" ");
            }
            if (j == it - 1) {
                for (int i = 0; i < it - 1; i++) {
                    System.out.print(c);
                }
            } else {
                for (int i = 0; i <= j; i++) {
                    System.out.print(c);
                }
            }
            System.out.println();
        }
        scn.close();
    }
}
