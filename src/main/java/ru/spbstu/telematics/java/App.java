package ru.spbstu.telematics.java;

import java.io.*;


public class App 
{
	public static void main( String[] args )
	{
		MyHashMap<String, Integer> j = new MyHashMap<String,Integer>();
		System.out.println(j.size());
		j.put("Hello", 1);
		j.put("Hell", 1);
		j.put("Java", 1);
		j.put("Hell", 5);
		j.put("Hell", 5);
		System.out.println(j.size());
		j.get("Hell");
		j.get("Hello");
		j.containsKey("Hello");
		j.containsKey("AAAAAAAAAAAAAAAAAA");
		j.remove("Me");
		System.out.println(j.size());
		j.remove("Hello");
		System.out.println(j.size());
		j.put("Hello", 1);
		System.out.println(j.size());
		
	}

}
