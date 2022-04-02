
public class patterns__9 {
	public static void main(String[]args) {
		int n=6;
		for(int i=1;i<n;i++) {
			for(int j=n;j>=i;j--) {
				System.out.print("  ");}
			for(int k=1;k<i;k++) {
				System.out.print("* ");
			}
				
			for(int k=1;k<=i;k++) {
				System.out.print("* ");}
			System.out.println();
		
	}
		int k=6;
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
