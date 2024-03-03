package Practice;
import java.util.*;
public class Practice_Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the website:");
		String web = sc.nextLine();
		String domain = web.substring(web.lastIndexOf(".")+1);
		switch(domain){
		    case "org" : System.out.println("Organizational");
		                    break;
		    case "gov" : System.out.println("Government");
		                    break;
		    case "net" : System.out.println("Network");
		                    break;
		    case "com" : System.out.println("Commercial");
		                    break;
		}      
		sc.close();

	}

}
