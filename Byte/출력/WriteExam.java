package src.ch18.sec02.exam02;

/*저장된 바이트를 파일로 출력해서 저장*/
/*배열로 출력*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class WriteExam {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test2.db");

            byte [] array = {10,20,30};     /*배열의 모든 바이트를 출력*/

            os.write(array);

            os.flush();          /*버퍼가 가득 차면 버퍼를 비우고 즉시 데이터를 보내고 싶을때 사용*/
            os.close();          /*출력 스트림을 닫아 사용한 메모리를 해제*/
        }catch (IOException e){
            e.printStackTrace();   /*예외 발생시 오류 출력*/
        }
    }
}
