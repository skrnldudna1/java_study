package t1010t;

import java.util.Random;
import java.util.Scanner;

public class test6 {
    // 지정한 범위의 난수를 생성하는 메서드
    static int random(int a, int b) {
        if (b<=a)
            return a;
        else {
            Random rand = new Random();
            return  a + rand.nextInt(b - a + 1);
        }
    }

    public static void main(String[] args) {
        Scanner srdIn = new Scanner(System.in);

        System.out.println("난수를 생성합니다.");
        System.out.print("하한값: "); int min = srdIn.nextInt();
        System.out.print("상한값: "); int max = srdIn.nextInt();

        System.out.println("생성한 남수는"+ random(min,max)+ "입니다.");
    }
}
