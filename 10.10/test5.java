package t1010t;

import java.util.Scanner;

public class test5 {
    //왼쪽 아래가 직각인 이등변 삼각혈을 표시

    static void putChars(char c, int n) {
        while (n-- > 0)
            System.out.print(c);
    }

    static void putChars(int n) {
        putChars('*', n);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 표시합니다.");
        System.out.print("단수는: ");
        int n = stdIn.nextInt();
        for (int i = 1; i <= n; i++) {
            putChars(i);
            System.out.println();
        }
    }
}
