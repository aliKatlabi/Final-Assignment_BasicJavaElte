package factory;

import java.util.Date;

import java.text.SimpleDateFormat;

import java.text.ParseException;


public class GoldenTicket{
	
	private String code;
	
	private Date raffled;
	
	public GoldenTicket(){}
	
	public GoldenTicket(Date raffled){
		
	
		this.raffled	=		raffled;
		
		
	}
	
	
	public GoldenTicket(String code, Date raffled){
		
	
		this.raffled	=		raffled;
		
		this.code		=		code;
		
	}
	
	public String getCode(){
		
		return this.code;
		
	}
	
	public Date getRaffled(){
		
		return this.raffled;
		
	}
	
	public void setCode(String code){
			
		this.code		=		code;
		
	}
	
	public void setRaffled(Date raffled){
		
		
		this.raffled 	= 		raffled;
		
	}
	
	public boolean isRaffled(){
		
		return 	this!=null;
		
	}
	@Override
	
	public String toString(){
		
		return this.code +":on:"+ this.raffled.toString;
	}
	
	
	
}