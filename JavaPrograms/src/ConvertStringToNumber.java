
public class ConvertStringToNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum =covert("3540");
		System.out.println(sum);
	}
	public static int covert(String numStr) {
		 char ch[] = numStr.toCharArray();
	        int sum = 0;
	        //get ascii value for zero
	        int zeroAscii = (int)'0';
	        for(char c:ch){
	            int tmpAscii = (int)c;
	            System.out.println(tmpAscii+" "+zeroAscii);
	            sum = (sum*10)+(tmpAscii-zeroAscii);
	        }
	        return sum;
	}

}
