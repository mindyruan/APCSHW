import java.util.*;

public class WordSearch{

    public static void main(String[]arg){

	WordGrid g;
        if(arg.length == 4){
	    g = new WordGrid(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]),Integer.parseInt(arg[2]));
	    if (arg[3].equals("1")){
		g.loadWordsFromFile("words.txt",true);
	    }else{
		g.loadWordsFromFile("words.txt",false);
	    }
	}else if(arg.length == 3){
	    g = new WordGrid(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]),Integer.parseInt(arg[2]));
	    g.loadWordsFromFile("words.txt",false);
	}else if(arg.length == 2){
	    System.out.println("Using default seed: 0");
	    g = new WordGrid(Integer.parseInt(arg[0]),Integer.parseInt(arg[1]),0);
	    g.loadWordsFromFile("words.txt",false);
	}else{
	    System.out.println("Please input <rows> <cols> (<randomSeed>) (<answers> 1 to show answers)");
	    System.out.println("Using default puzzle size: 15x30\nUsing default seed: 0\n");
	    g = new WordGrid(15,30,0);
	    g.loadWordsFromFile("words.txt",false);
	}

    }

}
