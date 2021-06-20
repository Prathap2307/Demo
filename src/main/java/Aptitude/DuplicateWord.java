package Aptitude;

import java.util.ArrayList;
import java.util.List;

public class DuplicateWord {
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  String sentence ="big black bug bit a big black dog on his big black nose"; 
		  
		// String[] arrayTemp = sentence.split(" ");
		  
		 // String[] sentenceArray  = new String[arrayTemp.length];
		  
		 String[]  sentenceArray  = sentence.split(" ");
		  
		  String[] sentenceArray2  = sentence.split(" ");

		  
		  List<String> ar = new ArrayList<String>();
		  
		//  System.out.println("arrayTemp.length -->" + arrayTemp.length);
		
		  /*  for(String word :sentenceArray) {
			 // System.out.println("word -->" + word);
			  
			  if(word == word) {
				  
			  }
		  }*/
		  
		/*  for(int i = 0; i <= sentenceArray.length; i++) {
			  System.out.println("i --> " + i );
			  if(sentenceArray[i] == sentenceArray[i+1]) {
				  ar.add(sentenceArray[i]);
			  }
			  for(int j = 0; j <= sentenceArray.length; j++) {
				  
			  }
		  } */
		  
		  /* for(int i = 0; i < sentenceArray.length; i++) {
			  System.out.println("i --> " + i );
			 
			  for(int j = 0; j < sentenceArray2.length; j++) {
				  if(sentenceArray[i] == sentenceArray2[j]) {
					  ar.add(sentenceArray[i]);
				  }
			  }
		  } */
		  
		  /* for(int i = 0; i < sentenceArray.length; i++) {
			  if(sentenceArray[i] == sentenceArray[i]) {
				  ar.add(sentenceArray[i]);
			  }
		  } */
		  
		  
		  for(int i = 0; i < sentenceArray.length; i++) {
			 // System.out.println("i --> " + i );
			 
			  for(int j = 1; j < sentenceArray2.length; j++) {
				  System.out.println("j --> " + j + "---"+ i );
				  if(sentenceArray[i] == sentenceArray2[j]) {
					  System.out.println(" inside");
					  ar.add(sentenceArray[i]);
				  }
			  }
		  } 
		  
		  System.out.println("ar --> " + ar);

	}

}
