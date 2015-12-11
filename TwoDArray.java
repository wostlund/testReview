public class TwoDArray implements Comparable<TwoDArray>{
    private int rows, cols;
    private int[][] data;
    
    public int compareTo(TwoDArray n){
	return sum()-n.sum();
    }dwefhyuigjf
	hfrtyue43fghkdjvmx bnd ghrewyjfbra,dvsywlvrfd,ahjmfva,ejdzrs gv,gersd'
    }

    public  boolean isIncreasing(){
	for(int r=0; r<data.length; r++){
	    for(int c=1; c<data[r].length; c++){
		if(data[r][c-1]>data[r][c]){
		    return false;
		}
	    }
	}
	return true;
    }

    public  int sum(){
	int ans = 0;
	for(int r=0; r<data.length; r++){
	    for(int c=0; c<data[r].length; c++){
		ans+=data[r][c];
	    }
	}
	return ans;
    }

    public String toString(){
	return ""+sum();
    }
}
