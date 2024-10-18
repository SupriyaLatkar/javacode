package arrays;

public class Array_checkNumber 
{
  public static void main(String[] args) 
  {
	  int stud1[]=new int[5];
	  int notocheck=34;
	  
	  stud1[0]=21;
	  stud1[1]=31;
	  stud1[2]=34;
	  stud1[3]=51;
	  stud1[4]=61;
	  
	  for(int i=0;i<stud1.length;i++)
	  {
		  if(notocheck==stud1[i])
		  {
			  System.out.println("34 is present at index"+" "+i);
		  }
		  
	  }
  }
}
