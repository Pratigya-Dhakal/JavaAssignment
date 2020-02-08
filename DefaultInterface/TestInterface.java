interface TestInterface{
	//abstract method
	public void square(int a);
		//default method
		public void show(){
			System.out.println("Default method Executed");
		}
	}
class TestClass implements TestInterface{
	public void square(int a){
		System.out.println(a*a);
	}

	public static void main(String[] args) {
		TestClass d= new TestClass();
		d.square(4);
		d.show();
	}

}