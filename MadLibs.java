import java.util.*;
import java.io.*;


public class MadLibs {

	public static void main(String[] args) {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		ArrayList <String> nouns = new ArrayList <String>(); 
		ArrayList <String> verbs = new ArrayList <String> ();
		ArrayList <String> adj = new ArrayList<String>();
		ArrayList <String> adverbList = new ArrayList<String>(); 

		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		try {
			File nounsFile = new File ("nouns.txt"); 
			Scanner nounScanner = new Scanner (nounsFile); 
			while (nounScanner.hasNextLine())
			{
				nouns.add(nounScanner.nextLine()); 
			}
		}
		catch (Exception exe) {
			System.out.println ("The nouns.txt file did not work correctly");
		}
		

		
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		try {
			FileReader fr = new FileReader ("verbs.txt");
			BufferedReader br = new BufferedReader(fr);
			while (br.ready())
			{
				verbs.add(br.readLine());
			}
			br.close();
			fr.close();
		}
		catch (Exception exe) {
			System.out.println ("The verbs.txt file did not work correctly");
		}

		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
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
		}
		catch (Exception exe) {
			System.out.println ("The adjectives.txt file did not work correctly");
		}
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.
		String line = null;
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


		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.
    	Scanner keyboard = new Scanner(System.in);
    	//Getting the story's file name from the user
    	System.out.print ("Please give me the name of a MadLibs file and press enter: ");
    	String madLibsFileName = keyboard.nextLine();
    	//Writing the story character by character to a string
		String story = ""; //This is the string that contains the final MadLib file that we are writing to System.out
		try{
			FileReader fileRead = new FileReader (madLibsFileName);
			char currentLetter = (char)(fileRead.read());
			while ((int)currentLetter < 128){ //this reads the file character by character into a string          *****PLEASE NOTE:***** this only takes the first 128 characters, so any weird characters will not be read.
				story += currentLetter;
				currentLetter = (char)(fileRead.read());
				//System.out.println (story);
			}
			fileRead.close();
		}
		catch(IOException ex){
			System.out.println ("Something went wrong. :(");
		}
		//update the variable names for each list!!!!!!! *****
		//check to see if there are any words that need to be added and add them when needed, then rinse and repeat for every other type of word
		//nouns (nouns)
		while (story.indexOf("<<NOUN>>") > -1){
			story = story.substring(0,(story.indexOf("<<NOUN>>"))) + nouns.get((int)(Math.random()*nouns.size())) + story.substring((story.indexOf("<<NOUN>>"))+8,story.length());
		}
		//verbs (verbs)
		while (story.indexOf("<<VERB>>") > -1){
			story = story.substring(0,(story.indexOf("<<VERB>>"))) + verbs.get((int)(Math.random()*verbs.size())) + story.substring((story.indexOf("<<VERB>>"))+8,story.length());
		}
		//adjectives (adj)
		while (story.indexOf("<<ADJECTIVE>>") > -1){
			story = story.substring(0,(story.indexOf("<<ADJECTIVE>>"))) + adj.get((int)(Math.random()*adj.size())) + story.substring((story.indexOf("<<ADJECTIVE>>"))+13,story.length());
		}
		//adverbs (adverbList)
		while (story.indexOf("<<ADVERB>>") > -1){
			story = story.substring(0,(story.indexOf("<<ADVERB>>"))) + adverbList.get((int)(Math.random()*adverbList.size())) + story.substring((story.indexOf("<<ADVERB>>"))+10,story.length());
		}
		//write to System.out
		System.out.println(story);
	}

}
