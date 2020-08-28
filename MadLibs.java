import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MadLibs {

	public static void main(String[] args) throws FileNotFoundException {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		
		//1. Read a nouns.txt file and store its list of nouns into an arraylist 
		
		File nounsFile = new File ("nouns.txt"); 
		Scanner nounScanner = new Scanner (nounsFile); 
		ArrayList<String> nouns = new ArrayList<String>(); 
		while (nounScanner.hasNextLine())
		{
			nouns.add(nounScanner.nextLine()); 
		}
		
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.
		
	}

}
