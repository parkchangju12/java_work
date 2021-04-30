package Otherpackage;

public class Nothing {
	private void _private() {
		System.out.println("private");
	}
	
	void _default() {
		System.out.println("default");
	}
	protected void _protected() {
		System.out.println("pretected");
	}
	public void _public() {
		System.out.println("public");
	}
}

class OtherPackageCheckr extends Other {
	public OtherPackageCheckr() {
		Nothing nothing = new Nothing();
		nothing._public();
//		nothing._protected();
//		nothing._default();
//		nothing._private();
	}
}
