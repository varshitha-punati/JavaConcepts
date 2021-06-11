package com.accessability;

import com.accessmodifiers.ModifiersScenario4;

//import com.accessmodifiers.ModifiersScenario4;

public class ProtectedScenario4 extends ModifiersScenario4{
	public static void main(String[] args) {
		
		ProtectedScenario4 obj=new ProtectedScenario4();
		ModifiersScenario4 obj1=new ModifiersScenario4();
		obj.getAddress();
//		obj1.getAddress();
	}
}
