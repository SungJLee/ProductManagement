package cafe;

import java.util.Scanner;

public class Menu {
	
	String name;
	double price;
	int amount;
	
	public static void main(String[] args) {
		
		boolean swi = true;
		while(swi){
			
			System.out.println("----------원하시는 제품을 선택해주세요.-------------");
			System.out.println("1. 디저트");
			System.out.println("2. 음료");
			System.out.println("3. 뒤로가기");
			
			Scanner scan = new Scanner(System.in); 
			System.out.print("> ");
			int choice = scan.nextInt();
	
			switch(choice){
			            
				case 1:
					Eattings eattings = new Eattings();
					eattings.main(args);
					break;
			      
			    case 2:
			    	Drinks drinks = new Drinks();
			    	drinks.main(args);
					swi = false;
					break;
					
			    case 3:
			    	main main = new main();
			    	main.main(args);
					break;
				default :
					System.out.println("잘못 입력하셨습니다.");
					break;
				}
			}
		}
	}
