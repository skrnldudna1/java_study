package src.ch18.sec02.exam03;

/*입력 스트림*/
/*저장한 내용을 1byte씩 끝까지 읽음*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Read1ByteExam {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:Temp/test1.db");

            while (true) {
                int data = is.read();       /*1byte씩 읽기*/
                if (data == -1) break;      /*파일 끝에 도달했을 경우*/
                System.out.println(data);
            }
            is.close();                    /*입력 스트림을 닫고 사용 메모리 헤제*/
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
