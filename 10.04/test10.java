import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        //배열의 모든 요소에 값을 읽어서 초깃값 형식으로 표시

        Scanner stnId = new Scanner(System.in);

        System.out.print("요솟 수 : ");
        int n = stnId.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("a["+ i + "]=");
            a[i] = stnId.nextInt();
        }
        System.out.print("a= {");
        if (n>=2)
            for (int i = 0; i<n - 1; i++)
                System.out.print(a[i] + ",");
        if (n>=1)
            System.out.print(a[n-1]);
        System.out.print("}");
    }
}
