
public class StringsSwapping {

	public static void main(String[] args) {
		String name1 ="tulasi";
		String name2 = "krishi";
		System.out.println("before Swapping");
		System.out.println("name1--->"+name1);
		System.out.println("name2---->"+name2);
		
		name1= name1+name2;
		name2= name1.substring(0, name1.length()-name2.length());
		name1= name1.substring(name2.length());
		
		System.out.println("after Swapping");
		System.out.println("name1--->"+name1);
		System.out.println("name2---->"+name2);
		
	}

}
