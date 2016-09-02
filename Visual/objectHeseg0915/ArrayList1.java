package objectHeseg0915;

public class ArrayList1 {
	Object []arr;
	int seek; // suuliin bairlal zaagch 

	public ArrayList1(){
		arr= new Object[100];
		seek=0;
	}

	public void add(Object o){ //jagsaaltiin araas element nemne
		arr[seek]=o;
		seek++;
	}

	public void add(int index, Object o){  // zaasan indexd o objectiig hiij ugnu 
		for(int i=seek; i>=index; i--){
			arr[i+1]=arr[i];
		}
		arr[index]=o;
		seek++;
	}

	public void clear(){  // listiin buh elementiig ustgana 
		for(int i=0; i<seek; i++){
			arr[i]=null;

		}
		seek=0;
	}

	public void showList(){ // listiin buh elementiig hevlej uzuulne 
		for(int i=0; i<seek; i++){
			System.out.print(" "+arr[i]);
		}
		System.out.println();
	}


	public boolean contains(Object o){ // tuhain element listed bwal unen utga butsaana
		boolean ret=false;
		if(o instanceof String){

			for(int i=0; i<seek; i++){
				if(arr[i].equals(o)){
					ret=true;
				}
			}
		}


		for(int i=0; i<seek; i++){
			if(arr[i]==o){
				ret=true;
			}
		}
		return ret;

	}


	public Object get(int index ){ // zaasan indexdeh elementiig butsaana 
		return arr[index];
	}

	public int indexOf(Object o){ // parametreer irsen objectiin bgaa index iig butsaana zuun talaasaa
		int ret=-1;
		if(o instanceof String){

			for(int i=0; i<seek; i++){
				if(arr[i].equals(o)){
					ret=i;
					break;
				}
			}
		}

		else{  
			for(int i=0; i<seek; i++){
				if(arr[i]==o){
					ret=i;
					break;
				}
			}
		}
		return ret;
	}

	public int lastIndexOf(Object o){ // parametreer irsen objectiin bgaa index iig butsaana baruun talaasaa
		int ret=-1;
		int count=0;
		if(o instanceof String){

			for(int i=seek-1; i>=0; i--, count++){
				if(arr[i].equals(o)){
					ret=count;
					break;
					// System.out.println("count ="+count);
				}
			}
		}

		else{ 
			for(int i=seek; i>=0; i--, count++){
				if(arr[i]==o){
					ret=count;
					break;
				}
			}
		}

		return ret;
	}


	public int size(){// listiin hemjeeg butsaana 
		return seek;
	}


	public void set(int index, Object o){
		arr[index]=o;
	}

	public boolean isEmpty(){
		if(seek==0) return true;
		else return false;
	}

	public boolean remove(Object o){ // parametreer irsen objectiig ustgana
		int ind= indexOf(o);
		boolean ret=false;
		if(ind!=-1){
			for(int i=ind; i<seek; i++){
				arr[i]=arr[i+1];
			}
			ret=true;
			seek--;
		}
		return true;

	}

	public boolean remove(int index){ // parametreer irsen  index deh objectiig ustgana
		boolean ret=false;
		if(index>=seek){

		}
		else{
			for(int i=index; i<seek; i++){
				arr[i]=arr[i+1];
			}
			ret=true;
			seek--;
		}
		return ret;
	}

}
