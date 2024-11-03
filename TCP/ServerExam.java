package ch19.sec03.exam01;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerExam {
    // 서버 소켓을 저장할 변수 (서버를 시작하고 멈추는 데 사용)
    public static ServerSocket serverSocket = null;

    public static void main(String[] args) {

        System.out.println("-----------------------------------------------------");
        System.out.println("서버를 종료하려면 q또는 Q를 입력하고 Enter 키를 입력하세요.");
        System.out.println("-----------------------------------------------------");

        //TCP 서버 시작
        startServer();

        // 사용자 입력으로 서버를 종료하는 코드
        Scanner scanner = new Scanner(System.in);
        while (true)
        {
        String key = scanner.nextLine();
        if (key.toLowerCase().equals("q")) {
        break;
        }
        }
        scanner.close();

        //TCP 서버 종료
        stopServer();
    }

    // 서버 시작 메서드
    public static void startServer() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    // ServerSocket 생성 및 포트 설정 (50001번 포트 사용)
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while (true) {
                        System.out.println("\n[서버] 연결 요청을 기다림\n");
                        // 클라이언트의 연결 요청을 기다리고 수락
                        Socket socket = serverSocket.accept();

                        //연결 클라이언트 정보 얻기
                        InetSocketAddress isa =
                                (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버]" + isa.getHostString() + "의 연결 요청을 수락함");

                        // 클라이언트와의 연결을 끊음
                        socket.close();
                        System.out.println("[서버]" + isa.getHostString() + "의 연결을 끊음");
                    }
                } catch (IOException e) {
                    // 예외 발생 시 오류 메시지 출력
                    System.out.println("[서버]" + e.getMessage());
                }
            }
        };
        // 서버 시작을 위한 스레드 실행
        thread.start();
    }
    // 서버 종료 메서드
    public static void stopServer() {
        try {
            // 서버 소켓을 닫아 서버를 종료
            serverSocket.close();
            System.out.println("[서버] 종료됨");
        }catch (IOException e1) {}
        // 예외 발생 시 무시
    }
}
