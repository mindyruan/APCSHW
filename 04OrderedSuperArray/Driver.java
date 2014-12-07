public class Driver{
    public static void main(String[]args){

        OrderedSuperArray b = new OrderedSuperArray(5);
	System.out.println(b);

	b.add(0,"wowzers");
	b.add(0,"rad");
	b.add("coolio");
	print(b);
	b.add("lol");
	print(b);
        b.add(5,"suave");
	b.add("neato");
	b.add("terrific");
	System.out.println(b + "" + b.size());
	
    }

    public static void print(Object x){
	System.out.println(x);
    }

}
