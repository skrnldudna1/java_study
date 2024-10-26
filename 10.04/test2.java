public class test2 {
    public static void main(String[] args) {
        //0.0 부터 1.0까지 0.001 단위로 증가시켜 가며 표시

        System.out.println("float       int");
        System.out.println("-----------------");

        float x = 0.0F;
        for (int i = 0; i<= 1000; i++, x += 0.001F)
            System.out.printf("%9.7f    %9.7f\n",x,(float)i / 1000);
    }
}
