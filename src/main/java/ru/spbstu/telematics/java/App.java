package ru.spbstu.telematics.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeMap;

import org.junit.Test;

/**
 * Hello world!
 *
 */

public class App 
{
	public static void main( String[] args )
	{
		
		//ARRAYLIST!!!!!!
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Hello");
		list.add(",");
		list.add("it's");
		list.add("me!");

		System.out.println(list);

		list.add(2, "Mario,");

		System.out.println(list);

		list.remove(2);

		System.out.println(list);

		System.out.println(list.size());

		System.out.println(list.get(2));

		if(!list.isEmpty()){
			System.out.println(list.toString());
		}

		Iterator<String> iter= list.iterator();

		if (iter.hasNext())
		{
			System.out.println(iter.next());
		}

		String forEquals = "Hello";

		if ((iter.next()).toString().equals(forEquals));
		{
			System.out.println("Yeah");
		}

		list.set(3, "Hello");

		System.out.println(list);

		list.clear();

		System.out.println(list.size());

		
		
		
		
		
		//HASHSET!!!!!!!

		HashSet<String> Set = new HashSet<String>();

		if (Set.isEmpty())
		{
			Set.add("All");
			Set.add("Pew");
		}

		Set.add("All");
		Set.add("Summer");
		Set.add("Sixteen");

		System.out.println(Set);

		System.out.println(Set.size());

		Iterator<String> iterSet = Set.iterator();

		if(iterSet.hasNext()){
			System.out.println(iterSet.next());			//после использования next перескакивает на следующий элемент
		}

		String forSetEquals = "Pew";
		
		if (iterSet.next().equals(forSetEquals))
		{
			System.out.println("Yeah2");
		}
		
		if (iterSet.next().equals(forSetEquals))
		{
			System.out.println("Yeah2");
		}
		
		System.out.println(Set.getClass());
		
		System.out.println(Set.hashCode());
		
		Set.remove("Summer");
		
		System.out.println(Set);
		
		Set.clear();
		
		System.out.println(Set.size());
		
		
		
		//TREEMAP!!!!!!!!!
		
		TreeMap<String, String>Map = new TreeMap<String, String>();
		if (Map.isEmpty()){
			Map.put("Hello", "World");
		}
		
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		System.out.println(Map);
		Map.size();
		Map.remove("Hello");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
		Map.put("Pinky", "Brain");
		System.out.println(Map.get("Bie"));
		System.out.println(Map.lastKey().toString());
		Map.clear();
	}

}
