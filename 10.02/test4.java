import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        //10 진수를 읽어서 8진수, 16진수로 표시(방법1)

        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수: ");
        int x = stdIn.nextInt();

        System.out.printf(" 8진수는 %o입니다.\n",x);
        System.out.printf("16진수는 %x입니다.\n",x);
    }
}
