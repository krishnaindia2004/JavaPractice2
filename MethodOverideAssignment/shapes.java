public class shape {

	public shape() {
		
	}
	public void test() {
		System.out.println("Override has done through calling peri class object!");
	}
	public void triangle() 
	{
		System.out.println("This is Triangle");
		System.out.println("3 Sides!");
	}
	public void square() 
	{
		System.out.println("This is Square");
		System.out.println("4 Sides!");

	}
	public void rectangle() 
	{
		System.out.println("This is rectangle");
		System.out.println("4 Sides!");
	}
	public class peri extends shape{

		public void triangle() 
		{
			int a=1,b=2,c=3;
			int res=a+b+c;
			System.out.println("Perimeter of Triangle:"+ res);
		}
		public void rectangle() 
		{
			int a=1,b=2;
			int res=2*(a+b);
			System.out.println("Perimeter of Rectangle:"+ res);
		}
		public void square() 
		{
			int a=1;
			int res=a+a+a+a;
			System.out.println("Perimeter of Square:"+ res);
		}
		
	}
		
	public static void main(String[] args) {
		shape obj=new shape();
		shape p=obj.new peri();
		p.triangle();
		obj.triangle();
		p.square();
		obj.square();
		p.rectangle();
		p.test();
		
}}
