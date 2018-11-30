package models;

import java.util.ArrayList;

import java.util.Random;

import java.util.Date;

import java.text.SimpleDateFormat;

import java.text.ParseException;

import beings.Being;

import beings.Kid;

import models.RandomList;


public class Shop{
	
	private ArrayList<Product> productsList;
	
	private ArrayList<GoldenTicket> prizeTicketList;
	
	private ArrayList<Being> beingsList;
	
	public Shop(){
		
		productsList		= 		new ArrayList<Product>();
		prizeTicketList 	=		new ArrayList<GoldenTicket>();
		beingsList 			= 		new ArrayList<Being>();
		
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
	
	
	
	/*
	//NOT USED
	public void ruffleGeneratedTickets(int ticketsNum) throws ParseException {
		
		for(int v : pickRandom(ticketsNum)){
			
			
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyMMddHHmm"+":GT:Generated");
			
			Date date		    =	 new Date();
			
			String code			=	dateFormat.format(date); 
			
			productsList.get(v).setPrizeTicket(new GoldenTicket(code,date));
			
		}
		
	}
	*/
	
	
	public boolean ruffleTickets(int ticketsNum) {
		
		int i=-1;
		
		RandomList RL			= 	new RandomList(ticketsNum,prizeTicketList.size());
		
		boolean ableToRuffle    =	prizeTicketList.size()>=ticketsNum && ticketsNum <=productsList.size();
		
		if(ableToRuffle){
			
				for(int v : RL.getRandomIndices()){
					
					i++;
					
					productsList.get(v).setPrizeTicket(prizeTicketList.get(i));
					}
				return true;
					
		}else{
			
			return false;
		}
		
	}
	
	
	
	
	public Product sell(long productBarCode){
		
		for(Product product : this.productsList){
					
					if(product.getBarCode()==productBarCode){
						
						productsList.remove(product);
						
						return product;
						
					}else{
						
						System.out.println("Check product barCode!");
					}
		}
					
		return null;
		
	}
	
	
	public void  makeSall(int userCode,long productBarCode){
		
		for(Being being : this.beingsList){
			
			if( being instanceof Kid	){
				
				if(		((Kid)being).getCode()==userCode	){
					
						((Kid)being).purchase(sell(productBarCode));
						
						break;
				}else{
					
				
					
					System.out.println("Check User Code!");
				}
			
			
			}else{
				
				System.out.println("sale can not be made");
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
	public void listBeings(){
		
		if(beingsList.size()>0){
			
			for(Being B : beingsList ){
			
			System.out.println(B);
			
			}
			
		}else{
			
		System.out.println("no beings found!");
		
		}
	}
	
	
	public void listRaffledTickets(){
		
		for(Product product : productsList){
			
			if(product.isGolden()){
				
				System.out.println(product.getPrizeTicket());
			}
		}
	}
	
	public void listProducts(){
		
		if(productsList.size()!=0){
			
			for(Product p : productsList ){
			
			System.out.println(p);
			
			}
			
		}else{
			
		System.out.println("empty stock!");
		
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