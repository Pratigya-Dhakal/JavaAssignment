interface Showable{
	void show();
	interface Message{
		void msg();
	}
}
class TestNestedinterface1 implements Showable.Message{
	public void msg(){
		System.out.println("HEllo nested interface");
	}
	public static void main(String[] args) {
		Showable.Message message=new TestNestedinterface1();
		message.msg();
	}
}