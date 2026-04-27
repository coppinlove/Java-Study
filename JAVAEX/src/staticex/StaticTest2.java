package staticex;

/*static 변수는 '클래스가 메모리에 로딩될 때' 생성
모든 객체가 공유
객체 없이 사용 가능(클래스 이름으로 접근)
한 번만 생성됨(끝까지)*/
class Counter2 { //Counter2 클래스 생성
	static int cnt = 0; //static: 객체 생성 없이 사용
	
	static void increase() { //객체 없이 클래스 이름으로 호출 가능
		cnt++;
	}
}

public class StaticTest2 {
	public static void main(String[] args) {
		
		Counter2.increase(); //Counter2의 increase메서드 호출
		Counter2.increase();
		
		System.out.println("count: " + Counter2.cnt);
	}

}
                                                                      