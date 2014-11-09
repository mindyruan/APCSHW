public class Driver{
    public static void main(String[]args){

	// testing constructors
	SuperArray a = new SuperArray();
	SuperArray b = new SuperArray(3);
	System.out.println(a.toString());
	System.out.println(b.toString());

	// testing add(Object o)
	b.add(1);
	b.add(2);
	b.add(3);
	//System.out.println(b.toString());
	b.add(4);
	System.out.println(b.toString());

	//testing add(int index, Object o)
	b.add(2,"add");
	System.out.println(b.toString());

	// testing set
	System.out.println("replaced "+b.set(1,"two"));
	System.out.println(b.toString());

	//testing get
	System.out.println(b.get(2));

	//testing resize
	b.resize(10);
       	System.out.println(b.toString());
	b.resize(2);
	System.out.println(b.toString());

	//testing clear
	b.clear();
    }

}
