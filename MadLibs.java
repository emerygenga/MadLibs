import java.util.*;
import java.io.*;


public class MadLibs {

	public static void main(String[] args) {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		//helloooooo
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		ArrayList<String> adj = new ArrayList<String>();
		try {
			FileReader fReader = new FileReader ("adjectives.txt");
			BufferedReader bReader = new BufferedReader (fReader);
			String str = bReader.readLine();
			while (str!=null) {
				adj.add(str);
				str = bReader.readLine();
			}
			fReader.close();
			bReader.close();
		}catch (Exception exe) {
			System.out.println ("The adjectives.txt file did not work correctly");
		}
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.
    
		String line = null;
		ArrayList<String> adverbList = new ArrayList<String>(); 
		try {
			FileReader fr = new FileReader ("adverbs.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				adverbList.add(line);
			}
			br.close();
			fr.close();
		}
		catch (Exception e) {
			System.out.println ("Error Occurred");
		}
	}

}
