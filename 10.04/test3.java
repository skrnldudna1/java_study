public class test3 {
    public static void main(String[] args) {

        //0.0부터 1.0까지 0.001 단위로 증가시키며 제곱 표시(반복을 float형으로 제어)
        System.out.println("x      x의 제곱");
        System.out.println("-------------------------");

        for (float x = 0.0F; x <=1.0F; x += 0.001F)
            System.out.printf("%5.3f    %10.7f\n", x,x * x);

        //0.0부터 1.0까지 0.001 단위로 증가시키며 제곱 표시 (반복을 int형으로 제어)

        System.out.println("x  x의 제곱");
        System.out.println("-------------------------");

        for (int i = 0; i <=1000; i++) {
            float x =(float) i / 1000;
            System.out.printf("%5.3f      %10.7f\n",  x ,x * x);
        }
    }
}
