package com.anshu;

public class Triangle1 {
	
	Point pointa;
	Point pointb;
	Point pointc;
	public Point getPointa() {
		return pointa;
	}
	public void setPointa(Point pointa) {
		this.pointa = pointa;
	}
	public Point getPointb() {
		return pointb;
	}
	public void setPointb(Point pointb) {
		this.pointb = pointb;
	}
	public Point getPointc() {
		return pointc;
	}
	public void setPointc(Point pointc) {
		this.pointc = pointc;
	}
	public void draw() {
		System.out.println("x"+ pointa.getX() +"" +pointa.getY());
		System.out.println("y"+getPointb().getX() +"" +getPointb().getY());
		System.out.println("z"+getPointc().getX() +"" +getPointc().getY());
		// TODO Auto-generated method stub
		
	}

}
