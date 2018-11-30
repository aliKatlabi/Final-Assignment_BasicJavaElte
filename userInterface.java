
import java.util.Scanner;

import models.Shop;

public class userInterface{
	
	
	public static void main(String[] args){
		
		booleac noExit	=	true;
		
		Scanner input	=	new Scanner(System.in);
		
		Shop shop = new Shop();
		
		while(noExit){
			
			System.out.printf("%nChoose from..%n%n1.Register Prize tickets%n%n12.List all prize tickets%n3.List only raffled tickets%n4.Create a new Oompa Loompa song%n");
			
			System.out.printf("5.Register Beings%n16.Register Products%n7.Ruffle tickets%n8.Register sale%n9.List winners%n10.Exit%n");
			
			int n = sc.nextInt();
			
			switch(n){
				
				case 1:
				
						System.out.print("enter ticket Code : ");
						
						String putCode = sc.next();
						
						shop.registerPrizeTicket(putCode);
						break;
				case 2:
				
						shop.listPrizeTicket();
						break;
						
				case 3:
				
						shop.listRaffledTickets();
						break;
				case 4:
				
						break;
				
				case 5:
						System.out.printf("1.kid%n2.oompaLoompa%n");
						int ans = sc.nextInt();
						if(ans==1){
							
							
							System.out.print("Code : ");
							
							int code = sc.nextInt();
							
							System.out.print("name : ");
							
							String name =sc.next();
							
							System.out.print("birth day : ");
								
							String birthDay =sc.next();
							
							System.out.print("place of birth : ");
							
							String placeOfBirth=sc.next();
							
							shop.registerBeing(new Kid(code,name,birthDay,placeOfBirth));
						}
						if(ans==2){
							
							
							System.out.print("Code : ");
							
							int code	= sc.next();
							
							System.out.print("name : ");
							
							String name	=	sc.next();
							
							System.out.print("height : ");
							
							int height	=	sc.nextInt();
							
							System.out.print("favorate food : ");
							
							String fFood=	sc.next();
							
							shop.registerBeing(new OompaLoompa(code,name,height,fFood));
							
							
						}
						else{
							
							System.out.println("Choose either Kid or OompaLoompa");
							
						}
						
						break;
				
				case 6:
						System.out.print("barcode : ");
						
						long barcode	= sc.nextLong();
						
						System.out.print("serial Number : ");
						
						String SN	=	sc.next();
						
						System.out.print("product decription : ");
						
						String decription	=	sc.next();
						
						shop.registerProducts(new Product(decription,barcode,SN));
				
				case 7:
						
						System.out.print("number of tickets to ruffle : ");
						
						int rn = sc.nextInt();
						
						if(shop.ruffleTickets(rn)){
							System.out.println("done ruffling !");
						}else{
							//todo
						};
						
						
				case 8:
						System.out.print("User Code : ");
								
						int userCode =sc.nextInt();
							
						System.out.print("product BarCode : ");
							
						long productBarCode placeOfBirth=sc.nextLong();
							
						shop.makeSall(userCode,productBarCode);
				
				case 9:
						shop.winnerkids();
						
						break;
						
				case 10:
				
						noExit=false;
						
						break;
				
				default:
						break;
			}
			
			
		}
	}
}