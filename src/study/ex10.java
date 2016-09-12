package study;

import java.util.*;

public class ex10 {
	public static void main(String[] args){
		int score = 0;
		char grade = ' ';
		System.out.print("����� ������ �Է��ϼ���.(1~100)>");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		score = Integer.parseInt(tmp);
		
		switch(score/10){
		case 10 :
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			default :
				grade = 'F';
				
		}
		
		System.out.println("����� ������ "+grade+"�Դϴ�.");
		scanner.close();
	}
}