import java.util.*;

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
	    g = new WordGrid(15,30,1,0);
	}

	g.loadWordsFromFile("words.txt",false);
    }

}
