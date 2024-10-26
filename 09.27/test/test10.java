import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        Scanner stnId = new Scanner(System.in);
        System.out.print("정숫값: ");
        int n = stnId.nextInt();
        int count = 0;
        for (int i = 1; i<=n; i++)
            if (n % i ==0) {
                System.out.print(i+" ");
                count++;
            }
        System.out.println("의 약수는" + count + "개입니다.");
    }
}
