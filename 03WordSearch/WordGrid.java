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
/*{
	    {'a','b','c'},
	    {'e','f','g'},
	    {'i','j','k'}
	    };*/
    }

    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for (int i = 0; i < data.length; i++){
	    for (int x = 0; x < data[i].length; x++){
		data[i][x] = '-';
	    }
	}
    }

    /**The proper formatting for a WordGrid is created in the toString.
     *@return a String with each character separated by spaces, and each row
     *separated by newlines.
     */
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

    /**Attempts to add a given word to the specified position of the WordGrid.
     *The word is added from left to right, must fit on the WordGrid, and must
     *have a corresponding letter to match any letters that it overlaps.
     *
     *@param word is any text to be added to the word grid.
     *@param row is the vertical locaiton of where you want the word to start.
     *@param col is the horizontal location of where you want the word to start.
     *@return true when the word is added successfully. When the word doesn't fit,
     *or there are overlapping letters that do not match, then false is returned.
     */

    public boolean addWordHorizontal(String word,int row, int col){
	if (col + word.length() <= data[row].length){
	    for (int i = 0; i < word.length(); i++){
		data[row][col] = word.charAt(i);
		col++;
	    }
	    System.out.println("right");
	    return true;
	}else if (col + 1 >= word.length()){
	    for (int i = 0; i < word.length(); i++){
		data[row][col] = word.charAt(i);
		col--;
	    }
	    System.out.println("left");
	    return true;
	}else{
	    System.out.println("did not fill");
	    return false;
	}
    }

    public boolean addWordVertical(String word,int row, int col){
        if (row + word.length() <= data[col].length){
	    for (int i = 0; i < word.length(); i++){
		data[row][col] = word.charAt(i);
		row++;
	    }
	    System.out.println("down");
	    return true;
	}else if (row + 1 >= word.length()){
	    for (int i = 0; i < word.length(); i++){
		data[row][col] = word.charAt(i);
		row--;
	    }
	    System.out.println("up");
	    return true;
	}else{
	    System.out.println("did not fill");
	    return false;
	}
    }

    public boolean addWordDiagonal(String word, int row, int col){
        if (row + word.length() <= data[col].length && col + word.length() <= data[row].length){
	    for (int i = 0; i < word.length(); i++){
		data[row][col] = word.charAt(i);
		row++;
		col++;
	    }
	    System.out.println("down");
	    return true;
	}else if (row + 1 >= word.length() && col + 1 >= word.length()){
	    for (int i = 0; i < word.length(); i++){
		data[row][col] = word.charAt(i);
		row--;
		col--;
	    }
	    System.out.println("up");
	    return true;
	}else{
	    System.out.println("did not fill");
	    return false;
	}
    }
    
    public boolean noOverlap(char s, char c){
	if (c=='-'){
	    return true;
	}
	return(s==c);
    }

    //vertical + diagonal should be implemented as well.

}