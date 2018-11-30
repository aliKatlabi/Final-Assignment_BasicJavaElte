package beings;


public abstract class Being{
	
	private int code;
	private String name;
	
	
	public Being(int code,String name){
		
		this.code=code;
		this.name=name;
		
	}
	
	public int getCode(){
		return this.code;
	}
	
	
	public String getName(){
		return this.name;
		
	}
	
	public void setCoed(int code){
		
		this.name=name;
	
	}
	
	public void setName(String name){
		
		this.name=name;

	}
	
	
	@Override
	
	public String toString(){
		
		return this.code+" "+this.name;
		
	}
	
	@Override
	
	public boolean equals(Object that){
		
		if(that==null){
			return false;
		}
		if(this==(Being)that){
			return true;
		}
		if(that instanceof Being)
			return this.name.equals(((Being)that).name)&&this.code==((Being)that).code;
		
		return false;
		
	}
	
	
	
}