import java.util.*;
import java.io.*;


public class MadLibs {

	public static void main(String[] args) {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		//helloooooo
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		
		//3. Read an adjectives.txt file and store its list of adjectives into an arraylist.
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.
    	Scanner keyboard = new Scanner(System.in);

    	//Getting the story's file name from the user
    	System.out.print ("Please give me the name of a MadLibs file and press enter: ");
    	String madLibsFileName = keyboard.nextLine();
    	//The below code checks to see if the user inputted a valid name. It might not be necessary. There are bugs. 
    	/*while((madLibsFileName.length()<4) || ((madLibsFileName.substring(madLibsFileName.length()-4,madLibsFileName.length())) != ".txt")){
    		System.out.println("thing inputted: " + madLibsFileName + " | length: " + madLibsFileName.length() + " | substring: " + madLibsFileName.substring(madLibsFileName.length()-4,madLibsFileName.length()));
    		System.out.println ((madLibsFileName.substring(madLibsFileName.length()-4,madLibsFileName.length())) == ".txt");
    		madLibsFileName = "";
    		System.out.println("Invalid. The file must be a .txt file.\nPlease give me the name of a MadLibs file: ");
    		madLibsFileName = keyboard.next();
    	}*/


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
		//nouns (listOfNouns)
		while (story.indexOf("<<NOUN>>") > -1){
			story = story.substring(0,(story.indexOf("<<NOUN>>"))) + listOfNouns.get((int)(Math.random()*listOfNouns.size())) + story.substring((story.indexOf("<<NOUN>>"))+8,story.length());
		}

		//verbs (listOfVerbs)
		while (story.indexOf("<<VERB>>") > -1){
			story = story.substring(0,(story.indexOf("<<VERB>>"))) + listOfVerbs.get((int)(Math.random()*listOfVerbs.size())) + story.substring((story.indexOf("<<VERB>>"))+8,story.length());
		}

		//adjectives (listOfAdjs)
		while (story.indexOf("<<ADJECTIVE>>") > -1){
			story = story.substring(0,(story.indexOf("<<ADJECTIVE>>"))) + listOfAdjs.get((int)(Math.random()*listOfAdjs.size())) + story.substring((story.indexOf("<<ADJECTIVE>>"))+13,story.length());
		}

		//adverbs (listofAdvs)
		while (story.indexOf("<<ADVERB>>") > -1){
			story = story.substring(0,(story.indexOf("<<ADVERB>>"))) + listOfAdvs.get((int)(Math.random()*listOfAdvs.size())) + story.substring((story.indexOf("<<ADVERB>>"))+10,story.length());
		}

		//write to System.out
		System.out.println(story);
	}

}
