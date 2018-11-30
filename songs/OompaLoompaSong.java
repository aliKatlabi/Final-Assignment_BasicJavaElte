package songs;

import java.util.ArrayList;

import java.io.BufferedReader;

import java.io.FileReader;

import java.io.IOException;

import java.io.FileNotFoundException;

public class OompaLoompaSong{
	
	
	private ArrayList<String> song;
	
	public OompaLoompaSong(int linesNum)throws FileNotFoundException,IOException{
		
		BufferedReader br  = new BufferedReader(new FileReader("OompaLoompaSong.txt"));
		String line;
		while((line=br.readLine())!=null){
			song.add(line);
		}
	}
	
	
	public String sing(){
		
		
		
	}
	
	
}