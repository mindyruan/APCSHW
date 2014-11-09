import java.util.*;

public class SuperArray{
    private Object[] data;
    private int stuff; //current number of stored elements

    public SuperArray(){
	data = new Object[10];
    }

    public SuperArray(int x){
	data = new Object[x];
    }

    public String toString(){
	String ans = "[ ";
	for(int i = 0; i < data.length ; i++){
	    ans += "" + data[i] + " ";
	}
	ans += "]";
	return ans;
    }

    public void bigger(Object e){
	Object[] temp = new Object[data.length+1];
	for(int i = 0; i < data.length ; i++){
	    temp[i] = data[i];
	}
	temp[temp.length-1] = e;
	data = temp;
    }

    public void add(Object e){
	for(int i = 0; i<data.length; i++){
	    if (data[i] == null){
		data[i] = e;
		break;
	    }
	    if(i==data.length-1){
	        bigger(e);
		break;
	    }
	}
    }

    public int size(){
	return data.length;
    }

    public void resize(int newCapacity){
	Object[] newArray = new Object[newCapacity];
	//new size is bigger
	if(data.length <= newCapacity){
	    for(int i = 0; i < data.length; i++){
		newArray[i] = data[i];
	    }
        //new size is smaller
	}else{
	    for(int i = 0; i < newCapacity; i++){
		newArray[i] = data[i];
	    }
	}
	data = newArray;
    }

    public void clear(){
	Object[] temp = new Object[data.length];
	data = temp;
    }

    public Object get(int index){
	if (index < 0 || index >= size()){
	    System.out.println("Index out of range!");
	    return null;
	}else{
	    return data[index];
	}
    }

    public Object set(int index, Object o){
	if (index < 0 || index >= size()){
	    System.out.println("Index out of range!");
	    return null;
	}else{
	    Object replaced = data[index];
	    data[index] = o;
	    return replaced;
	}
    }

    public void add(int index, Object o){
	Object[] temp = new Object[data.length];
	for(int i = 0; i < index; i++){
	    temp[i] = data[i];
	}
	temp[index] = o;
	Object[] copy = data.clone();
	data = temp;
	for(int i = index; i < copy.length; i++){
	    add(copy[i]);
	}
    }

    public Object remove(int index){
	//working on remove now!
    }

}
