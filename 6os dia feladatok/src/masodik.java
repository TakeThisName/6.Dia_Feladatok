import java.util.Scanner;

public class masodik {
	
	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			System.out.println("Kérem adja meg a tömb hosszát");
			int a = beolvas.nextInt();
			float szamok[] = new float[a];
			float osszeg = 0;
			int parosok = 0;
			
			
			for (int i = 0; i < szamok.length; i++) {
				System.out.println((i+1)+") Adj egy számot");
				szamok[i] = beolvas.nextFloat();
				osszeg = osszeg + szamok[i];
				if (szamok[i] % 2 == 0)
					parosok++;
			}
			float atlag = osszeg / a;
			System.out.println("Az összeg: "+osszeg);
			System.out.println("Az átlag: "+atlag); // harmadik feladattal kitoldva
			System.out.println("Párosok száma: "+parosok);
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}