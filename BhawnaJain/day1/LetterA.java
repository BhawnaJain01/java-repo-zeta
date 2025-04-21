import java.util.Scanner;

public class LetterA {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the number :");
        int it = scn.nextInt();
        System.out.print("Enter character:");
        char ch = scn.next().charAt(0);

        for (int i = 0; i < it; i++) {
            int count = (it*2)-1;
            int spaces= it-i-1;
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            System.out.print(ch);
            int mid=0;
            if(it%2==0){
                mid=it/2;
            }else{
                mid=it/2+1;
            }
            if (i == mid) {
                int cnt = (count - (spaces) * 2) - 2;
                int c = 0;
                while (c <= cnt) {
                    if (c % 2 == 0) {
                        System.out.print(" ");
                    } else {
                        System.out.print(ch);
                    }
                    c++;
                }
            } else {
                for (int j = 0; j < (count - (spaces) * 2) - 2; j++) {
                    System.out.print(" ");
                }
                if (i != 0)
                    System.out.print(ch);
            }
            System.out.println();
        }
        scn.close();
    }
}
