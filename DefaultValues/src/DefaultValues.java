
public class DefaultValues {
	int i;//0
	String s;//null
	boolean b;//false
	DefaultValues obj1;//null
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i1;//not initialized to default value as it is a locaal variable to method
		String s1;////not initialized to default value as it is a locaal variable to method
		boolean b1;//not initialized to default value as it is a locaal variable to method
		DefaultValues obj2;//not initialized to default value as it is a locaal variable to method
		
		DefaultValues obj = new DefaultValues();
		System.out.println(obj.i +" "+ obj.s+"  "+obj.b);
		//instance variables are initialized to default values
		System.out.println(i1 +" "+ s1+"  "+b1);
		//where as local variables are not initialized to any default values neither primitives nor object references

		
		System.out.println(obj.obj1);
		System.out.println(obj2);

	}

}
