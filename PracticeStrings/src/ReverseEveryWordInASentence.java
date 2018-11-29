
public class ReverseEveryWordInASentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is a car";
		int j;
		String reverse="";
		String[] sarr=s.split(" ");
		
		for(int i=0;i<sarr.length;i++) {
			String word=sarr[i];
			for(j=word.length()-1;j>=0;j--) {
				reverse=reverse+word.charAt(j);
			}
			reverse=reverse+" ";
		}
		
		
			System.out.println(reverse);
	}

}
