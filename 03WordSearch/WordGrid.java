import java.util.*;
import java.io.*;

public class WordGrid{
    private char[][]data;
    private char[][]key;
    private long seed,ans;
    Random r;

    public WordGrid(int rows,int cols,int s){
	data = new char[rows][cols];
	key = new char[rows][cols];
	clear();
	setSeed(s);
	r = new Random(seed);
    }

    /**Set all values in the WordGrid to spaces ' '*/
    private void clear(){
	for (int i = 0; i < data.length; i++){
	    for (int x = 0; x < data[i].length; x++){
		data[i][x] = '-';
		key[i][x] = '-';
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

    public String toKey(){
	String ans = "";
        for(int i = 0; i < key.length; i++){
	    for(int x = 0; x < key[i].length; x++){
	        ans += key[i][x] + " ";
	    }
	    ans += "\n";
	}
	return ans;
    }
    
    public void setSeed(long x){
	seed = x;
    }
    
    private boolean addWord(String word, int row, int col, int dx, int dy){
	if (checkWord(word, row, col, dx, dy)){
	    for (int i = 0; i < word.length(); i++){
		data[row][col]  = word.charAt(i);
		key[row][col] = word.charAt(i);
		row += dy;
		col += dx;
	    }
	    return true;
	}
	return false;
    }

    private boolean addWordRandomly(String word){
	int attempts = 100;
	//Random r = new Random(seed);
	r.setSeed(seed);
	boolean victory;
	do{
	    victory = addWord(word,r.nextInt(data.length),r.nextInt(data[0].length), r.nextInt(3)-1, r.nextInt(3)-1); //r.nextInt(3)-1 generates -1,0,1
	    attempts--;
	}while(!victory && attempts > 0);
	return (attempts != 0);
    }

    public void addWordList(ArrayList<String> words){
	ArrayList<String> added = new ArrayList<String>();
        for (int i = 0; i < words.size(); i++){
	    if(addWordRandomly(words.get(i))){
		added.add(words.get(i));
	    }
	}
	fill();
	System.out.println("find: "+added);
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
		    data[i][c] = (char)('a'+r.nextInt(26));
		}
	    }
	}
    }

    public void loadWordsFromFile(String fileName, boolean fillRandomLetters){
	try{
	    File words = new File(fileName);
	    Scanner infile = new Scanner(words);
	    ArrayList<String> bank = new ArrayList<String>();
	    Random r = new Random();
	    while(infile.hasNext()){
		bank.add(infile.next());
	    }
	    int size = bank.size();
	    addWordList(bank);
	    System.out.println(toString());
	    if(fillRandomLetters == true){
		System.out.println(toKey());
	    }
	}
	catch(FileNotFoundException e){
	    System.out.println("lol what file");
	}
    }

}
