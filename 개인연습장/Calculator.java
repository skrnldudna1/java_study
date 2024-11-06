package ch01.sec01;


//계산 코드 만들기
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        //키보드로부터 입력을 받음 (Scanner 객체 생성 /사용자 입력을 받기 위해 필요)
        Scanner scanner = new Scanner(System.in);

        //첫번째 숫자 입력 받기
        System.out.println("첫 번째 숫자를 입력하세요.");
        double num1 = scanner.nextDouble();  //사용자가 입력한 첫번째 숫자

        //두번째 숫자 입력 받기
        System.out.println("두 번째 숫자를 입력하세요.");
        double num2 = scanner.nextDouble();  //사용자가 입력한 두번째 숫자

        // 연산자 선택
        System.out.println("원하는 연산을 선택하세요. (+,-,*,/)");
        char operator = scanner.next().charAt(0); //연산자를 문자열로 입력받음

        //결과를 저장할 변수 선언
        double result;

        //선택된 연산자에 따라 연산 수행
        switch (operator) {
            case '+': //덧셈 연산을 선택한 경우
                result = num1 + num2; //두 숫자를 더하고 result 에 저장
                System.out.println("결과 : " + result);
                break;
            case '-': //뺄셈 연산을 선택한 경우
                result = num1 - num2; //두 숫자를 더하고 result 에 저장
                System.out.println("결과 : " + result);
                break;

            case '*': //곱셈 연산을 선택한 경우
                result = num1 * num2; //두 숫자를 더하고 result 에 저장
                System.out.println("결과 : " + result);
                break;

            case '/': //나눗셈 연산을 선택한 경우
                //나누기 전에 두 번째 숫자가 0인지 확인하여 오류 방지
                if (num2 != 0) { //두 번째 숫자가 0이 아닌 경우에만 나눗셈 출력)
                    result = num1 / num2; //두 숫자를 더하고 result 에 저장
                    System.out.println("결과 : " + result);  //결과 출력
                } else { //두 번째 숫자가 0인 경우
                    System.out.println("오류 : 0으로 나눌 수 없습니다. "); //오류 메세지
                }
                break;
            default: //위에서 저장한 연산자 외의 입력이 들어온 경우
                System.out.println("잘못된 연산자 입니다. (+,-,*,/ 중 하나를 입력 하세요.)");
                break;
        }
        //Scanner 객체 달기 (메모리 누수를 방지하기 위해 입력이 끝나면 닫아줌)
        scanner.close();
    }
}
