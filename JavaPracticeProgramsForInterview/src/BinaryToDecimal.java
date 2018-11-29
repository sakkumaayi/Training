
public class BinaryToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] binary= {1, 1,0,0,1,1};
		binaryToDecimal(binary);
		binarytodecimalWithoutPassingArrayJustPassingBinaryNumberAsAInteger(11001);
	}
	static void binaryToDecimal(int[] binary) {
		int decimal=0;
		for(int i=binary.length-1,j=0;i>=0;i--,j++) {
			decimal=decimal+((int)(Math.pow(2, j))*binary[i]);
		}
		

		System.out.println(decimal);
	}
	
	static void binarytodecimalWithoutPassingArrayJustPassingBinaryNumberAsAInteger(int binaryasinteger) {
		int decimal=0;
		int i=0,pow=1;
		while(binaryasinteger>0) {
			int r=binaryasinteger%10;
			//decimal=decimal+(((int)(Math.pow(2, i++)))*r);this can be replaced as follows
			/*decimal=decimal+pow*r;
			pow=pow*2;*/
			//either one of the commented code can be used
			
			binaryasinteger=binaryasinteger/10;
		}
		System.out.println(decimal);
	}
}
