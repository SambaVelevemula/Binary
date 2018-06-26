import java.util.Scanner;
public class Test {
	public static void pri() {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		 
		System.out.println("enter number range: ");
		int n=sc.nextInt();
		int i;
		System.out.println("odd....even");
		for(i=1;i<=n;i++) {
				boolean flag=false;
				if(i%2==0) {
					flag=true;
				}
				if(i%2!=0) {
					flag=false;
				}
				if(flag==true) {
					System.out.print(i+" ");
				}
				System.out.println();
				if(flag==false) {
					System.out.print(i+" ");
				}
		}
		System.out.println();
	}
	public static void main(String []ar) {
			pri();
			System.out.println();
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String str;
			while(true){
			System.out.println("want to continue: Y / N :");
			str=sc.next();
			if(str.equalsIgnoreCase("Y")) {
				pri();
			}else {System.out.println("bye bye.....");break;}
			}
	}
}