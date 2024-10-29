package ch17.sec08;

//정수 짝수 스트림에서 요소를 하나씩 반복해서 출력
import java.util.Arrays;

public class LoopingExam {
    public static void main(String[] args) {
        int[] intArr = {1,2,3,4,5};

        //잘못 작성한 경우
        Arrays.stream(intArr)
                .filter(a ->a%2==0)
                .peek(n -> System.out.println(n));   //최종 처리가 없으므로 동장하지 않음

        //중간 처리 메소드 peek()을 이용해서 반족 처리
        int total = Arrays.stream(intArr)
                .filter(a ->a%2==0)
                .peek(n -> System.out.println(n))   //동작함
                .sum();      //최종 처리
        System.out.println("총합 : " + total + "\n");

        //최종 처리 메소드 forEach()를 이용해서 반복처리
        Arrays.stream(intArr)
                .filter(a ->a%2==0)
                .forEach(n -> System.out.println(n));   //최종 처리이므로 동작함
    }
}
