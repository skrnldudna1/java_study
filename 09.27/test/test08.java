import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner stnId = new Scanner(System.in);
        System.out.print("몇 개의 *를 표시할까요? : ");
        int n = stnId.nextInt();
        if (n>0) {
            for (int i=0; i<n; i++) {
                System.out.print('*');
                if (i%5==4)
                    System.out.println();
            }
            if (n%5 !=0)
                System.out.println();
        }
    }
}
