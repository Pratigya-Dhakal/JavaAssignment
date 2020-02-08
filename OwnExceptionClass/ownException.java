class ownException extends Exception{
	ownException(String s){
		super(s);
	}
}
class TestCustomException1{
	static void checkPlace(String name)throws ownException{
		if (name!="Pokhara") {
			throw new  ownException("You are not in Pokhara");
			
		}
		else
		{
			System.out.println("Welcome to Pokhara");
		}
	}
		public static void main(String[] args) {
			try{
				checkPlace("Bhairahawa");
			}
			catch(Exception e){
				System.out.println("Exception occured:"+e);
			}
			System.out.println("End");
		}
	}
