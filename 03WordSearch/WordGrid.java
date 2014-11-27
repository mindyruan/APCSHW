import java.util.*;

public class WordGrid{
    private char[][]data;
    private String[]temp = {"cat","hat","fish","eggs","ham","seuss","sam"};

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows,int cols){
        data = new char[rows][cols];
	clear();
	addWord("jerk",0,4,0,1);
	addWordRandomly("top");
	addWordRandomly("cake");
	addWordRandomly("happy");
	addWordRandomly("happy");
	//fill();
    }

    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for (int i = 0; i < data.length; i++){
	    for (int x = 0; x < data[i].length; x++){
		data[i][x] = '-';
	    }
	}
    }

    public String toString(){
	String ans = "";
        for(int i = 0; i < data.length; i++){
	    for(int x = 0; x < data[i].length; x++){
	        ans += data[i][x] + " ";
	    }
	    ans += "\n";
	}
	return ans;
    }

    private boolean addWord(String word, int row, int col, int dx, int dy){
	if (checkWord(word, row, col, dx, dy)){
	    for (int i = 0; i < word.length(); i++){
		data[row][col]  = word.charAt(i);
		row += dy;
		col += dx;
	    }
	    return true;
	}
	return false;
    }

    private boolean addWordRandomly(String word){
	int attempts = 5;
	Random r = new Random();
	boolean victory;
	do{
	    victory = addWord(word,r.nextInt(data.length),r.nextInt(data[0].length), r.nextInt(3)-1, r.nextInt(3)-1); //r.nextInt(3)-1 generates -1,0,1
	    attempts--;
	}while(!victory && attempts > 0);
	return (attempts != 0);
    }

    public boolean addWordList(String[]words){
	return true; //placeholder til I can get to this
    }

    private boolean checkWord(String word, int row, int col, int dx, int dy){
	if (dx == 0 && dy == 0 ||
	    row < 0 || col < 0 ||
	    col + dx * word.length() > data[0].length || col + dx * word.length() < -1 || row + dy * word.length() > data.length || row + dy * word.length() < -1){
	    return false;
	}
	for (int i = 0; i < word.length(); i++){
	    if (data[row][col] != '-' && data[row][col] != word.charAt(i)){
		return false;
	    }
	    row += dy;
	    col += dx;
	}
	return true;
    }

    private void fill(){
	for (int i = 0; i < data.length; i++){
	    for (int c = 0; c < data[i].length; c++){
		if (data[i][c]=='-'){
		    data[i][c] = (char)('a'+(int)(Math.random()*26));
		}
	    }
	}
    }

}
