package study;
import java.util.*;
public class ex25 {
	public static void main(String[] args){
		int sum = 0;
		int num = 0;
		System.out.print("수입력");
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		num = Integer.parseInt(tmp);
		
		while(num!=0){
			sum+=num%10;
			System.out.printf("sum=%3d, num=%d%n", sum, num);
			num/=10;
		}
		System.out.println("각자리수합:"+sum);
	}
}
