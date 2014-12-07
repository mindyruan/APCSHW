public class OrderedSuperArray extends SuperArray{

    public void add(String s){
        if (s != null){
	    int i = size();
	    while (i > 0 && get(i-1).compareTo(s) > 0){
		i--;
	    }
	    super.add(i,s);
	}
    }

    public void add(int i, String s){
	add(s);
    }

    public String set(int i, String s){
	String replaced = data[i];
	//empty list
	if (size() == 0){
	    throw new IndexOutOfBoundsException("" + i);
	}
	if (s.compareTo(data[i]) > 0){
	    while (i < size()-1 && s.compareTo(get(i+1)) > 0){
		data[i] = data[i+1];
		i++;
	    }
	}else if (s.compareTo(data[i]) < 0){
	    while (i > 0 && s.compareTo(get(i-1)) < 0){
		data[i] = data[i-1];
		i--;
	    }
	}
	data[i] = s;
	return replaced;
    }

}
