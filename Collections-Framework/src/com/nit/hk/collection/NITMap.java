package com.nit.hk.collection;

public class NITMap {
	private Object[] keys;
	private Object[] values;
	private int size;
	
	public NITMap() {
		keys = new Object[10];
		values = new Object[10];
		size = 0;
	}

	public void put(Object key, Object value) {
		if(size == keys.length)
			grow();
		keys[size] = key;
		values[size] = value;
		size++;
	}

	private void grow() {
		Object[] nextKeysArray = new Object[keys.length * 2];
		Object[] nextValesArray = new Object[values.length *2];
		
		for (int i = 0; i < keys.length; i++) {
			nextKeysArray[i] = keys[i];
			nextValesArray[i] = values[i];
		}
		keys = nextKeysArray;
		values = nextValesArray;
	}
	
	public int size() {
		return size;
	}
	
	@Override
	public String toString() {
		if(size == 0)
			return "{}";
		
		StringBuilder sb=new StringBuilder();
		sb.append("{");
		
		for (int i = 0; i < size; i++) {
			sb.append(keys[i]);
			sb.append("=");
			sb.append(values[i]);
			sb.append(", ");
		}
		int index = sb.lastIndexOf(", ");
		sb.delete(index, index+2);
		sb.append("}");
		
		return sb.toString();
	}

	public boolean search(Object obj) {
		if(obj == null) {
			for (int i = 0; i < size; i++) {
				if(obj == keys[i])
					return true;
			}
			return false;
		} else {
			for (int i = 0; i < size; i++) {
				if(obj.equals(keys[i]))
					return true;
			}
			return false;
		}
	}
}
