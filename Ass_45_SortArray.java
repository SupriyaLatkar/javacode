package assignments_AB45;

import java.util.Arrays;

public class Ass_45_SortArray 
{

	public static void main(String[] args) 
	  {
		  int stud1[]=new int[5];
		  int notocheck=34;
		  
		  stud1[0]=71;
		  stud1[1]=98;
		  stud1[2]=34;
		  stud1[3]=51;
		  stud1[4]=14;
		  
		  System.out.println("-----------Before Sort-------");
		  System.out.println(Arrays.toString(stud1));
		  Arrays.sort(stud1);
		  System.out.println("-----------After Sort-------");
		  System.out.println(Arrays.toString(stud1));
		  
	  }
}
