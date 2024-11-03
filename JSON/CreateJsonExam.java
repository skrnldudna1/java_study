package ch19.sec06;

//JSON
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.charset.Charset;

public class CreateJsonExam {
    public static void main(String[] args) throws IOException {
        // JSON 객체를 생성하여 데이터를 추가
        JSONObject root = new JSONObject();

        // 기본 정보 추가
        root.put("id", "winter");
        root.put("name", "한겨울");
        root.put("age", 25);
        root.put("student", true);

        // 전화번호 정보를 담을 JSON 객체 생성 후 추가
        JSONObject tel = new JSONObject();
        tel.put("home", "02-123-1234");
        tel.put("mobile", "02-123-1234");
        root.put("tel", tel);

        // 기술 리스트를 담을 JSON 배열 생성 후 추가
        JSONArray skill = new JSONArray();
        skill.put("java");
        skill.put("c");
        skill.put("c++");
        root.put("skill", skill);

        // JSON 객체를 문자열로 변환
        String json = root.toString();

        System.out.println(json);

        // JSON 문자열을 파일에 저장하기 위한 Writer 객체 생성
        Writer writer = new FileWriter("C:/Temp/member.json",
        Charset.forName("UTF-8"));
        writer.write(json);
        writer.flush();
        writer.close();
    }
}
