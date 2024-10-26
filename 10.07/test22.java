import java.util.Random;
import java.util.Scanner;

class ArrayRandY {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner stdIn = new Scanner(System.in);

        int n; // 요소 수
        do {
            System.out.print("요소 수: ");
            n = stdIn.nextInt(); // 요소 수 읽기
        } while (n > 10);
        int[] a = new int[n]; // 배열 생성

        for (int i = 0; i < n; i++) {
            int j;
            do {
                j = 0;
                a[i] = 1 + rand.nextInt(10); // 1~10 범위의 난수 생성
                for (j = 0; j < i; j++)
                    if (a[j] == a[i]) break; // 중복 체크
            } while (j < i); // 중복이 있으면 다시 난수 생성
        }

        for (int i = 0; i < n; i++)
            System.out.println("a[" + i + "] = " + a[i]);
    }
}
