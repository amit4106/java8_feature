package com.ioc;

public class Hello {
		
private A aObj;
private B bObj;

public void setaObj(A aObj) {
	this.aObj = aObj;
}

public void setbObj(B bObj) {
	this.bObj = bObj;
}
public void show() {
	aObj.showA();
	bObj.showB();
}
}
