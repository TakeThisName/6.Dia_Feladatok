import java.util.Scanner;

public class negyedik {

	public static void main(String[] args) {
		String[] napok = new String[] {"hétfő", "kedd", "szerda", "csütörtök", "péntek", "szombat", "vasárnap"};
		Scanner beolvas = new Scanner(System.in);
		
		try {
			System.out.println("Kérem a aszámot");
			int index = beolvas.nextInt();
			System.out.println(napok[index-1]);
		} catch (Exception e) {
			System.err.println(e);
		}

	}

}
