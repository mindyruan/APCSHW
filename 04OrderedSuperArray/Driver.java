public class Driver{
    public static void main(String[]args){

	SuperArray a = new SuperArray(31);
	for (int i = 0; i < 31; i++){
	    a.add("" + i);
	}

	print(a);

	if (args.length == 1){
	    if (args[0].equals("array")){
		a.sort();
		print(a);
	    }else if (args[0].equals("insert")){
		a.insertionSort();
		print(a);
	    }else if (args[0].equals("select")){
		a.selectionSort();
		print(a);
	    }
	}else{
	    print("please enter java Driver <array/insert/select>");
	}

    }

    public static void print(Object x){
	System.out.println(x);
    }

}
