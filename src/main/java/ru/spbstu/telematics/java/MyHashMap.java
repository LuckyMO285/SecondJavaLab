package ru.spbstu.telematics.java;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.lang.Override;

public class MyHashMap<K,V> implements Map<K,V>{

	Object KEY_ARRAY[] = new Object[1];
	Object VALUE_ARRAY[] = new Object[1];
	private int size = 0;

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean containsKey(Object key) {
		// TODO Auto-generated method stub
		if (size == 0){
			System.out.println("false");
			return false;
		}
		for (int i = 0; i < size; i++){
			if(KEY_ARRAY[i] == key) {
				System.out.println("true");
				return true;
			}
		}
		System.out.println("false");
		return false;
	}

	@Override
	public boolean containsValue(Object value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public V get(Object key) {			
		// TODO Auto-generated method stub
		if (size == 0)
			return null;
		for (int i = 0; i < size; i++){
			if(KEY_ARRAY[i] == key) {
				System.out.println(VALUE_ARRAY[i]);
				return (V) VALUE_ARRAY[i];
			}
		}
		return null;
	}

	@Override
	public V put(K key, V value) {
		// TODO Auto-generated method stub
		for (int i = 0; i < size; i++){
			if(KEY_ARRAY[i] == key) {
				VALUE_ARRAY[i] = value;
				return value;
			}
		}
		if (size == 0){
			KEY_ARRAY[size] = key;
			VALUE_ARRAY[size] = value;
			size+=1;
		}
		else{
			Object TEMP_KEY_ARRAY[] = new Object[size];
			Object TEMP_VALUE_ARRAY[] = new Object[size];
			TEMP_KEY_ARRAY = KEY_ARRAY;
			TEMP_VALUE_ARRAY = VALUE_ARRAY;
			size+=1;
			KEY_ARRAY = new Object[size];
			VALUE_ARRAY = new Object[size];
			for (int i = 0; i < size-1; i++){
				KEY_ARRAY[i] = TEMP_KEY_ARRAY[i];
				VALUE_ARRAY[i] = TEMP_VALUE_ARRAY[i];
			}
			KEY_ARRAY[size-1] = key;
			VALUE_ARRAY[size-1] = value;
		}
		return value;
	}

	@Override
	public V remove(Object key) {
		if (size == 0){
			System.out.println("Not Found");
			return null;
		}
		for (int i = 0; i < size; i++){
			if(KEY_ARRAY[i] == key) {
				Object TEMP_KEY_ARRAY[] = new Object[size];
				Object TEMP_VALUE_ARRAY[] = new Object[size];
				TEMP_KEY_ARRAY = KEY_ARRAY;
				TEMP_VALUE_ARRAY = VALUE_ARRAY;
				size-=1;
				KEY_ARRAY = new Object[size];
				VALUE_ARRAY = new Object[size];
				for (int j = 0; j < size+1; j++){
					if (j < i){
						KEY_ARRAY[j] = TEMP_KEY_ARRAY[j];
						VALUE_ARRAY[j] = TEMP_VALUE_ARRAY[j];
					}
					if (j > i){
						KEY_ARRAY[j-1] = TEMP_KEY_ARRAY[j];
						VALUE_ARRAY[j-1] = TEMP_VALUE_ARRAY[j];
					}
				}
				System.out.println("Deleted");
				return null;
			}
		}
		// TODO Auto-generated method stub
		System.out.println("Not Found");
		return null;
	}

	@Override
	public void putAll(Map<? extends K, ? extends V> m) {
		// TODO Auto-generated method stub

	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

	@Override
	public Set<K> keySet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<V> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<java.util.Map.Entry<K, V>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
