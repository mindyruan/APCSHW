public class WordSearch{

    public static void main(String[]arg){
	WordGrid g = new WordGrid(4,4);
	System.out.println(g.toString());
	/* HORIZONTAL
	System.out.println(g.addWordHorizontal("cat", 0,0));
	System.out.println(g.addWordHorizontal("cat", 1,2));
	System.out.println(g.addWordHorizontal("wrecked", 2,1));
	System.out.println(g.toString());
	*/

	// VERTICAL
	System.out.println(g.addWordVertical("cat", 0,0));
	System.out.println(g.addWordVertical("cat", 2,2));
	System.out.println(g.addWordVertical("wrecked", 2,1));
	System.out.println(g.toString());
    }

}
