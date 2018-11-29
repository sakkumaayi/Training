
public class ReverseWordsInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a car";
		String[] s1=s.split(" ");
		String[] reverseWords=new String[s1.length];
		for(int i=0;i<s1.length;i++) {
			reverseWords[i]=s1[s1.length-(i+1)];
		}
		
		for(int i=0;i<reverseWords.length;i++) {
			System.out.print(reverseWords[i]+" "
					+ "");
		}
	}

}
