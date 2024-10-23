package study.D1023;

//인터페이스 Wearable을 구현한 클래스의 사용 예
public class WearableExam {
    public static void main(String[] args) {
        Wearable[]a = new Wearable[2];
        a[0] = new Headphone();   //헤드폰
        a[1] = new WearableComputer();   //웨어러볼 컴퓨타

        for (int i = 0; i <a.length; i++)
            a[i].putOn();

        for (int i = 0; i <a.length; i++)
            a[i].putOff();
    }
}
