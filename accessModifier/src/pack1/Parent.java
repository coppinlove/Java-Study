package pack1;

public class Parent{
	public static void main(String[] args) {
		
	}
	
	public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLACK = "\u001B[30m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String MINT = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    
    public static final String RESET = "\u001B[0m";
    
    
    
    
    
    
	//System.out.println("=== 같은 패키지 테스트 ==="); //메서드 안에 있지 않다
	public int a = 10;
	protected int b = 20;
	int c = 30;
	private int d = 40;
	
	public void show() { //여기서의 d 변수는 같은 클래스 내에서 실행화는 것이기 떄문에 가능하다.
		System.out.println("Parent 메서드 실행");
		System.out.println(RED + "a = " + a + RESET);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
	}
}
