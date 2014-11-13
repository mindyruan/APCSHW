import java.util.*;

public class ArrayLists{

    public static void main(String[]args){
	ArrayList<Integer> L = new ArrayList<Integer>();

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
