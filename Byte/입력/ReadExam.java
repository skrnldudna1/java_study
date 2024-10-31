package src.ch18.sec02.exam04;

/*입력 스트림*/
/*저장한 내용을 배열로 읽음*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExam {
    public static void main(String[] args) {
        try {
            InputStream is = new FileInputStream("c:Temp/test2.db");

            byte[] data = new byte[100];    /*100 바이트 크기의 배열 생성 (읽어들인 데이터를 저장할 공간)*/

            while (true) {
                int num = is.read(data);       /*파일에서 최대 100 바이트를 읽어 data 배열에 저장*/
                if (num == -1) break;      /*파일 끝에 도달했을 경우*/
                for (int i=0; i<num; i++){
                    System.out.println(data[i]);    /*읽은 바이트 출력*/
                }
            }
            is.close();                    /*입력 스트림을 닫고 사용 메모리 헤제*/
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
