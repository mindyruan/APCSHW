public class Driver{
    public static void main(String[]args){

	// testing constructors
	System.out.println(">> testing constructors!");
	SuperArray a = new SuperArray();
	SuperArray b = new SuperArray(3);
	System.out.println(a.toString());
	System.out.println(b.toString());

	// testing add(Object o)
	System.out.println("\n>> testing add!\nadded 1,2,null,3!");
	b.add(1);
	b.add(2);
	b.add(null);
	b.add(3);
	System.out.println(b.toString());
	System.out.println("\nadded 4,null!");
	b.add(4);
	b.add(null);
	System.out.println(b.toString());

	// testing add(int index, Object o)
	System.out.println("\n>> testing adding at index!\nadded 'add' at index 2!");
	b.add(2,"add");
	System.out.println(b.toString());

	// testing set
	System.out.println("\ntesting set!\nreplaced "+b.set(1,"two"));
	System.out.println(b.toString());

	// testing get
	System.out.println("\ntesting get!\ngetting index 2\n"+b.get(2));

	// testing remove
	System.out.println("\ntesting remove\nremoved "+b.remove(5));
	System.out.println(b.toString());
	System.out.println("removed "+b.remove(2));
	System.out.println(b.toString());
	System.out.println("removed "+b.remove(4));
	System.out.println(b.toString());

	// testing resize
	System.out.println("\n>>testing resize!\nresized to 10");
	b.resize(10);
       	System.out.println(b.toString());
	System.out.println("\nresized to 2");
	b.resize(2);
	System.out.println(b.toString());

	// testing clear
	System.out.println("\nclear");
	b.clear();
	System.out.println(b.toString());

    }

}
