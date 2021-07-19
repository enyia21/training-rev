
public class MethodParams {
	public static void main(String[] args) {
		MethodParams mp  = new MethodParams();
		
		//call your method here
		double d = mp.convertIntToDouble(44);
		
		System.out.println(d);
		
		System.out.println(mp.sum(1.0, 2, 3));
	}
	//create your first Method here
	public double convertIntToDouble(int num) {
		return (double)num;
	}
	
	public double sum(double num1, double num2, double num3) {
		return (num1 + num2 + num3);
	}
}
