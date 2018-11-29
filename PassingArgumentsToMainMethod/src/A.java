
public class A {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//args = new String[5]; when we declare array size all the values are null by default
		//System.out.println(args);//throws arrayoutofboundException as array size is not declared
		B.main(args);
		System.out.println(args[0] + " " +args[1]+" " + args[2]);
	}

}
