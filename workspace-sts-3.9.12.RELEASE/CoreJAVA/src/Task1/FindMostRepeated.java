
package Task1;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FindMostRepeated {

	public static void main(String[] args) throws Exception 
	{	String line,word = "";
		int count = 0, maxcount = 0;
	 	ArrayList<String> words = new ArrayList<String>();   
		FileReader file = new FileReader("/Users/bachenglin/Documents/workspace-sts-3.9.12.RELEASE/CoreJAVA/src/Task1/a.txt");
		BufferedReader br = new BufferedReader(file);
		while((line = br.readLine()) != null)
		{
			String string[] = line.toLowerCase().split("([,.\\s])"); 
			
			for(String s: string) {
				if (s.length() != 0)
				{System.out.println(s);
				
				words.add(s);}
			}
			
		}
		for(int i = 0; i < words.size(); i++)
		{
			count = 1;
			for(int j = i + 1; j< words.size();j++) {
				if( words.get(i) == " ")
					break;
				if(words.get(i).equals(words.get(j))) {
					count ++;
				}
			}
		if (count > maxcount) {
			maxcount = count;
			word = words.get(i);
		}
		}
		System.out.println(maxcount);
		System.out.println(words);
		System.out.println("Most frequent word is:" + word);
		br.close();
		

	}

}



