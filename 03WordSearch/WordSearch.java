public class WordSearch{

    public static void main(String[]arg){
	WordGrid g = new WordGrid(4,4);
	System.out.println(g.toString());
	System.out.println(g.addWordHorizontal("cat", 0,0));
	System.out.println(g.addWordHorizontal("cat", 1,2));
	System.out.println(g.addWordHorizontal("wrecked", 2,1));
	System.out.println(g.toString());

    }


}
