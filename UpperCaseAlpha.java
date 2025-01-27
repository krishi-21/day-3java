
public class UpperCaseAlpha {

	public static void main(String[] args) {
       String data="mnkjiopuhbvgytfFUTGVVBNMKHVaqwgsnmkjidmsojdfu";
		data=data.toUpperCase();
		int[] count=new int[26];
		for(int i=0;i<data.length();i++) {
			char ch = data.charAt(i);
			count[ch - 65]++;
		}
		for(int i=0;i<26;i++) {
			System.out.println((char)(i+65)+"------>"+count[i]);
		}

	}

}
