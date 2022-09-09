package del;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;


public class Demo
{

	public static void main(String[] args) {
		Demo demo = new Demo();
		//demo.reverseString();
		//demo.trimStringSpaces();
		//demo.sortArray();
		demo.sortArrLogic();
	}

	private  void sortArrLogic(){
		int [] arr = {34,53,21,54,65,77,6,2,4};
		//int [] arr2 = new int[8];
		int x ;

		for (int i = 0; i < arr.length; i++){
			for (int j = i; j < arr.length; j++)
			if (arr[i] > arr[j]) {
				x= arr[i];
				arr[i] = arr[j];
				arr[j] = x;
			}
		}
		for(int k = 0; k < arr.length; k++){
			System.out.println(arr[k]);
		}
	}
	private void sortArray(){
		int [] arr = {34,54,21,54,65,77,4,2,4};
		Arrays.sort(arr);
		for(int i = 0; i < arr.length; i++){
			System.out.println(arr[i]);
		}
	}
	private void trimStringSpaces(){
		String test = " reyt ";
		System.out.println(test.trim());
	}

	private void reverseString()
	{
		String test = "iurwueyiuwer312ksdjhs";
		char[] chars = test.toCharArray();
		StringBuilder sb = new StringBuilder();

		for(int i = chars.length-1; i >= 0; i--){
			sb.append(chars[i]);
		}

		System.out.println(sb);
	}


}