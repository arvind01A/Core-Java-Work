package com.nit.hk.collection;

public class Ex {

	private int x;
	private int y;

	public Ex(int x, int y) {
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
	public boolean equals(Object obj) {
		if(obj instanceof Ex) {
			Ex e=(Ex)obj;
			return this.x==e.x  &&
					this.y==e.y;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return "Ex (" + x + ", " + y + ")";
	}

}
