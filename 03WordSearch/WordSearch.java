public class WordSearch{

    public static void main(String[]arg){
	WordGrid g = new WordGrid(4,4);
	System.out.println(g.toString());
	System.out.println(g.addWordHorizontal("cat", 0,1));
	System.out.println(g.addWordHorizontal("cat", 0,2));
	System.out.println(g.addWordHorizontal("wrecked", 0,1));

    }


}
