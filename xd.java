class inheritance {
int roll,marks;
void input()
{
	System.out.println("Enter roll number & marks:");
}
}
class xd extends inheritance 
{
	void disp()
	{
		int roll=32; 
		String name="Istiyak"; 
		int marks=90;
		System .out.println(roll +name+marks);
		}
	public static void main(String args[])
	{
		istiyak r=new istiyak();
		r.input();
		r.disp();
	}
}
