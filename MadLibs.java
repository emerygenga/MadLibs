
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

import java.util.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class MadLibs {

	public static void main(String[] args) throws IOException {
		//0. Give variable names for each of the arraylists below and create Madlibs stories.
		ArrayList <String> verbs = new ArrayList <String>();
		//1. Read a nouns.txt file and store its list of nouns into an arraylist.

		
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
		
		//4. Read an adverbs.txt file and store its list of adverbs into an arraylist.

		//5. Prompt user for the name of a file containing a MadLibs story.
		// Read the story from that file and write it to System.out, but replacing each instance of
		// <<NOUN>>, <<VERB>>, etc. with a randomly chosen word from the corresponding list.

    
		String line = null;
		ArrayList<String> list = new ArrayList<String>(); 
		try {
			FileReader fr = new FileReader ("adverbs.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((line = br.readLine()) != null) {
				list.add(line);
			}
			br.close();
			fr.close();
		}
		catch (Exception e) {
			System.out.println ("Error Occurred");
		}
		System.out.println(list);

	}

}
