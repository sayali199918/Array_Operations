public class AverageValue {

	static float getavg(int [] values) {
		int sum=0;
		for(int num:values)
		{
			sum=sum+num;
		}
		float avg=sum/4;
		return avg;
		
	}
	public static void main(String[] args) {
		float res=getavg(new int [] {1,2,3,4});
		System.out.println(res);
		
	}

}
