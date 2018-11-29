import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rn= new Random();
		int n=rn.nextInt();
		System.out.println(n);
		System.out.println(rn.nextBoolean());
		System.out.println(rn.nextDouble());
		System.out.println(rn.toString());
	}

}
