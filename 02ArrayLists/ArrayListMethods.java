import java.util.*;

public class ArrayListMethods{

    public static void main(String[]args){
	ArrayList<Integer> L = new ArrayList<Integer>();
	ArrayList<Integer> M = new ArrayList<Integer>();

	L.add(new Integer(5));
	L.add(5);
	L.add(7);
	L.add(7);
	L.add(4);
	L.add(89);
	L.add(89);
	L.add(89);
	L.add(89);
	L.add(89);
	L.add(2);
	L.add(2);
	L.add(0);
	L.add(89);
	L.add(89);
	L.add(9);

	System.out.println(L);
	collapseDuplicates(L);
	System.out.println(L);

	randomize(L);
	System.out.println(L);

	//testing empty arraylist just because
	System.out.println(M);
	collapseDuplicates(M);
	System.out.println(M);
	randomize(M);
	System.out.println(M);
    }

    public static void randomize(ArrayList<Integer> L){
	Random rand = new Random();
	int temp;
	for (int i = 0; i < L.size(); i++){
	    temp = rand.nextInt(L.size());
	    L.set(i,L.set(temp,L.get(i)));
	}
    }

    public static void collapseDuplicates(ArrayList<Integer> L){
        for (int i = 0; i < L.size()-1 ; i++){
	    if(L.get(i).equals(L.get(i+1))){
		L.remove(i);
		i--;
	    }
	}
    }

}
