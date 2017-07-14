package tue;

public class Buffertest {
	public static void main(String []args)
	{
		String s1="abc";
		System.out.println(s1);
	StringBuffer t=new StringBuffer("akhil");
	StringBuffer t2=t.append("reddy");
	System.out.println(t.insert(1,'f'));
	System.out.println(t.reverse());
	System.out.println(t.capacity());
	System.out.println(t.hashCode());
	System.out.println(t2.hashCode());
	System.out.println(s1.hashCode());
	
	}
	

}
