package n1007;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //선형 탐색(방법1: 가장 앞에 있는 요소를 탐색)

        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소 수: ");
        int n = stdIn.nextInt();      //요소수 입력
        int[] a = new int[n];

        for (int j = 0; j<n; j++) {
            System.out.print("a["+j+"]= ");
            a[j] = stdIn.nextInt();
        }
        System.out.println("찾을 숫자 : ");
        int key = stdIn.nextInt();

        int i;
        for (i=0; i<n; i++)
            if (a[i] == key)
                break;

        if (i<n)
            System.out.println("그 값은 a["+i+"]에 있습니다.");
        else
            System.out.println("해당 값이 존재하지 않습니다.");
    }
}
