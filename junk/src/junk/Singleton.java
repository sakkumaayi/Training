package junk;

public class Singleton {
	public static Singleton s=null;

	private Singleton() {
	
	}
	public  static Singleton getInstance() {
		if(s==null) {
			s=new Singleton();
		}
		return s;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s=Singleton.getInstance();
	}

}
