package calculate_ebill;
import java.util.*;

public class discount {
	
	

		@SuppressWarnings("resource")
		public static void main(String[] args)  {
		int choice;
		Scanner any=new Scanner(System.in);
		discount d=new discount();
		int con;
		
		
		do {
			System.out.println("which product do you want");
			System.out.println("1.clothes\n2.grossery\n3.ornaments\n4.electronic items\n5.Exit ");
			 choice =any.nextInt();
			 switch(choice) {
			 case 1:
				 System.out.println("discount for cloth is 10% from price value ");
				 System.out.println("enter the price amount of the clothes:");
				 int amount=any.nextInt();
				int calculation= d.calculate(10,amount);
				System.out.println("amount to be paid :"+calculation);
			
				 break;
			 case 2:
				 System.out.println("discount for grossery is 20% from price value ");
				 System.out.println("enter the price amount of products:");
				 int amount1=any.nextInt();
			int calculation1=	d.calculate(20,amount1);
					System.out.println("amount to be paid :"+calculation1);
				
				 break;
			 case 3:
				 System.out.println("discount for ornaments is 5% from price value ");
				 System.out.println("enter the price amount of the  ornaments:");
				 int amount2=any.nextInt();
				int calculation2=d.calculate(5,amount2);
					System.out.println("amount to be paid :"+ calculation2);
				 break;
			 case 4:
				 System.out.println("discount for electronics item is 25% from price value ");
				 System.out.println("enter the price amount of the electronic devices:");
				 int amount3=any.nextInt();
			int calculation3=d.calculate(25,amount3);
					System.out.println("amount to be paid :"+calculation3);
				 break;
			 case 5:
				 System.exit(0);
			 }
			 
			 System.out.println("you want continue press 1");
			  con=any.nextInt();
			
		}while(con==1);
		

			
		}

		public int calculate(int i, int amount) {
			int value =100-i;
			int s=0;
		  s=(value*amount)/100;
			// TODO Auto-generated method stub
			return s;
		}
	}



		



