
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		boolean c;
		String s="abc";
		
		boolean b=a==10?true:false;
		System.out.println(b);
		System.out.println("==========================================");
		
		
		if(a==19) {
			c=true;
		 }else{
			  c=false;
		 }
		System.out.println(c);
		System.out.println("=============================================");
		
		
		if(s=="abdc") {
			c=true;
		}else {
			c=false;
		}
		System.out.println(c);
		System.out.println("=============================================");
		
		boolean d=s=="abc"?true:false;
		System.out.println(d);
	}

}
