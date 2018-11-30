package models;

import java.util.ArrayList;

import java.util.Random;


public class RandomList{
	
	private ArrayList<Integer> randomIndices =	new ArrayList<Integer>();
	
	public RandomList(int numberToPick,int listSize){
		
		PickRandomly(numberToPick ,listSize);
		
	}
	
	public ArrayList<Integer> getRandomIndices(){
		
		return randomIndices;
		
		}
	
	protected void PickRandomly(int numberToPick , int listSize){
		
		if(numberToPick	>0	&&	numberToPick	<=	listSize	)
			
		{
			
				Random rand = new Random();
				
				boolean isDifferentIndex ;
				
				
				randomIndices.add(rand.nextInt(listSize));
					
				
				while(randomIndices.size()<numberToPick){
				
					int newV	=	rand.nextInt(listSize);
					
					isDifferentIndex =true;
					
					for(int v : randomIndices )
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
								
								randomIndices.add(newV);
								
							}
				}
				
			
		}
		
			
		
	}
}