import java.io.*;
import java.util.*;

public class Histogram {
	public static void main(String[] args) throws IOException{
		Scanner sf = new Scanner(new File("Data2.txt"));
		int maxIndx = -1;
		String text[] = new String[1000];
	       
		while(sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
			}
	       
	       sf.close();
	       
	       //Populate Map Code
	       String words[] = text[0].split(", ");
	       Map<String, Integer> map = new TreeMap<String, Integer>();
	       
	       for(int i = 0; i < words.length; i++) {
	    	   int numAppear = 0;
	    	   int x = 0;
	    	   
	    	   if(map.containsKey(words[i]) == false) {
	    		   map.put(words[i], 1);
	    	   } else {
	    		   while(x < words.length) {
		    			 if(words[i].equals(words[x])) {
		    				 numAppear ++;
		    			 }
		    			 x ++;
		    		   }
		    		  map.replace(words[i], numAppear); 
	    	   }
	       }
	       
	       Set ks = map.keySet();
	       Iterator iter = ks.iterator();

	       System.out.printf("%-15s%15s%n", "Words", "Frequency");
	       System.out.println();
	       while(iter.hasNext()) {
	    	   Object key = iter.next();
	    	   Object value = map.get(key);
	    	   String frequency = "";
	    	   
	    	  while(frequency.length() < (int) value) {
	    		  frequency += "*";
	    	  }
	    	   System.out.printf("%-15s%15s%n", key, frequency);
	       }
	}
}
