public class Driver{
    public static void main(String[]args){
	SuperArray a = new SuperArray();
	SuperArray b = new SuperArray(3);
	System.out.println(a.toString());
	System.out.println(b.toString());
	b.add("string");
	b.add(2);
	b.add('a');
	b.add("another string");
	b.set(1,"it works!");
	System.out.println(b.toString());
	System.out.println(b.get(2));
	b.resize(10);
	System.out.println(b.toString());
	b.resize(2);
	System.out.println(b.toString());
	b.clear();
	System.out.println(b.toString());
    }

}
