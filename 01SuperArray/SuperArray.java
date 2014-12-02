public class SuperArray{
    private Object[] data;
    private int stuff;

    public SuperArray(){
	this(10);
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

    public void add(Object e){
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
	Object[] newArray = new Object[newCapacity];
	for (int i = 0; i < newCapacity; i++){
	    if (i < data.length){
		newArray[i] = data[i];
	    }
	}
	data = newArray;
    }

    public void clear(){
	Object[] temp = new Object[10];
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
	if (index < 0 || index >= size()){
	    throw new IndexOutOfBoundsException();
	}
	if(index == data.length){ 
	    add(o);
	}else{
	    Object temp = data[index];
	    data[index] = o;
	    for (int i = index+1; i < size(); i++){
	        temp = set(i,temp); //new temp is the replaced object
	    }
	    add(temp);
	}
    }

    public Object remove(int index){
	if (index < 0 || index >= size()){
	    System.out.println("Index out of range!");
	    return null;
	}
	Object removed = data[index];
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

}
