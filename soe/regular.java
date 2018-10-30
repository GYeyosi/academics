package exp;

import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regular {

	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		File file = new File("/home/rc/Documents/programs/anil.cpp");
		try
		{
			Scanner sc = new Scanner(file);
			while(sc.hasNextLine())
			{
				String cl = sc.nextLine();
//				System.out.println(cl);
				Pattern pattern = Pattern.compile("int");
				Matcher m = pattern.matcher(cl);
				while(m.find())
				{
//					System.out.println(m.start() + " " + (m.end()-1));
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		try(PrintWriter out = new PrintWriter("/home/rc/Documents/programs/data.txt"))
		{
			out.print("aaa");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		String str = "^\\d+(\\.\\d+)?";//this\s+is\s+text
		String pp = "test*?";
		String p = "(void|int|float|double|char)\\s+\\b(";
//		p = "\\b[(]";
		Pattern pt = Pattern.compile(p);
		Matcher mc = pt.matcher("void func()");
		while(mc.find())
		{
			System.out.println(mc.start() + " " + (mc.end()-1));
		}
	}

}