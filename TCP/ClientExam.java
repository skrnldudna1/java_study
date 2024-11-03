package ch19.sec03.exam01;

/*ServerExam에 연결 요청을 하는 TCP 클라이언트 코드*/
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientExam {
    public static void main(String[] args) {
        try {
            // 서버에 연결 요청을 보냅니다. "localhost"는 현재 컴퓨터를 의미하고, 50001번 포트를 사용
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[클라이언트] 연결 성공");

            //서버 연결 종료
            socket.close();
            System.out.println("[클라이언트] 연결 끊음");
        } catch (UnknownHostException e) {
            // 호스트(서버)를 찾을 수 없을 때 발생하는 예외를 처리

        } catch (IOException e) {
            // 입출력(I/O) 오류가 발생할 때 발생하는 예외를 처리
        }
    }
}
