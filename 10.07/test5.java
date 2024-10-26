package n1007;

import java.util.Random;
import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        //배열의 모든 요소에 1~10의 난수 채우기
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수 : ");
        int n = stdIn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i <n; i++)
            a[i] = 1 + rand.nextInt(10);

        for (int i = 0; i <n; i++)
            System.out.println("a["+i+"]= "+a[i]);
    }
}
