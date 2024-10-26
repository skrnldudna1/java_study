import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        Scanner stdI = new Scanner(System.in);
        System.out.print("몇 개의 *를 표시할까요?: ");
        int n = stdI.nextInt();
        if (n>0) {
            for (int i=0; i<n / 5; i++)
                System.out.print("*****");
            int rest = n %5;
            if (rest > 0) {
                for (int i=0; i<rest; i++)
                    System.out.print("*");
                System.out.println();
            }
        }
    }
}
