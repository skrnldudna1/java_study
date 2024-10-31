package ch17.sec10;


/*Optional 클래스*/

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class OptionalExam {
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<>();

        //예외 발생
        //double avg = list.stream()
      /*  .mapToInt(Integer::intValue)
                .average()
                .getAsDouble();*/

        //방법1 - 가독성이 좋음

        OptionalDouble optional = list.stream()
                .mapToInt(Integer :: intValue)
                .average();
        if (optional.isPresent()){
            System.out.println("방법1_평균: " + optional.getAsDouble());
        }else {
            System.out.println("방법1_평균 : 0.0");
        }

        //방법2 - 코드간결
        double avg = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("방법2_평균 : " + avg);

        //방법3
        list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(a -> System.out.println("방법3_평균 : " + a));
    }
}
