	
	
	import java.util.Scanner;
	import java.util.*;
	
	public class main {
	
		public void LookUpEatingInventory(String inventoryname, Object inventory) { // 6번
			if(inventoryname.equals("cookie")) {
				System.out.println("쿠키의 양"+ inventoryname.amount);
			}else if(inventoryname.equals("cake")){
				System.out.println("케이크의 양" + inventoryname.amount);
			}
			
		}
		
		public double CalculateOrder(double sum) { // 3번
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
		
		public static void main(String[] args) {
		boolean swi = true;
		while(swi){
			
			System.out.println("-------------------------------------");
			System.out.println("1. 메뉴판");
			System.out.println("2. 주문");
			System.out.println("3. 계산");
			System.out.println("4. 매출조회");
			System.out.println("5. 판매내역조회");
			System.out.println("6. 재고관리");
			System.out.println("7. 나가기");
			
	  
			Scanner scan = new Scanner(System.in); 
			System.out.print("> ");
			int choice = scan.nextInt(); // 1 ~ 7번
	
		
	  
			switch(choice){
			            
				case 1:
					
					break;
			      
			    case 2:
			    	break;
			      
				case 3: 
					break;
			
				case 4:
					break;
			      
				case 5:
					break;
			
				case 6: 
					break;
			
			    case 7 : 
					swi = false;
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
		}
	}

	
	