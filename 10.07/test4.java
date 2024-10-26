package n1007;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //모든 요소의 합과 평균을 구해서 표시 (확장 for문)

        Scanner stdIn = new Scanner(System.in);
        System.out.print("요소 수 : ");

        int n = stdIn.nextInt();  //요소 수 입력
        double[] a = new double[n];  //배열 생성

        for (int i = 0; i<n; i++) {
            System.out.print("a["+i+"]= ");
            a[i] = stdIn.nextDouble();
        }
        double sum = 0;   //합계
        for (double i : a)  //확장 for문
            sum += i;

        System.out.println("모든 요소의 합은" + sum + "입니다.");
        System.out.println("모든 요소의 평균은" + sum /n + "입니다.");
    }
}
