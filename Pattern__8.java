
public class Pattern__8 {
	public static void main(String[]args) {
		int k=8;
		for(int i=1;i<=k;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("  ");
			}
			for(int m=k;m>i;m--) {
				System.out.print("* ");
			}
			for(int m=k;m>=i;m--) {
				System.out.print("* ");}
			
			System.out.println();
					}
	}

}
