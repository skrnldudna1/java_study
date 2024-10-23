package src.ch14.sec09.exam01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExam {

    public static void main(String[] args) {

        // Executors 클래스를 사용하여 스레드 풀을 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 스레드 풀을 종료 (즉시)
        executorService.shutdownNow();
    }
}
