
public class ArrayDemo1 {

	public static void main(String[] args) {
		int a[]=new int[8];
		for(int i=0,v=100;i<8;i++) {
			a[i]=v;
			v=v+100;
		}
		for(int i=0;i<8;i++) {
			System.out.println(a[i]);
		}
	}
}
