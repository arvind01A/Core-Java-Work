package com.nit.hk.collection;

import java.util.Iterator;

public class NITLinkedList<E> {
	private int size=0;
	Node<E> first;
	Node<E> last;
	
	private static class Node<E>{
		private Node<E> prev;
		private E item;
		private Node<E> next;
		
		Node(Node<E> prev,E item, Node<E> next){
			this.item = item;
			this.prev = prev;
			this.next = next;
		}		
	}
	
	public boolean add(E e) {
		final Node<E> newNode = new Node<>(last, e, null);
		if(last == null)
			first = newNode;
		else 
			last.next = newNode;
		
		last = newNode;
		size++;
		return true;
	}
	
	public int size() {
		return size;
	}
	
	public boolean contains(Object obj) {
		//return indexOf(obj)>=0;
		if(obj == null) {
			for (Node node = first; node != null; node = node.next) {
				if(node.item == null)
					return true;
			}
		/*Node node = first;
			for (int i = 0; i < size; i++) {
				if(obj == node.item)
					return true;
			}*/
			return false;
		} else {
			for (Node node = first; node != null; node = node.next) {
				if(obj.equals(node.item))
					return true;
			}
			return false;
		}
	}
	
	public int sizeOf(E e) {
		if(e == null) {
			int index = 0;
			for (Node node = first; node != null; node = node.next) {
				if(node.item == null)
					return index;
				index++;
			}
			return -1;
		} else {
			int index = 0;
			for (Node node = first; node != null; node = node.next) {
				if(e.equals(node.item))
					return index;
				index++;
			}
			return -1;
		}
	}
	
	public Object get(int index) {
		if(index<0 || index >= size)
			throw new IndexOutOfBoundsException(index);
		
		if(index < size >> 1) {
			Node node = first;
			for (int i = 0; i < index; i++) {
				node = node.next;
			}
			return node.item;
		} else {
			Node node = last;
			for (int i = size - 1; i > index; i--) {
				node = node.prev;
			}
			return node.item;
		}
	}
	/*
	public void remove(int index) {
		Node node = node(index);
		
		node.prev.next = node.next;
		node.next.prev = node.prev;
		node.next = null;
		node.prev = null;
	}
	*/
	
	@Override
	public String toString() {
		if(size == 0)
			return "[]";
		
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(Node<E> node = first; node!=null; node=node.next) {
			sb.append(node.item);
			sb.append(", ");
		}
		
		int index = sb.lastIndexOf(", ");
		sb.delete(index, index+2);
		sb.append("]");
		return sb.toString();
	}
}
