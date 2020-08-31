
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MadLibs {

	public static void main(String[] args) throws IOException {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		ArrayList <String> verbs = new ArrayList <String>();
		ArrayList <String> adj = new ArrayList <String> ();
		ArrayList<String> list = new ArrayList<String>();
		ArrayList<String> nouns = new ArrayList<String>(); 
		ArrayList <String> adv = new ArrayList <String> ();
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.
		
<<<<<<< HEAD
		File nounsFile = new File ("nouns.txt"); 
		Scanner nounScanner = new Scanner (nounsFile); 
		while (nounScanner.hasNextLine())
		{
			nouns.add(nounScanner.nextLine()); 
		}
		
=======
>>>>>>> parent of 4442443... hi this is just a test
		//2. Read a verbs.txt file and store its list of verbs into an arraylist.
		
		FileReader fr = new FileReader ("verbs.txt");
		BufferedReader br = new BufferedReader(fr);
		while (br.ready())
		{
			verbs.add(br.readLine());
		}
		br.close();
		fr.close();
		
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
		}catch (Exception exe) {
			System.out.println ("The adjectives.txt file did not work correctly");
		}
		
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.
		
		String line = null;
		try {
			FileReader Fr = new FileReader ("adverbs.txt");
			BufferedReader Br = new BufferedReader(Fr);
			while ((line = Br.readLine()) != null) {
				list.add(line);
			}
			Br.close();
			Fr.close();
		}
		catch (Exception e) {
			System.out.println ("Error Occurred");
		}
		System.out.println(list);

		
		
		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.

    
		
	}

}
