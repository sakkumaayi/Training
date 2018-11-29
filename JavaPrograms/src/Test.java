
public class Test {
    public static void main(String[] args) {
    	String s = new String();
    	String s1=null;
        System.out.println("main(String[] args)");
        main(s);
        main(s,s1);
    }

    public static void main(String arg1) {
        System.out.println("main(String arg1)");
    }

    public static void main(String arg1, String arg2) {
        System.out.println("main(String arg1, String arg2)");
    }
    
}