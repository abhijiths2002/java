import graphics.*;
class area
{
	public static void main(String args[])
	{
		rectangle rt=new rectangle();
		triangle tr=new triangle();
		square sq=new square();
		circle cr=new circle();
		rt.area();
		rt.display();
		tr.area();
		tr.display();
		sq.area();
		sq.display();
		cr.area();
		cr.display();
	}
}

