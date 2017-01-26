import java.io.*;
import java.util.*;


public class LLReverse	{

	
	public static void main(String[] args)	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		// CREATE LIST
		for(int i = 0; i < 8; i++)
			list.add(i);

		// SOLUTION
		for(int i = list.size() / 2; i < list.size(); i++)	{
			list.add(i, list.removeLast());
		}
		// DISPLAY
		System.out.println(list);
		System.exit(0);
	}
}
