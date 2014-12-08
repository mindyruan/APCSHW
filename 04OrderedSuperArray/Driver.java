public class Driver{
    public static void main(String[]args){

	SuperArray a = new SuperArray(23);
	for (int i = 0; i < 23; i++){
	    a.add("" + i);
	}
	print(a);
	print("----------------");
	a.insertionSort();
	print(a);

	/*
        OrderedSuperArray b = new OrderedSuperArray(5);
	System.out.println(b);

	b.add(0,"wowzers");
	b.add(0,"rad");
	b.add("coolio");
	b.add("lol");
        b.add(5,"suave");
	b.add("neato");
	b.add("terrific");
	print(b);
	b.set(0,"magnifico");
        print(b);
	*/
    }

    public static void print(Object x){
	System.out.println(x);
    }

}
