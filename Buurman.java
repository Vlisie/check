package sorteren;


public class Buurman {

	public static void main(String args[]) {
		int[] waardeKaartOpPlaats = {3, 6, 2, 9};
		
		for(int i = 1; i < 4; i++) {
			int b = waardeKaartOpPlaats[i];
			int a = waardeKaartOpPlaats[i-1];
			int temp;
			
			if(a > b) {
				
				temp = a;
				a = b;
				b = temp;
				
			}
			//System.out.println("Na het wisselen:\n a= " + a + "\n b= " + b);
		int[] nieuweArray = {a, b};
		
		for(int j = 1; j < 2; j++) {
			int d = nieuweArray[j];
			int c = nieuweArray[j-1];
			
			if(c > d) {
				
				temp = c;
				c = d;
				d = temp;
			
			System.out.println(" " + c +"," + d);
			
			}
			else
			{
				System.out.print(" "+ a + "," + b);
			
			}
		
		}
		}
	}
}

	
