package ru.spbstu.telematics.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
//import org.junit.Test;

public class AppTest 
    extends TestCase
{
	
	// ARRAYLIST
    @org.junit.Test
    public void testListSize()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.size() == 3);
    }
    
    @org.junit.Test
    public void testListAdd()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.size() == 3);
    }
    
    @org.junit.Test
    public void testListGet()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.get(1) == 2);
    }
    
    @org.junit.Test
    public void testListIterator()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.iterator().next().intValue() == 1);
    }
    
    @org.junit.Test
    public void testListEquals()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.iterator().next().equals(1));
    }
    
    @org.junit.Test
    public void testListEmpty()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
        assertTrue(!list.isEmpty());
    }
    
    @org.junit.Test
    public void testListAddIndex()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(0, 5);
        assertTrue(list.iterator().next().equals(5));
    }
    
    @org.junit.Test
    public void testListRemove()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.remove(2);
        assertTrue(list.size() == 2);
    }
    
    @org.junit.Test
    public void testListToString()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.toString().equals("[1, 2, 3]"));
    }
    
    @org.junit.Test
    public void testListSet()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.set(2, 1);
        assertTrue(list.listIterator(2).next().equals(1));
    }
    
    @org.junit.Test
    public void testListClear()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.clear();
        assertTrue(list.size() == 0);
    }
    
    
    
    //HASHSET!!!!!!!
    
    
    
    @org.junit.Test
    public void testSetSize()
    {
    	HashSet<Integer> Set = new HashSet<Integer>();
    	Set.add(1);
    	Set.add(2);
    	Set.add(3);
    	Set.add(4);
        assertTrue(Set.size() == 4);
    }
    
    @org.junit.Test
    public void testSetAdd()
    {
    	HashSet<Integer> Set = new HashSet<Integer>();
    	Set.add(1);
    	Set.add(2);
    	Set.add(3);
        assertTrue(Set.size() == 3);
    }
    
    @org.junit.Test
    public void testSetIterator()
    {
    	HashSet<Integer> Set = new HashSet<Integer>();
    	Set.add(1);
    	Set.add(2);
    	Set.add(3);
        assertTrue(Set.iterator().next().intValue() == 1);
    }
    
    @org.junit.Test
    public void testSetEquals()
    {
    	HashSet<Integer> Set = new HashSet<Integer>();
    	Set.add(1);
    	Set.add(2);
    	Set.add(3);
        assertTrue(Set.iterator().next().equals(1));
    }
    
    @org.junit.Test
    public void testSetEmpty()
    {
    	HashSet<Integer> Set = new HashSet<Integer>();
    	Set.add(1);
    	Set.add(2);
    	Set.add(3);
        assertTrue(!Set.isEmpty());
    }
    
    @org.junit.Test
    public void testSetRemove()
    {
    	HashSet<Integer> Set = new HashSet<Integer>();
    	Set.add(1);
    	Set.add(2);
    	Set.add(3);
    	Set.remove(1);
        assertTrue(Set.size() == 2);
    }
    
    @org.junit.Test
    public void testSetToString()
    {
    	HashSet<Integer> Set = new HashSet<Integer>();
    	Set.add(1);
    	Set.add(2);
    	Set.add(3);
        assertTrue(Set.toString().equals("[1, 2, 3]"));
    }
    
    @org.junit.Test
    public void testContains()
    {
    	HashSet<Integer> Set = new HashSet<Integer>();
    	Set.add(1);
    	Set.add(2);
    	Set.add(3);
        assertTrue(!Set.contains(4));
    }
  
    @org.junit.Test
    public void testSetClear()
    {
    	HashSet<Integer> Set = new HashSet<Integer>();
    	Set.add(1);
    	Set.add(2);
    	Set.add(3);
    	Set.clear();
        assertTrue(Set.size() == 0);
    }
    
   

    //TREEMAP

    
    
    @org.junit.Test
    public void testMapSize()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
		Map.put("Pinky", "Brain");
        assertTrue(Map.size() == 5);
    }
    
    @org.junit.Test
    public void testMapAdd()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
        assertTrue(Map.size() == 4);
    }
    
    @org.junit.Test
    public void testMapRemove()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
		Map.remove("Hello");
        assertTrue(Map.size() == 3);
    }

    @org.junit.Test
    public void testMapGet()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
        assertTrue(Map.get("Bie") == "Poe");
    }

    @org.junit.Test
    public void testMapContains()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
        assertTrue(Map.containsKey("Rose"));
    }
    
    @org.junit.Test
    public void testMapToString()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
		System.out.println(Map);
        assertTrue(Map.toString().equals("{Bie=Poe, Goodbye=Genius, Hello=Java, Rose=Gone}"));
    }
    
    @org.junit.Test
    public void testMapFirstKey()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
        assertTrue(Map.firstKey().toString().equals("Bie"));
    }
    
    @org.junit.Test
    public void testMapPut()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
		Map.put("Baby", "Right");
        assertTrue(Map.size() == 5);
    }
    
    @org.junit.Test
    public void testMapReplace()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
		Map.put("Baby", "Right");
		Map.replace("Goodbye", "Genius", "C++");
        assertTrue(Map.get("Goodbye") == "C++");
    }
    
    @org.junit.Test
    public void testMapClear()
    {
    	TreeMap<String, String>Map = new TreeMap<String, String>();
		Map.put("Hello", "Java");
		Map.put("Goodbye", "Genius");
		Map.put("Bie", "Poe");
		Map.put("Rose", "Gone");
		Map.put("Baby", "Right");
		Map.clear();
        assertTrue(Map.size() == 0);
    }
}
