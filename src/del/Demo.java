package del;

import java.util.Date;


public class Demo
{

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.reverseString();
	}
	public void reverseString()
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