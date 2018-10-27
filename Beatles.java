// File: Beatles.java
// Name: Jennifer King
// Date: 10/22/2018

import java.util.ArrayList;

public class Beatles 
{
	public static void main(String[] args)
	{
		ArrayList band = new ArrayList();
		band.add("Paul");
		band.add("Pete");
		band.add("John");
		band.add("George");
		System.out.println(band);
		band.remove(1);
		System.out.println(band);
		System.out.println("At index 1: " + band.get(1));
		band.add(2, "Ringo");
		System.out.println("Size of the band: " + band.size());
		display(band);
	}
	
	public static void display(ArrayList band)
	{
		for(int i = 0; i < band.size(); ++ i)
		{
			System.out.println(band.get(i));
		}
	}
}

