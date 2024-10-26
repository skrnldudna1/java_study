import java.util.Scanner;

public class test04 {
    public static void main(String[] args) {
        Scanner stnId = new Scanner(System.in);
        System.out.println("카운트업 합니다.");
        int x;
        do {
            System.out.print("양의 정숫값:");
            x = stnId.nextInt();
        } while (x<=0);

        for (int i =0; i<=x ; i++)
            System.out.println(i);
    }
}
