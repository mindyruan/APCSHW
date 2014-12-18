import java.util.*;

public class Sorts{

    public static void bubble(int[] a){
	int hold = 0;
	for (int i = a.length - 1; i > 0; i--){
	    for (int c = 0; c < i; c++){
		if (a[c] > a[c+1]){
		    hold = a[c+1];
		    a[c+1] = a[c]; //swap
		    a[c] = hold;
		}
	    }
	}
    }

    public static void insertion(int[] a){
	int hold;
	int index;
	for (int i = 1; i< a.length; i++){
	    hold = a[i];
	    index = i;
	    while (index > 0 && hold < a[index - 1]){
		a[index] = a[index - 1];
		index --;
	    }
	    a[index] = hold;
	}
    }

    public static void selection(int[] a){
	for (int i = 0; i < a.length; i++){
	    int hold = i;
	    for (int c = i; c < a.length; c++){
		if (a[hold] > a[c]){
		    hold = c;
		}
	    }
	    int s = a[hold];
	    a[hold] = a[i];
	    a[i] = s;
	}
    }

    public static void toString(int[] a){
	String ans = "[ ";
	for (int i = 0; i < a.length; i++){
	    ans += a[i] + " ";
	}
	ans += "]";
	System.out.println(ans);
    }

    public static void main(String[] args){
	Random r = new Random();
	int[] data = new int[21];

	for (int i = 0; i < data.length; i++){
	    data[i] = r.nextInt(20);
	}

	toString(data);
	//bubble(data);
	//selection(data);
	insertion(data);
	toString(data);
    }

}
