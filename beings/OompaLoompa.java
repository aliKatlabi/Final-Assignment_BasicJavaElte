package beings;

import beings.Being;


public class OompaLoompa extends Being{
	
	private int height;
	
	private String favorateFood;
	
	
	public OompaLoompa(int code , String name , int height , String ff){
		
		super(code,name);
		
		this.height=height;
		
		this.favorateFood=ff;
		
	}
	
	public int getHeight(){
		
		return this.height;
	}
	
	public String getFavorateFood(){
		
		return this.favorateFood;
	}
	
	public void setHeigh(int height){
		
		this.height=height;
		
	}
	public void setFavorateFood(String ff){
		
		this.favorateFood=ff;
		
	}
	
	@Override
	
	public String toString(){
		
		return 	super.toString()+"\n"+
						"height:"	    +this.height+
						"favorite Food: "		+this.favorateFood;
		}
	
	
}