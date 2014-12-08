import java.util.*;

public class SuperArray{
    public String[] data;
    private int stuff;

    public SuperArray(){
	this(10);
    }

    public SuperArray(int x){
	data = new String[x];
    }

    public String toString(){
	String ans = "[ ";
	for(int i = 0; i < data.length ; i++){
	    ans += "" + data[i] + " ";
	}
	ans += "]";
	return ans;
    }

    public void add(String e){
	if (size() < data.length){
	    data[size()] = e;
	}else{
	    resize(size()*2);
	    add(e);
	}
    }

    public int size(){
	stuff = 0;
        for (int i = 0; i < data.length; i++){
	    if (data[i] != null){
		stuff++;
	    }
	}
	return stuff;
    }

    public void resize(int newCapacity){
	String[] newArray = new String[newCapacity];
	for (int i = 0; i < newCapacity; i++){
	    if (i < data.length){
		newArray[i] = data[i];
	    }
	}
	data = newArray;
    }

    public void clear(){
	String[] temp = new String[10];
	data = temp;
    }

    public String get(int index){
	if (index < 0 || index >= size()){
	    System.out.println("Index out of range!");
	    return null;
	}else{
	    return data[index];
	}
    }

    public String set(int index, String o){
	if (index < 0 || index >= size()){
	    System.out.println("Index out of range!");
	    return null;
	}else{
	    String replaced = data[index];
	    data[index] = o;
	    return replaced;
	}
    }

    public void add(int index, String o){
	if (index < 0 || index > size()){
	    throw new IndexOutOfBoundsException();
	}
	if(index == data.length){
	    resize(size()*2);
	    add(o);
	}else{
	    String temp = data[index];
	    data[index] = o;
	    for (int i = index+1; i < size(); i++){
	        temp = set(i,temp); //new temp is the replaced object
	    }
	    add(temp);
	}
    }

    public String remove(int index){
	if (index < 0 || index >= size()){
	    System.out.println("Index out of range!");
	    return null;
	}
	String removed = data[index];
	for(int i = 0; i < size(); i++){
	    if (i == size() - 1){
		data[i] = null;
	    }else{
		data[i] = data[i+1];
	    }
	}
	if (size() <= data.length/2){
	    this.resize(size()*2);
	}
        return removed;
    }

    public void sort(){
	Arrays.sort(data);
    }

    public void insertionSort(){
	for (int i = 1; i < data.length; i++){
	    if (data[i].compareTo(data[0]) < 0){
		String hold = data[i];
		for (int c = 0; c < i; c++){
		    data[i-c] = data[i-c-1];
		}
		data[0] = hold;
	    }
	    for (int x = i; x > 0; x--){
		if (data[i].compareTo(data[i-x]) > 0
		    && data[i].compareTo(data[i-x+1]) < 0){
		    String hold = data[i];
		    for (int c = 0; c < x-1; c++){
			data[i-c] = data[i-c-1];
		    }
		    data[i-x+1] = hold;
		}
	    }
        }
    }

}
