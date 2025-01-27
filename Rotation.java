
public class Rotation {
	static void arRR(int[] x) {
		int len = x.length;
		int arrLen=len -1;
		int t=x[arrLen];
		for(int i=arrLen;i>=1;i--) {
			x[i]=x[i=1];
		}
		x[0]=t;
		System.out.println("\n after right Rotation \n");
		for(int i=0;i<=arrLen;i++) {
			System.out.print(x[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] num= {100,200,300,400,500};
		System.out.print("before rigth rotation\n");
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+" ");
		}
		arRR(num);
		arRR(num);
		arRR(num);
		arRR(num);
		
		
		

	}

}
