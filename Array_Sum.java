public class Array_Sum {
static int getsum(int [] values) {
		int sum=0;
		for(int num:values)
		{
			sum=sum+num;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		int res=getsum(new int [] {1,2,3,4});
		System.out.println(res);
		
}

}