	package cafe;
	
	import java.util.Scanner;
	import java.util.*;
	
	public class main {
		
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
			
			    case 7 : // ������
					swi = false;
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
		}
	}
