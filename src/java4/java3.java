package java4;

// Static과 Static 아닌 것의 차이

public class java3 {
	public static void main(String[] args) {
		java3_print p1 = new java3_print(); // 같은 패키지 안에 있는 클래스 java3_print를 복제
		p1.delimiter = "////";

		java3_print p2 = new java3_print(); // 같은 패키지 안에 있는 클래스 java3_print를 복제
		p2.delimiter = "****";

		java3_print p3 = new java3_print(); // delimiter는 초기화됨.

		p1.A();
		p1.B();
		p2.A();
		p2.B();
		p3.A();
	}
}