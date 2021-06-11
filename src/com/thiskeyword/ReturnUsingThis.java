package com.thiskeyword;

public class ReturnUsingThis {
	ReturnUsingThis  get() {
		return this;
	}

	void msg() {
		System.out.println("Hello java");
	}
}

class Test{
	public static void main(String args[]) {
		ReturnUsingThis r=new ReturnUsingThis();
		r.get();
		r.msg();
	}

}
