package com.garbage.collection;

public class DemoGC {
	@Override
	public void finalize() {
		System.out.println("d1 is deleted");
	}

	public static void main(String[] args) {
		DemoGC d1 = new DemoGC();
		d1 = null;

		System.gc();

	}

}
