//Accept n integers from user and store them in a collection.Display in the sorted order.collection should not accept duplicate element.
//Search for a particular element in the collection

import java.io.*;
import java.util.*;
public class Slip19_2
{
	public static void main(String args[])
	{
		try
    	{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			TreeSet ts=new TreeSet();
			System.out.println("How many no u want to enter?");
			int no=Integer.parseInt(br.readLine());
			for(int i=0;i<no;i++)
			{
				System.out.println("Enter the no"+(i+1)+":");
				int n=Integer.parseInt(br.readLine());
				ts.add(new Integer(n));
			}
			System.out.println("Elements in sorteed order"+ts);
			System.out.println("Enter Element to search: ");
			int key=Integer.parseInt(br.readLine());
			if(ts.contains(new Integer(key)))
				System.out.println("Element found ");
			else
				System.out.println("Element not found ");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}