interface Test{
	void meth1();
	void meth2();
}
class My implements Test{
	public void meth1()
	{
		System.out.println("This is Meth1.");
	}
	public void meth2()
	{
		System.out.println("This is Meth2.");
	}
	public void meth3()
	{
		System.out.println("This is Meth3.");
	}
}
public class InterfaceTest{
	public static void main(String args[])
	{
		My t=new My();
		t.meth1();
		t.meth2();
		t.meth3();
	}
}