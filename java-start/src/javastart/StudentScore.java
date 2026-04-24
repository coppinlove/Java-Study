package javastart;
import java.util.Scanner;

class StudentP{
	String name;
	int score;
	
	StudentP(String name, int score){
		this.name = name;
		this.score = score;
		
		
	}
}

public class StudentScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//학생 수 키보드로부터 입력
		System.out.print("학생 수를 입력하세요: ");
		int cnt = sc.nextInt(); //학생 수 만큼 배열 생성
		sc.nextLine();
		StudentP [] stu = new StudentP[cnt];
		
		for(int i = 0; i < stu.length; i++) {
			System.out.printf("%d번째의 학생의 이름을 입력하세요: ", i + 1);
			String name = sc.nextLine();
			System.out.print("점수를 입력하세요: ");
			int score = sc.nextInt();
			sc.nextLine();
			stu[i] = new StudentP(name, score);
		}
		
		
		while(true) {
			boolean found = false;
			System.out.print("검색할 이름은: ");
			String sname = sc.nextLine();
			
			if(sname.equals("그만") || sname.equals("그만해") || sname.equals("끝")) {
				break; //while 탈출
			}
			
			for(int i = 0; i < stu.length; i++) {
				if(stu[i].name.equals(sname)) {
					System.out.println("이름:" + stu[i].name + ", " + "점수:" + stu[i].score);
					found = true;
					sc.close();
					System.err.println("프로그램을 종료홥니다.");
					return; //모두 종료
				}
			}
			if(!found) {
				System.err.println("일치하는 이름이 없습니다.");
			}
//			else if(found) {
//				break; //while 탈출
//			}
		}
	}
}