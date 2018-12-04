package models;



public class Product{
	
	private String description;
	
	private long barcode;
	
	private String serialNumber;
	
	private GoldenTicket prizeTicket;
	
	public Product(){}
	
	public Product(String desc,long bCode, String sNum ){
		
		this.description	=	desc;
		
		this.barcode		=	bCode;
		
		this.serialNumber	=	sNum;
		
		this.prizeTicket	=	null;
		
	}
	
	public String getDescription(){
		
		return this.description;
	}
	public long getBarCode(){
		
		return this.barcode;
	}
	public String getSerialNumber(){
		
		return this.serialNumber;
	}
	public GoldenTicket getPrizeTicket(){
		
		return this.prizeTicket;
	}
	
	public void setDescription(String desc){
		
		this.description	=	desc;
	}
	public void setBarCode(long bCode){
		
		this.barcode	=	bCode;
		
		
	}
	public void setSerialNumber(String sNum){
		
		this.serialNumber	=	sNum;
	}
	public void setPrizeTicket(GoldenTicket GoldenT){
		
		this.prizeTicket	=	GoldenT;
		
	}
	
	public boolean isGolden(){
		
		return (	prizeTicket	!=	null	)?true:false;
	}
	
	@Override
	
	public String toString(){
		
		return 	 this.barcode +":" 
				+this.serialNumber+":" 
				+ this.description +":Prize Ticket:"
				+ prizeTicket;
	}
	
	
}