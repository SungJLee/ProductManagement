package cafe;

import java.util.Scanner;

public class Drinks extends Menu{
	public static void main(String[] args) {
		
			
			boolean swi = true;
			while(swi){
				
				System.out.println("----------원하시는 제품을 선택해주세요.-------------");
				System.out.println("1. 뜨거운 음료");
				System.out.println("2. 차가운 음료");
				System.out.println("3. 뒤로가기");
				
				Scanner scan = new Scanner(System.in); 
				System.out.print("> ");
				int choice = scan.nextInt();
		
				switch(choice){
				            
					case 1:
						HotDrinks hotdrinks = new HotDrinks();
						hotdrinks.main(args);
						break;
				      
				    case 2:
				    	IceDrinks icedrinks = new IceDrinks();
				    	icedrinks.main(args);
						swi = false;
						break;
						
				    case 3:
				    	Menu menu = new Menu();
				    	menu.main(args);
						swi = false;
						break;
					default :
						System.out.println("잘못 입력하셨습니다.");
						break;
				}
			}
	}	
}
