package src.ch18.sec02.exam01;

/*저장된 바이트를 파일로 출력해서 저장*/
/*요즘에 사용하는 방식은 아님*/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write1ByteExam {
    public static void main(String[] args) {
        try {
            OutputStream os = new FileOutputStream("C:/Temp/test1.db");

            /*1byte씩 출력*/
            byte a = 10;
            byte b = 20;
            byte c = 30;

            os.write(a);
            os.write(b);
            os.write(c);

            os.flush();          /*버퍼가 가득 차면 버퍼를 비우고 즉시 데이터를 보내고 싶을때 사용*/
            os.close();          /*출력 스트림을 닫아 사용한 메모리를 해제*/
        }catch (IOException e){
            e.printStackTrace();   /*예외 발생시 오류 출력*/
        }
    }
}
