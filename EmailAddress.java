import java.util.Scanner;
public class EmailAddress {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please type your first name"); 
		String FInit = input.nextLine().substring(0,1).toUpperCase();
		System.out.println("Please type your middle name"); 
		String MInit = input.nextLine().substring(0,1).toUpperCase();
		System.out.println("Please type your last name"); 
		String LName = input.nextLine().toLowerCase();
		System.out.println("Please type your  birthday (mm-dd-yyyy)"); 
		String Bline = input.nextLine();
		String BDay = Bline.substring(3,5);
		String BMont = Bline.substring(0,2);
		String BYear = Bline.substring(6);
		input.close();
		System.out.println("Email: " + LName + FInit + MInit + "@sharkmail.com");
		System.out.println("");
		System.out.println("Temp password: " + BMont + BDay + BYear);
		System.out.println("");
		System.out.println("*** The Temp Password is Extermley unsecure please change it Immediatley! ***");
		
	}

}
//Great project. Just name your variables with lowercase letters. --> lInit instead of LInit. Even better is lastInit.
