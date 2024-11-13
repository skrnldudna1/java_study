package ch09.sec03.exam01;

public class HashCodeExl {

	public static void main(String[] args) {
		String str1 = new String ("abc");
		String str2 = new String ("abc");
		
		System.out.println(str1.equals(str2)); //값을 비교
		System.out.println(str1 == str2);  //주소를 비교
		//new를 사용했기 때문에 주소값은 false
		
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode());

		
		//두개가 다르게 출력됨 : 
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		
		//hashCode() 는 Object 객체 기준
		//와 identityHashCode()는 각자 기준
		
		

	}

}
