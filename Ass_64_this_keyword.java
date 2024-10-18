package assignments_AB45;

public class Ass_64_this_keyword 
{
    String name="Supriya";
    int id=64;
    void username(String name,int id)
    {
    	this.id=id;
    	this.name=name;
    }
	public static void main(String[] args)
	{
		Ass_64_this_keyword ob=new Ass_64_this_keyword();
		System.out.println(ob.name);
		System.out.println(ob.id);
		ob.username("Anish", 14);
		System.out.println(ob.name);
		System.out.println(ob.id);

	}

}
