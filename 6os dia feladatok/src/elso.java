import java.util.Scanner;

public class elso {
	
	static Scanner beolvas = new Scanner(System.in);
	
	public static void main(String[] args) {
		try {
			int szamok[] = new int[10];
			
			for (int i = 0; i < szamok.length; i++) {
				System.out.println((i+1)+") Adj egy számot");
				szamok[i] = beolvas.nextInt();
			}
			
			for (int i = 0; i < szamok.length; i++) {
				System.out.println(szamok[i]+", ");
			}
		} catch (Exception e) {
			System.out.println(e);
			
		}
	}

}
