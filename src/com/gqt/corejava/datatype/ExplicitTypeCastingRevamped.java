package com.gqt.corejava.datatype;

public class ExplicitTypeCastingRevamped {

	public static void main(String[] args) {
			long l = 126l;
			System.out.println("long data:"+l);
			int i = (int)l;
			System.out.println("int data:"+i);
			short s = (short)i;
			System.out.println("short data:"+s);
			byte b = (byte)s;
			System.out.println("long data:"+b);

	}

}
