public class Driver{
    public static void main(String[]args){

	SuperArray a = new SuperArray();
	SuperArray b = new SuperArray(3);
	System.out.println(a + "" + a.size());
	System.out.println(b);
	/*
	a.add("wowzers");
	a.add("wowzers");
	a.add("wowzers");
	a.add("wowzers");
	System.out.println(a + "" + a.size());
	*/
	b.add("wowzers");
	b.add("wowzers");
	b.add("wowzers");
	System.out.println(b + "" + b.size());
	b.add("wowzers");
	System.out.println(b + "" + b.size());
        b.add(0,"lol");
        b.add(0,"lol");
        b.add(0,"lol");
	System.out.println(b + "" + b.size());

    }

}
