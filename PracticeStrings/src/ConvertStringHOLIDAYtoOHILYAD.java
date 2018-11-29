
public class ConvertStringHOLIDAYtoOHILYAD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="HOLIDAY";
		String convertedString=convertStringHOLIDAYtoOHILYAD (s);
		System.out.println(convertedString);
		}
		
		
	static String  convertStringHOLIDAYtoOHILYAD (String s) {
		char[] c = s.toCharArray();
		int i=0;
		//char temp;
		while(i<c.length-2) {
			
			if(i==4) {
				swap(c, i,i+2 );
			}else {
				swap(c,i,i+1);
			}
			i=i+2;
		}
		for(int f=0;f<c.length;f++) {
			System.out.print(c[f]);
		}
		System.out.println();
		String convertedString=new String(c);
		return convertedString;
		
	}
	static void swap(char[] c, int start, int end) {
		char temp=c[start];
		c[start]=c[end];
		c[end]=temp;
		//System.out.println(c+d);
	}
}
