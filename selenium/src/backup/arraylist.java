package backup;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) 
	{
		ArrayList<Object> s=new ArrayList<Object>();
		//to write the data into an arraylist
		
		s.add("Sulochana");
		s.add("Sravanthi");
		s.add("Sushma");
		s.add("Bharath");
		s.add(4, false);
		//to find the length of the arraylist
		
		System.out.println(s.size());
		
		//to read the values from an arraylist
		
		for (int i = 0; i < s.size(); i++) 
		{
		
			System.out.println(s.get(i));
		}
	

	}

}
