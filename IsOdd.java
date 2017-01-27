import java.util.List;

public class IsOdd {
	public List<Integer> retOdd(List<Integer> input_array,List<Integer> odd_array){
		if(!input_array.isEmpty()){
		int num=input_array.remove(0);
		if((num&1)==1){
			odd_array.add(num);
		}
		return retOdd(input_array,odd_array);
		}
	
	return odd_array;
	}
	
	public static void main(String[] args){
		List<Integer> origList = new ArrayList<Integer>();
		ArrayList<Integer> newList = new ArrayList<Integer>();
		origList.add(23);
		origList.add(3);
		origList.add(5);
		origList.add(4);
		origList.add(2);
		
		IsOdd obj=new IsOdd();
		System.out.println(obj.retOdd(origList,newList));
	}
}
	
