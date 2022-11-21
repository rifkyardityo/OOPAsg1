import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	Scanner scan= new Scanner(System.in);
	ArrayList<crypto> arr= new ArrayList<>();
	
	
	public Main() {
		Menu();
		
	}
	public void Menu(){
	System.out.println("Menu");
	System.out.println("1.View wallet");
	System.out.println("2.Add wallet");
	System.out.println("3.Delete wallet");
	System.out.println("4.Exit");
		int pilihan;
		System.out.print("Input Must Between 1-4 : ");
		pilihan= scan.nextInt();
		scan.nextLine();
		switch (pilihan) {
		case 1:
			View();
			System.out.println("Press Enter To Go Back");
			scan.nextLine()
			menu();
			break;
		case 2:
			Add();
			System.out.println("Press Enter To Go Back");
			scan.nextLine()
			menu();
			break;
		case 3:
	
		break;

		case 4:
			System.out.println("exit");
			break;
		}

		
		
	}
	

	
//add wallet
	int idx =-2;
	Double quantity;
	String initial;
	String name;
	String type;
	Double price;
	
	
	public void Add() {
		
		//index
	
			do {
				System.out.print("Choose Crypto by Index [Choose 3 more] : ");
				try {
					idx= scan.nextInt();
					
				} catch (Exception e) {
					System.out.println("Input yang benar : ");
				}
				scan.nextLine();
			} while (idx < 1 || idx > 5  );
		
		
		//quantity
		do {
			System.out.print("Input Quantity for"+ initial + " : ");
			quantity= scan.nextDouble();
			scan.nextLine();
		
		} while (quantity>0);
	}

	

	//view
	int total = price*quantity;
		public void View() {
			if (arr.isEmpty()) {
				System.out.println("TIDAK ADA DATA");
			}else {for (int i = 0; i < array.length; i++) {
				System.out.println(arr.get(i).getInitial()+" "
						+arr.get(i).getName()
						+arr.get(i).getType()+" Price In USD "
						+arr.get(i).getPrice()+" Quanitity "
						+arr.get(i).getQuantity()+ "    Total Quantity : " + total);
				
				
			}
				}
			
			
			
			
		}
	
	
	
	
	public static void main(String[] args) {
		new Main();

		
	
	}

}
