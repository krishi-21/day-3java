
public class Pattern3 {

	public static void main(String[] args) {
		for (int r=0,sp=10;r<5;r++) {
			for(int k =1;k<sp;k++) {
				System.out.println(" ");
				
			}
			sp=sp-1;
			for(int c=1;c<=r;c++) {
				System.out.println(r+"");
			}
			System.out.println();
		}

	}

}
