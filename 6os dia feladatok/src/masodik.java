import java.util.Scanner;

public class masodik {
	
	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.println("Kérem adja meg a tömb hosszát");
			int a = beolvas.nextInt();
			float szamok[] = new float[a];
			float osszeg = 0;
			
			
			for (int i = 0; i < szamok.length; i++) {
				System.out.println((i+1)+") Adj egy számot");
				szamok[i] = beolvas.nextFloat();
				osszeg = osszeg + szamok[i];
			}
			float atlag = osszeg / a;
			System.out.println("Az összeg: "+osszeg);
			System.out.println("Az átlag: "+atlag);
			
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}