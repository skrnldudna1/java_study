package ch09.sec04;

//toString

class Card {
	//카드의 종류,숫자를 나타내는 필드
	String Kind;
	int number;
	
	//기본 생성자 - 카드 종류룰 "SPADE"로, 숫자를 1로 초기화
	Card() {
		this ("SPADE", 1);
	}
	//매개변수가 있는 생성자 - 카드 종류와 숫자를 전달 받아 초기화
	Card(String kind, int number) {
		this.Kind = kind;
		this.number = number;
	}
}




public class CardToString {

	public static void main(String[] args) {
		Card c1 = new Card();
		Card c2 = new Card();

		// toString() 메서드를 호출하여 객체 정보를 출력
		//해시코드가 출력된다. (오버라이딩 하지않음)
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
	}

}
