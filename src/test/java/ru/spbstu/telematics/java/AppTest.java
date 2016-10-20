package ru.spbstu.telematics.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

import junit.framework.TestCase;
import org.junit.Test;

public class AppTest 
    extends TestCase
{
	
	// ARRAYLIST
    @Test
    public void testListSize()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.size() == 3);
    }
    
    @Test
    public void testListAdd()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.size() == 3);
    }
    
    @Test
    public void testListGet()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.get(1) == 2);
    }
    
    @Test
    public void testListIterator()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.iterator().next().intValue() == 1);
    }
    
    @Test
    public void testListEquals()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	ArrayList<Integer> list2 = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list2.add(1);
    	list2.add(2);
    	list2.add(3);
        assertTrue(list.equals(list2));
    }
    
    @Test
    public void testListEmpty()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
        assertTrue(!list.isEmpty());
    }
    
    @Test
    public void testListAddIndex()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.add(0, 5);
        assertTrue(list.iterator().next().equals(5));
    }
    
    @Test
    public void testListRemove()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.remove(2);
        assertTrue(list.size() == 2);
    }
    
    @Test
    public void testListToString()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
        assertTrue(list.toString().equals("[1, 2, 3]"));
    }
    
    @Test
    public void testListSet()
    {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	list.add(1);
    	list.add(2);
    	list.add(3);
    	list.set(2, 1);
        assertTrue(list.listIterator(2).next().equals(1));
    }
    
    @Test
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
    
    
    
    @Test
    public void testSetSize()
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	set.add(1);
    	set.add(2);
    	set.add(3);
    	set.add(4);
        assertTrue(set.size() == 4);
    }
    
    @Test
    public void testSetAdd()
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	set.add(1);
    	set.add(2);
    	set.add(3);
    	set.add(3);
        assertTrue(set.size() == 3);
    }
    
    @Test
    public void testSetIterator()
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	set.add(1);
    	set.add(2);
    	set.add(3);
        assertTrue(set.iterator().next().intValue() == 1);
    }
    
    @Test
    public void testSetEquals()
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	HashSet<Integer> set2 = new HashSet<Integer>();
    	set.add(1);
    	set.add(2);
    	set.add(3);
    	set2.add(1);
    	set2.add(2);
    	set2.add(3);
        assertTrue(set.equals(set2));
    }
    
    @Test
    public void testSetEmpty()
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	set.add(1);
    	set.add(2);
    	set.add(3);
        assertTrue(!set.isEmpty());
    }
    
    @Test
    public void testSetRemove()
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	set.add(1);
    	set.add(2);
    	set.add(3);
    	set.remove(1);
        assertTrue(set.size() == 2);
    }
    
    @Test
    public void testSetToString()
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	set.add(1);
    	set.add(2);
    	set.add(3);
        assertTrue(set.toString().equals("[1, 2, 3]"));
    }
    
    @Test
    public void testContains()
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	set.add(1);
    	set.add(2);
    	set.add(3);
        assertTrue(!set.contains(4));
    }
  
    @Test
    public void testSetClear()
    {
    	HashSet<Integer> set = new HashSet<Integer>();
    	set.add(1);
    	set.add(2);
    	set.add(3);
    	set.clear();
        assertTrue(set.size() == 0);
    }
    
   

    //TREEMAP

    
    
    @Test
    public void testMapSize()
    {
    	TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("Hello", "Java");
		map.put("Goodbye", "Genius");
		map.put("Bie", "Poe");
		map.put("Rose", "Gone");
		map.put("Pinky", "Brain");
        assertTrue(map.size() == 5);
    }
    
    @Test
    public void testMapRemove()
    {
    	TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("Hello", "Java");
		map.put("Goodbye", "Genius");
		map.put("Bie", "Poe");
		map.put("Rose", "Gone");
		map.remove("Hello");
        assertTrue(map.size() == 3);
    }

    @Test
    public void testMapGet()
    {
    	TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("Hello", "Java");
		map.put("Goodbye", "Genius");
		map.put("Bie", "Poe");
		map.put("Rose", "Gone");
        assertTrue(map.get("Bie").equals("Poe"));
    }

    @Test
    public void testMapContains()
    {
    	TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("Hello", "Java");
		map.put("Goodbye", "Genius");
		map.put("Bie", "Poe");
		map.put("Rose", "Gone");
        assertTrue(map.containsKey("Rose"));
        assertFalse(map.containsKey("jfose"));
    }
    
    @Test
    public void testMapToString()
    {
    	TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("Hello", "Java");
		map.put("Goodbye", "Genius");
		map.put("Bie", "Poe");
		map.put("Rose", "Gone");
        assertTrue(map.toString().equals("{Bie=Poe, Goodbye=Genius, Hello=Java, Rose=Gone}"));
    }
    
    @Test
    public void testMapFirstKey()
    {
    	TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("Hello", "Java");
		map.put("Goodbye", "Genius");
		map.put("Bie", "Poe");
		map.put("Rose", "Gone");
        assertTrue(map.firstKey().toString().equals("Bie"));
    }
    
    @Test
    public void testMapPut()
    {
    	TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("Hello", "Java");
		map.put("Goodbye", "Genius");
		map.put("Bie", "Poe");
		map.put("Rose", "Gone");
		map.put("Baby", "Right");
        assertTrue(map.size() == 5);
    }
    
    @Test
    public void testMapReplace()
    {
    	TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("Hello", "Java");
		map.put("Goodbye", "Genius");
		map.put("Bie", "Poe");
		map.put("Rose", "Gone");
		map.put("Baby", "Right");
		map.replace("Goodbye", "Genius", "C++");
        assertTrue(map.get("Goodbye") == "C++");
    }
    
    @Test
    public void testMapClear()
    {
    	TreeMap<String, String>map = new TreeMap<String, String>();
		map.put("Hello", "Java");
		map.put("Goodbye", "Genius");
		map.put("Bie", "Poe");
		map.put("Rose", "Gone");
		map.put("Baby", "Right");
		map.clear();
        assertTrue(map.size() == 0);
    }
}
