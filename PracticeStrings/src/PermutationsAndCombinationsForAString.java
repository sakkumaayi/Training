
public class PermutationsAndCombinationsForAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="abc";
		String chosen="";
		char[] a=str.toCharArray();
		int length =a.length;
		//permuteAString(str, chosen) ;
		//System.out.println("8888888888888888888888888888888888888888888888888888888888888888");
		permutation(chosen, str);
		//
		permute(a, 0, length) ;
	}
	private static void permutation(String chosen, String word) { 
		//int j=0;
		if (word.isEmpty()) { 
			System.out.println(chosen + word); 
			} else { 
				for (int i = 0; i < word.length(); i++) { 
					permutation(chosen+word.charAt(i), word.substring(0, i) + word.substring(i + 1)); 
					} 
				} 
		}

	//Read more: https://javarevisited.blogspot.com/2015/08/how-to-find-all-permutations-of-string-java-example.html#ixzz5Tr6rFWCn
	
	
	static void permute(char[] a, int k,int length) 
    {
        if (k == length) 
        {
            for (int i = 0; i < length; i++) 
            {
                System.out.print(a[i]);
            }
            System.out.println();
        } 
        else 
        {
            for (int i = k; i < length; i++) 
            {
                char temp = a[k];
                a[k] = a[i];
                a[i] = temp;
 
                
                permute(a, k + 1, length);
 
                temp = a[k];
                a[k] = a[i];
                a[i] = temp;
            }
        }
    }
	
	static void permuteAString(String str, String chosen) {
		int i=0;
		for(i=0;i<str.length();i++) {
			//char c=str.charAt(i);
			//chosen+=str.charAt(i);
			//String remaining=str.substring(i+1);
			System.out.println(chosen+" "+str);
			permuteAString(str.substring(0, i)+str.substring(i+1),chosen+str.charAt(i));
			chosen="";
		}
	}
}
