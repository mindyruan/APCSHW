import java.util.*;
import java.io.*;

public class WordSearch{

    public static void main(String[]arg){

	WordGrid g;
        if(arg.length == 2){
	    System.out.println("2");
	    g = new WordGrid(20,20,Integer.parseInt(arg[0]),Integer.parseInt(arg[1]));
	}else if(arg.length == 1){
	    System.out.println("1");
	    g = new WordGrid(20,20,Integer.parseInt(arg[0]),0);
	}else{
	    System.out.println("default");
	    g = new WordGrid(20,20,1,0);
	}
	try{
	    File words = new File("words.txt");
	    Scanner infile = new Scanner(words);
	    ArrayList<String> bank = new ArrayList<String>();
	    Random r = new Random();
	    while(infile.hasNext()){
		bank.add(infile.next());
	    }
	    int size = bank.size();
	    g.addWordList(bank);
	    System.out.println(g.toString());
	}
	catch(FileNotFoundException e){
	    System.out.println("lol what file");
	}

    }

}
