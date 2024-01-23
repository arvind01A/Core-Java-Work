package com.nit.hk.collection;

public class Sa implements Comparable<Sa>{

	private int x;
	private int y;

	public Sa(int x, int y) {
		this.x=x;
		this.y=y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	@Override
	public int hashCode() {
		return x + y;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Sa s) {
			return this.x==s.x  &&
					this.y==s.y;
		}
		return false;
	}
	
	@Override
	public int compareTo(Sa s) {
		return this.x - s.x;
	}
	
	@Override
	public String toString() {
		return "Sa (" + x + ", " + y + ")";
	}

}
