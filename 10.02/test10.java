import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        //세 정수의 평균값 구하기(캐스트 연산자 이용)
        Scanner stdIn = new Scanner(System.in);

        System.out.println("정숫값 x,y,z의 평균을 구합니다.");
        System.out.print("x값: "); int x = stdIn.nextInt();
        System.out.print("y값: "); int y = stdIn.nextInt();
        System.out.print("z값: "); int z = stdIn.nextInt();

        double ave = (double) (x+y+z)/3;
        System.out.printf("x,y,z의 평균은 %.3f입니다.\n", ave);
    }
}
