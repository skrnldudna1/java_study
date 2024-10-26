import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {
        Scanner stnId = new Scanner(System.in);
        System.out.println("1부터 n까지의 합을 구합니다.");
        int n;
        do {
            System.out.print("n의 값:");
            n= stnId.nextInt();
        } while (n<=0);
        int sum = 0;
        for (int i= 1; i<n; i++) {
            System.out.print(i+"+");
            sum +=i;
        }
        System.out.println(n+ "=");
        sum +=n;
        System.out.println(sum);
    }
}
