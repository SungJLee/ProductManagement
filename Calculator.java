import java.util.*;

public class Calculator {

	public double CalculateOrder(double sum) {
		Scanner scanf = new Scanner(System.in);		
		
		System.out.println("총 가격은 :" + sum + "원 입니다.");
		
		
		boolean swi = true;
		int number;
		number = scanf.nextInt();
		
		System.out.println("쿠폰을 가지고 계신가요?");
		System.out.println("1. 네     2. 아니오");
		
		while(swi == true) {
			switch(number){
				case 1 :
					sum = sum * 0.8;
					swi = false;
					System.out.println("20% 할인이 적용 되었습니다..");
				case 2 :
					swi = false;
				default :
					System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		System.out.println(sum + "원 입니다.");
		return sum;
	}
}

