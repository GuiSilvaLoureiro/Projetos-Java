
public class Strings {

	public static void main(String[] args) 
	{
		String original = "abcde FGHIJ ABC abc DEFG   ";
		String s = "batata laranja uva manga";
		
		String[] vetor = s.split(" ");
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		System.out.println(vetor[3]);
		
		String e1 = original.toLowerCase();
		String e2 = original.toUpperCase();
		String e3 = original.trim();
		String e4 = original.substring(2);
		String e5 = original.substring(2, 9);
		String e6 = original.replace('a', 'x');
		String e7 = original.replace("abc", "gui");
		int i = original.indexOf("FG");
		int t = original.lastIndexOf("DE");
		
		System.out.println(original);
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
		System.out.println(e4);
		System.out.println(e5);
		System.out.println(e6);
		System.out.println(e7);
		System.out.println(i);
		System.out.println(t);
		
	}

}
