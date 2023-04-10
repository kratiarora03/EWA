
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class hashmisspelllcheck {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();
		File words = new File("C://Users//91978//Downloads//words.txt" );
	    File dictionary = new File("C:\\Users\\91978\\Downloads\\dictionary.txt" );
	    		Scanner sc = new Scanner(dictionary);
	    		while(sc.hasNextLine()) {
	    			set1.add(sc.nextLine());
	    		}
	    		Scanner sc1 = new Scanner(words);
	    		while(sc1.hasNextLine()) {
	    			set2.add(sc1.nextLine());
	    			
	    		}
	    		set1.removeAll(set2);
	    		System.out.println(set1);
	    		
	    		
	    		
	    		                       	
	    		
	    		
	}

}
