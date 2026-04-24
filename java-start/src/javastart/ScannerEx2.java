package javastart;

import java.util.Scanner;

public class ScannerEx2 {

   public static void main(String[] args) {
      Scanner sc =  new  Scanner(System.in);
      
      System.out.print("이름 입력");
      String name=sc.nextLine();
      
      System.out.println("주소 입력");
      String addr=sc.nextLine();
      
      System.out.println("나이 입력");
      int   age=sc.nextInt();
      
      System.out.println("체중 입력");
      double wei=sc.nextDouble();
      
      System.out.println("결혼여부(true/false)");
      boolean mar=sc.nextBoolean();
      
      System.out.println("이름:  "+name);
      System.out.println("주소:  "+addr);
      System.out.println("나이:  "+age);
      System.out.println("체중:  "+wei);
      System.out.println("결혼:  "+mar);   
      
      sc.close();// 입력도구 종료, 자원정리

   }

}
