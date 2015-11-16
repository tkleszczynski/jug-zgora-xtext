package pl.zgora.jug.xtext.demo;

public class DD {
	public static void main(String[] args) {
		ObjectFoo o = new StringFoo();
		o.method("String");
	}
}

class ObjectFoo {
	void method(Object o) {
		System.out.println("Foo - object");
	}
}

class StringFoo extends ObjectFoo {
	void method(String o) {
		System.out.println("SomeFoo - string");
	}

	// @Override
	// void method(Object o) {
	// if (o instanceof String) {
	// method((String) o);
	// } else {
	// super.method(o);
	// }
	// }
}