import java.util.*;
import java.io.*;

public class CodeTalker {
	public static void main(String[] args) throws IOException{
		Scanner sf = new Scanner(new File("Data.txt"));
		int maxIndx = -1;
		String text[] = new String[1000];
	       
		while (sf.hasNext()) {
			maxIndx++;
			text[maxIndx] = sf.nextLine();
			}
	       
	       sf.close();
	       
	       for(int i = 0; i < 15; i++) {
	    	   System.out.println(text[i]);
	       }
	       System.out.println();
	       //Map Code START
	       Map<String, String> map = new HashMap<String, String>();
	       int numPairs = Integer.parseInt(text[0]);
	       
	       for(int i = 1; i <= numPairs; i++) {
	    	   Scanner sc = new Scanner(text[i]);
	    	   sc.useDelimiter("=");
	    	   map.put(sc.next(), sc.next());
	       }
	       //Map Code END
	       
	       //Traverse Map START
	       String sentc = text[maxIndx];
	       String word[] = sentc.split(" ");
	       
	       for(int i = 0; i < word.length; i++) {
	    	   if(map.containsKey(word[i])) {
	    		   System.out.print(map.get(word[i]) + " ");
	    	   } else {
	    		   System.out.print(word[i] + " ");
	    	   }
	       }
	       System.out.println();
	}
}
