package junk;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][][] excel= new int[3][3][3];
		int [][] excel= {{10,20},{40,50},{80,90}};
		System.out.println(excel.length);//3 rows
		System.out.println(excel[0].length);//2 columns
		for(int i =0;i<excel.length;i++) {
			for(int j=0;j<excel[0].length;j++) {
				System.out.println(excel[i][j]);
			}
		}
	}

}
