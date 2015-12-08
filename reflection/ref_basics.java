package com.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class ref {
	void print() {
		System.out.println("anshu");
	}

	int print(int a, String g) {
		System.out.println("lol " + a + " " + g);
		return 1;
	}
}

public class ref_basics {
	public static void main(String[] args) {

		try {
			Class refl = Class.forName("com.reflection.ref");
			System.out.println(refl.getDeclaredMethods());
			Object obj = refl.newInstance();
			@SuppressWarnings("unchecked")
			Method method = refl.getDeclaredMethod("print", Integer.TYPE,
					String.class);
			System.out.println(method.toString());
			Method method1 = refl.getDeclaredMethod("print", String.class);
			System.out.println(method1.toString());
			int a = (Integer) method.invoke(obj, 123, "anshu");
			System.out.println(a);
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
