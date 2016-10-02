package fcu.iecs.oop;

public class HW1 {

	public static void main(String[] args) {
		
		String lyrics="Let her go!Let it go!Cannot hold it back anymore";
		/*String a=lyrics.substring(0,4);
		String b="her";
		String c=lyrics.substring(7,11);
		String d="Can't ";
		String e=lyrics.substring(28);*/
		String a=lyrics.replace("it","her");
		String b=a.replace("Cannot","Can't");
		System.out.println(b);

	}

}
