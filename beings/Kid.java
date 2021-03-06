package beings;

import java.util.Date;

import java.text.SimpleDateFormat;

import java.text.ParseException;

import java.util.ArrayList;

import models.Product;

public class Kid extends Being{
	
	private Date birthDay;
	
	private ArrayList<Product> purchases;
	
	private String placeOfBirth;

	public Kid(int code, String name , String date , String place)throws ParseException{
		
		super(code,name);
		
		SimpleDateFormat bdFormat = new SimpleDateFormat("yyyy.mm.dd");
		
		this.birthDay			=		bdFormat.parse(date);
		
		this.placeOfBirth	= 		place;
		
		this.purchases = new ArrayList<>();
	}
	
	public Date getBirthDay(){
		
		return this.birthDay;
		
	}
	public ArrayList<Product> getPurchaseList(){
		
		return this.purchases;
		
	}
	
	public String getPlaceOfBirth(){
		
		return this.placeOfBirth;
		
	}
	
	public void setBirthDay(String date) throws ParseException{
		
		SimpleDateFormat bdFormat	= 		new SimpleDateFormat("yyyy.mm.dd");
	
		this.birthDay				=		bdFormat.parse(date);
		
	}
	
	public void setPurchaseList(ArrayList<Product> list){
		
		this.purchases				=		list;
		
	}
	
	public void setPlaceOfBirth(String place){
	
		this.placeOfBirth			=		place;
		
	}
	
	public void purchase(Product p) {
		
			
		purchases.add(p);
		
		
	}
	
	public boolean hasGoldenTicket(){
		
		for(Product p : this.purchases){
			
			if(p.isGolden()){
				
				return true;
				
			}
			else{
				
				return false;
			}
		}
		return false;
		
		
	}
	
	
	@Override
	
	public String toString(){
		
		return 	super.toString()+"\n"+
				" birthD: "	+this.birthDay.toString()+
				" born: "	+this.placeOfBirth+
				((this.hasGoldenTicket())?":Golden":" ")+"\nPuchases:"+
				this.getPurchaseList();
		}
	
	
}
