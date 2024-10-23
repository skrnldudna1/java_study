import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableExecuteExam {
    public static void main(String[] args) {

        // 1000개의 메일 생성
        String[][] mails = new String[1000][3];
        for (int i = 0; i < mails.length; i++) {
            mails[i][0] = "admin@my.com";         // 발신자
            mails[i][1] = "member" + i + "@my.com"; // 수신자
            mails[i][2] = "신상품 입고";             // 내용
        }

        // ExecutorService 생성
        ExecutorService executorService = Executors.newFixedThreadPool(5);

        // 이메일을 보내는 작업 생성 및 처리 요청
        for (int i = 0; i < 1000; i++) {
            final int idx = i; // 인덱스를 final로 지정
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    Thread thread = Thread.currentThread();
                    String from = mails[idx][0];   // 발신자 정보
                    String to = mails[idx][1];     // 수신자 정보
                    String content = mails[idx][2]; // 이메일 내용
                    System.out.println("[" + thread.getName() + "] " + from + " ==> " + to + ": " + content);
                }
            });
        }

        // ExecutorService 종료
        executorService.shutdown();
    }
}
