package songs;

import java.util.ArrayList;

import java.util.Scanner;

import java.io.FileReader;

import java.io.IOException;

import java.io.FileNotFoundException;

import java.util.Random;

import java.io.FileInputStream;

import models.RandomList;


public class OompaLoompaSong{
	
	
	private ArrayList<String> song = new ArrayList<>();
	
	private int linesNo ;
	
	public OompaLoompaSong(int linesNum)throws FileNotFoundException,IOException{
	
		this.linesNo		=	linesNum;
		
		Scanner scanner 	= 	new Scanner(new FileInputStream("OompaLoompaSong.txt"));
		
		while(scanner.hasNextLine()){
			
			song.add(	scanner.nextLine()	);
			
		}
		
		scanner.close();
		
	}
	
	
	public String sing(){
		
		String newSong	=	"";
		
		RandomList RL	= 	new RandomList(linesNo,song.size());
		
		
		if(RL.getRandomIndices()==null){
			
			return "Under"+song.size()+" !\n";
			
		}
		for(int i: RL.getRandomIndices() ){
			
			newSong +=	song.get(i) + "\n";
		}
		
		return newSong;
		
		
	}

	
	
}