
import java.util.Scanner;

import models.*;

import beings.*;

import songs.*;

import java.lang.Exception;

import java.util.InputMismatchException;

import java.io.IOException;

import java.io.FileNotFoundException; 

public class UserInterface{
	
	static Shop shop ;
	
	public static void main(String[] args){
		int cnt=0;
		
		boolean noExit	=	true;
		
		Scanner input	=	new Scanner(System.in);
		
		shop = new Shop();
		
		while(noExit){
			
			System.out.printf("%nChoose from..%n%n1.Register Prize tickets%n2.List all prize tickets%n3.List only raffled tickets%n4.Create a new Oompa Loompa song%n");
			
			System.out.printf("5.Process Beings%n6.Process Products%n7.Ruffle tickets%n8.Register sale%n9.List winners%n10.test the system %n11.Exit%n");
		
			try{	
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
								System.out.println("number of lines ?");
								
								int lineNo = input.nextInt();
								try{
							
								OompaLoompaSong OS = new OompaLoompaSong(lineNo);
								
								String newSong=OS.sing();
								
								System.out.print(newSong);
								
								}catch(FileNotFoundException e){
									
									System.out.print("file");
									
								}catch(IOException e){
									
									System.out.print("io");
								}
								break;
						
						case 5:
								System.out.printf("1.register kid%n2.register oompaLoompa%n3.list beings%n");
							
									int ans1 = input.nextInt();
									if(ans1==1){
									
										System.out.print("Code : ");
										
										int code = input.nextInt();
									
										System.out.print("name : ");
										
										String name =input.next();
										
										System.out.print("birth day (dd.mm.yyyy): ");
											
										String birthDay =input.next();
										
										System.out.print("place of birth : ");
										
										String placeOfBirth=input.next();
										try{
											
										shop.registerBeing(new Kid(code,name,birthDay,placeOfBirth));
										
										}catch(Exception ParseException){
											System.out.println("Date_Formate:dd.mm.yyy");}
										
										
									}
									if(ans1==2){
										
										
										System.out.print("Code : ");
										
										int code	= input.nextInt();
										
										
										System.out.print("name : ");
										
										String name	=	input.next();
										
										System.out.print("height : ");
										
										int height	=	input.nextInt();
										
										System.out.print("favorite food : ");
										
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
										
										long barcode		= input.nextLong();
										
										System.out.print("serial Number : ");
										
										String SN			=	input.next();
										
										System.out.print("product description : ");
										
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
										
										System.out.println("... done ruffling !");
										
										
									}else{
										
										System.out.println("... fail : ruffle again !");
								
									}
								
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
								System.out.println("populate the system with Beings Products and ticketPrizes");
								System.out.println("Do it ? y/n");
								String ans=input.next();
								if(cnt<1){
								if(ans.equals("y")){
									
									testing();
									
									cnt++;
									
								}
								}else{System.out.println("Allowed once");}
							
								break;
						
								
						case 11:
								
								input.close();
								
								noExit=false;
								
								break;
								
								
								
						
						default:
								break;
					}
					
			}catch(InputMismatchException e){
							
								System.out.println("numeric value expected!");
								
								input.next();
								
							}
		}
	}
	
	static void testing(){
		
		double b =300000000.0;
		
		shop.registerPrizeTicket("Winner1");
		shop.registerPrizeTicket("Winner2");
		shop.registerPrizeTicket("Winner3");
		shop.registerPrizeTicket("Winner4");
		try{
				Kid k1= new Kid(1,"Somer","3.12.2003","Syria");
				shop.registerBeing(k1);
				Kid k2= new Kid(2,"Simon","23.1.1999","Syria");
				shop.registerBeing(k2);
				Kid k3= new Kid(3,"Basem","13.8.2000","Syria");
				shop.registerBeing(k3);
				Kid k4= new Kid(4,"Ali","4.11.2005","Syria");
				shop.registerBeing(k4);
				Kid k5= new Kid(5,"Kamal","17.2.2005","Syria");
				shop.registerBeing(k5);
				
				}catch(Exception ParseException){System.out.println("Date_Formate:dd.mm.yyy");}
				
		OompaLoompa o1= new OompaLoompa(11,"omp",44,"Chees");
		shop.registerBeing(o1);
		OompaLoompa o2= new OompaLoompa(22,"domp",46,"Mashroom");
		shop.registerBeing(o2);
		OompaLoompa o3= new OompaLoompa(33,"lomp",51,"Candy");
		shop.registerBeing(o3);
		OompaLoompa o4= new OompaLoompa(44,"pomp",60,"Hony");
		shop.registerBeing(o4);
		
		//Product(String desc,long bCode, String sNum )
		Product p1=new Product("lolipop",101,"xxy");
		shop.registerProducts(p1);
		Product p2=new Product("Candy",101,"gty");
		shop.registerProducts(p2);
		Product p3=new Product("Chocolate",102,"vvf");
		shop.registerProducts(p3);
		Product p4=new Product("Juice",103,"bbb");
		shop.registerProducts(p4);
		Product p5=new Product("ApplePie",103,"qpq");
		shop.registerProducts(p5);
		Product p6=new Product("SurprizeEgg",104,"yyy");
		shop.registerProducts(p6);
		//some effects
		System.out.println("... adding Kids");
		for(double i=0;i<b;i++){};
		System.out.println("... adding OompaLoompas");
		for(double i=0;i<b;i++){};
		System.out.println("... adding Products");
		for(double i=0;i<b;i++){};
		//shop.ruffleTickets(rn)
		
		Scanner input = new Scanner(System.in);
		System.out.println("Do you the system to test ruffling tickets ,selling products to kids ? y/n");
		String ans=input.next();
		
		if(ans.equals("y")){
		shop.ruffleTickets(3);
		
		//Kid(int code, String name , String date , String place)
		
				//OompaLoompa(int code , String name , int height , String ff)
			
				//shop.makeSall(userCode,productBarCode);
				
				shop.makeSall(1,101);
				shop.makeSall(1,103);
				shop.makeSall(2,101);
				shop.makeSall(3,103);
				shop.makeSall(4,102);
				shop.makeSall(5,104);
				shop.makeSall(5,103);
				shop.makeSall(4,101);
				shop.makeSall(2,102);
				
				
				System.out.println("... 3 tickets were ruffeled!");
				for(double i=0;i<b;i++){};
				System.out.println("... selling Products to kids");
				for(double i=0;i<b;i++){};
				System.out.println("... all products are sold .. empty stock");
				System.out.println("... Done!!");
				System.out.println("Now you can List Winners");
				System.out.println("Note:since it is (empty stock) then Option 3 and 7 wont work(no products to operate on) .. can be tested manually!");
				}
				
	
	}
}
