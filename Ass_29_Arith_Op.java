package assignments_AB45;

public class Ass_29_Arith_Op {

	void add(int a,int b)
	{
		int c=a+b;
		System.out.println("Addition is: "+ c);
	}

	void sub(double c,double d)
	{
		double e=c-d;
		System.out.println("Subtraction is : "+e);
	}
	
	void mul(float x,float y)
	{
		float z=x*y;
		System.out.println("Multiplication is :"+z);
	}
	void div(double a,double b)
	{
		double div=a/b;
		System.out.println("Division is : "+ div);
	}
	void modulo(float s,float t)
	{
		float mod=s%t;
		System.out.println("Modulus is : "+mod);
	}
	public static void main(String[] args)
	{
		Ass_29_Arith_Op ob=new Ass_29_Arith_Op();
		ob.add(12, 45);
		ob.sub(78.56, 68.28);
		ob.mul(578,745);
		ob.div(746,56);
		ob.modulo(458, 6);
		
		
	}

}
