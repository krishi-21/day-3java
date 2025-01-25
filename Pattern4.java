
public class Pattern4 {

	public static void main(String[] args) {
		for(int r=1;r<=15;r++) {
			for(int k=1;k<=17;k++) {
				System.out.println("");
			}
			for(int c=1;c<=30;c++) {
				if((r==1)||(r==15)) {
					System.out.println("*");
				}
				else {
					if((c==1)||(c==30)) {
						System.out.println("*");
					}
				
				else {
					System.out.println("");
				}
			}
			}
           System.out.println();
	}

}
	}
