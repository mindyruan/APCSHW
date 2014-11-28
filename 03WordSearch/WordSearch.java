import java.util.*;

public class WordSearch{

    public static void main(String[]arg){

	WordGrid g;
        if(arg.length == 2){
	    System.out.println("2");
	    g = new WordGrid(15,30,Integer.parseInt(arg[0]));
	    if (arg[1].equals("1")){
		g.loadWordsFromFile("words.txt",true);
	    }else{
		g.loadWordsFromFile("words.txt",false);
	    }
	}else if(arg.length == 1){
	    System.out.println("1");
	    g = new WordGrid(15,30,Integer.parseInt(arg[0]));
	    g.loadWordsFromFile("words.txt",false);
	}else{
	    System.out.println("default");
	    g = new WordGrid(15,30,0);
	    g.loadWordsFromFile("words.txt",false);
	}
    }

}
