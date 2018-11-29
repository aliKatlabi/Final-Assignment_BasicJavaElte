
import java.util.Scanner;

import models.*;

import beings.*;

import java.lang.Exception;

public class userInterface{
	
	
	public static void main(String[] args){
		
		boolean noExit	=	true;
		
		Scanner input	=	new Scanner(System.in);
		
		Shop shop = new Shop();
		
		while(noExit){
			
			System.out.printf("%nChoose from..%n%n1.Register Prize tickets%n2.List all prize tickets%n3.List only raffled tickets%n4.Create a new Oompa Loompa song%n");
			
			System.out.printf("5.Process Beings%n6.Process Products%n7.Ruffle tickets%n8.Register sale%n9.List winners%n10.Exit%n");
			
			int n = input.nextInt();
			
			switch(n){
				
				case 1:
				
						System.out.print("enter ticket Code : ");
						
						String putCode = input.next();
						
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
						System.out.printf("1.register kid%n2. register oompaLoompa%n#.list beings%n");
						int ans1 = input.nextInt();
						if(ans1==1){
							
							
							System.out.print("Code : ");
							
							int code = input.nextInt();
							
							System.out.print("name : ");
							
							String name =input.next();
							
							System.out.print("birth day : ");
								
							String birthDay =input.next();
							
							System.out.print("place of birth : ");
							
							String placeOfBirth=input.next();
							try{
								
							shop.registerBeing(new Kid(code,name,birthDay,placeOfBirth));
							
							}catch(Exception ParseException){System.out.println("unparsable");}
						}
						if(ans1==2){
							
							
							System.out.print("Code : ");
							
							int code	= input.nextInt();
							
							System.out.print("name : ");
							
							String name	=	input.next();
							
							System.out.print("height : ");
							
							int height	=	input.nextInt();
							
							System.out.print("favorate food : ");
							
							String fFood=	input.next();
							
							shop.registerBeing(new OompaLoompa(code,name,height,fFood));
							
							
						}
						
						if(ans1==3){
							
							shop.listBeings();
						}
						
						break;
				
				case 6:
						System.out.printf("1.register Product %n2.List products %n");
						int ans2 = input.nextInt();
						if(ans2==1){
							System.out.print("barcode : ");
							
							long barcode	= input.nextLong();
							
							System.out.print("serial Number : ");
							
							String SN	=	input.next();
							
							System.out.print("product decription : ");
							
							String decription	=	input.next();
							
							shop.registerProducts(new Product(decription,barcode,SN));
						}
						if(ans2==2){
							
							shop.listProducts();
							
						}
						break;
				
				case 7:
						
						System.out.print("number of tickets to ruffle : ");
						
						int rn = input.nextInt();
						
						if(shop.ruffleTickets(rn)){
							
							System.out.println("done ruffling !");
						}else{
							//todo
						};
						break;
						
				case 8:
						System.out.print("User Code : ");
								
						int userCode =input.nextInt();
							
						System.out.print("product BarCode : ");
							
						long productBarCode =input.nextLong();
							
						shop.makeSall(userCode,productBarCode);
						
						break;
				
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