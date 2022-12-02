public class Pattern1 {

	public static void main(String[] args) {
		for(int i=0;i<14;i++) {
			for(int j=0;j<14;j++) {
				if( ((i>13/2)  &&( i-j>13/2))   ||i+j>=20)    {
				System.out.print("* ");
			}else {
				System.out.print("  ");
			}
			}
			System.out.println("  ");
			
		}
	

	}

}
