package models;

import java.util.ArrayList;

import java.util.Random;

import java.util.Date;

import java.text.SimpleDateFormat;

import java.text.ParseException;

import beings.Being;

import beings.Kid;

public class Shop{
	
	private ArrayList<Product> productsList;
	
	private ArrayList<GoldenTicket> prizeTicketList;
	
	private ArrayList<Being> beingsList;
	
	public Shop(){
		
		productsList		= 		new ArrayList<Product>;
		prizeTicketList 	=		new ArrayList<>;
		beingsList 			= 		new ArrayList<>;
		
	}
	
	public void setProductsList( ArrayList<Product> p){
		
		this.productsList=p;
		
	}
	
	public ArrayList<Product> getProductsList(){
		
		return this.productsList;
		
	}
	
	public void produce(Product p){
		
		this.productsList.add(p);
		
	}
	
	//kid.puchase(Product sell(long barCode));
	
	
	

	//NOT USED
	public void ruffleGeneratedTickets(int ticketsNum) throws ParseException {
		
		for(int v : pickDifferentProducts(ticketsNum)){
			
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddHHmm");
			
			Date date		    =	 new Date();
			
			String code			=	dateFormat.format(date); 
			
			productsList.get(v).setPrizeTicket(new GoldenTicket(code,date));
			
		}
		
	}
	
	
	public boolean ruffleTickets(int ticketsNum) {
		int i=-1;
		
		if(prizeTicketList.size()>ticketsNum){
			
				for(int v : pickDifferentProducts(ticketsNum)){
					i++;
					productsList.get(v).setPrizeTicket(prizeTicketList.get(i));
					}
				return true;
					
		}else{
			
			return false;
		}
		
	}
	
	
	public ArrayList<Integer> pickDifferentProducts(int ticketsNum){
		
		if(ticketsNum>0&&ticketsNum<productsList.size())
			
		{
			
				Random rand = new Random();
				
				boolean isDifferentIndex ;
				
				ArrayList<Integer> index=new ArrayList<>();
				
				index.add(rand.nextInt(productsList.size()));
					
				
				while(index.size()<=ticketsNum){
				
					int newV	=	rand.nextInt(productsList.size());
					
					isDifferentIndex =true;
					
					for(int v : index )
					{
						
									if(v==newV)
									{
										
										isDifferentIndex=isDifferentIndex&&false;
										
										break;
									}
									else
									{
										
											isDifferentIndex=isDifferentIndex&&true;
											
									}
					}
						  
						  
							if(isDifferentIndex){
								
								index.add(newV);
								
							}
				}
				
				return index;
		}
		
		return null;
		
		
		}
	
	
	public Product sell(long productBarCode){
		
		for(Product product : this.productsList){
					
					if(product.getBarCode()==productBarCode){
						
						productsList.remove(product);
						
						return product;
						
					}
		}
					
		return null;
		
	}
	
	
	public void makeSall(int userCode,long productBarCode){
		
		for(Being being : this.beingsList){
			
			if(being instanceof Kid ){
				
				((Kid)being).purchase(sell(productBarCode));
			
			
			}
		}
	}
		
	
	public void listPrizeTicket(){
		
		if(prizeTicketList.size()!=0){
			
			for(GoldenTicket gt : prizeTicketList ){
			
			System.out.println(gt);
			
			}
			
		}else{
			
		System.out.println("no prize tickets found!");
		
		}
	}
	
	
	public void listRaffledTickets(){
		
		for(Product product : productsList){
			
			if(product.isGolden()){
				
				System.out.println(product.getPrizeTicket());
			}
		}
	}
	
	
	
	public void registerPrizeTicket(String Code){
			
		
		prizeTicketList.add(new GoldenTicket(Code,new Date()));
		
	}
	
	
	public void registerBeing(Being B){
		
		beingsList.add(B);
		
		
	}
	
	
	public void registerProducts(Product p){
		
		this.productsList.add(p);
	
	
}
	
	
	
	
	
	public void winnerkids(){
		
		for(Being being : beingsList){
			
			if(being instanceof Kid) {
				
				if(		((Kid)being).hasGoldenTicket()		){
					
					System.out.println((Kid)being);
				}
			}
		}
	}
	
	
	
	
	
	
	
	
	
}