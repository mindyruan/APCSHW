import java.util.*;

public class WordGrid{
    private char[][]data;

    /**Initialize the grid to the size specified and fill all of the positions
     *with spaces.
     *@param row is the starting height of the WordGrid
     *@param col is the starting width of the WordGrid
     */
    public WordGrid(int rows,int cols){
        data = new char[rows][cols];
	clear();
	addWord("jerk",0,4,0,1);
	addWord("top",2,1,1,0);
	addWord("cake",1,1,1,0);
	addWord("happy",0,0,1,0);
	addWord("happy",0,0,0,1);
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

}
