package ch19.sec06;

//문자열 처리 - 파싱하기
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

public class ParseJsonExam {
    public static void main(String[] args) throws IOException {
        // 파일을 읽어올 BufferedReader 생성 (UTF-8 인코딩 사용)
        BufferedReader br = new BufferedReader(
                new FileReader("C:/Temp/member.json", Charset.forName("UTF-8"))
        );
        // JSON 파일의 첫 번째 줄을 읽어서 문자열로 저장
        String json = br.readLine();
        br.close();

        // JSON 문자열을 JSON 객체로 변환 (파싱)
        JSONObject root = new JSONObject(json);

        // JSON 객체에서 키를 이용하여 데이터 가져오기 (속성 정보 읽기)
        System.out.println("id : "+ root.getString("id"));
        System.out.println("name : "+ root.getString("name"));
        System.out.println("age : "+ root.getInt("age"));
        System.out.println("student : "+ root.getBoolean("student"));

        // "tel" 객체 안의 전화번호 정보 가져오기 (객체 속성 정보 읽기)
        JSONObject tel = root.getJSONObject("tel");
        System.out.println("home : " + tel.getString("home"));
        System.out.println("mobile : " + tel.getString("mobile"));

        // "skill" 배열 안의 기술 목록 가져오기 (배열 속성 정보 읽기)
        JSONArray skill = root.getJSONArray("skill");
        System.out.println("skill : ");
        for (int i=0; i<skill.length(); i++) {
            System.out.println(skill.get(i) + ", ");
        }
    }
}
