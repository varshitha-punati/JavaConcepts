package com.wrapperclases;

public class Electronics implements Device {
public void dolt() {
	
}
}
abstract class Phone1 extends Electronics{
	
}
abstract class Phone2 extends Electronics{
	public void dolt(int X) {
		
	}
}
class Phone3 extends Electronics implements Device {
public void doStuff() {
	
}
}
interface Device{
	public void dolt();
}
