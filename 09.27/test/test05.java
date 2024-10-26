import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner stnId = new Scanner(System.in);
        int n;
        do {
            System.out.print("n의 값:");
            n = stnId.nextInt();
        } while (n<=0);

        int sum = 0;
        for (int i=0; i <=n; i++)
            sum += i;
        System.out.print("1부터" +n+ "까지의 합은" + sum+ "입니다.");
    }
}
