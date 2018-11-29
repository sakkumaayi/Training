
public class MaxHourGlassSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int[][] a= {{1,1,1,0,0},{0,1,0,0,0},{1,1,1,0,0},{0,0,0,0,0},{0,0,0,0,0}};
 int r=5;//rows
 int c=5;//columns
 int sum=0;
 int max_sum=Integer.MIN_VALUE;
 for(int i=0;i<(r-2);i++) {	
	 for(int j=0;j<(c-2);j++) {
		sum=a[i][j]+a[i][j+1]+a[i][j+2]+a[i+1][j+1]+a[i+2][j]+a[i+2][j+1]+a[i+2][j+2];//sum of each hour glass
		if(max_sum <sum) {
			max_sum=sum;
		}
	 }
 }
 System.out.println(max_sum);
 }

}
