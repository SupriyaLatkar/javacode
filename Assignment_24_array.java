package assignments_AB45;

public class Assignment_24_array 
{
public static void main(String[] args) 
   {
	int stu_id[]=new int[4];
	
	stu_id[0]=12;
	stu_id[1]=32;
	stu_id[2]=52;
	stu_id[3]=62;
	
	String name[]=new String[4];
	
	name[0]="Anish";
	name[1]="Supriya";
	name[2]="Shridhar";
	name[3]="Amey";
	
	for(int i=0;i<4;i++)
	{
		System.out.println("Student ID is: "+stu_id[i]+"  "+"Student Name is : "+name[i]);
		
	}
	
	char ch[]=new char[5];
	
	ch[0]='A';
	ch[1]='N';
	ch[2]='I';
	ch[3]='S';
	ch[4]='H';
	
	for(int i=0;i<=4;i++)
	{
	System.out.println("Char array has "+ch[i]);
	}
	
	double weight[]	=new double[3];
	
	weight[0]=45.6;
	weight[1]=78.3;
	weight[2]=35.9;
	
	for(int i=0;i<3;i++)
	{
	System.out.println("Weight of Student"+" " +i+" "+ "is"+"  "+weight[i]);
	}
	
	boolean attendance[]=new boolean[4];
	
	attendance[0]=true;
	attendance[1]=false;
	attendance[2]=true;
	attendance[3]=false;
	
	for(int i=0;i<=3;i++)
	{
		if(attendance[i]==true)
	        System.out.println("Student"+" " +i+" "+ "is present"+"  "+attendance[i]);
		else
			System.out.println("Student"+" " +i+" "+ "is absent"+"  "+attendance[i]);	
	}

      
   
   }


}
