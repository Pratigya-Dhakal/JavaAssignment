class demoException{
	boolean div(){
		int a=10;
		try{
			System.out.println(a/0);
		}
		catch(ArithmeticException b){
			System.out.println(b);
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			System.out.println("this block provide one time code run");
		}
		return false;
	}
	public static void main(String[] args) {
		demoException obj=new demoException();
		System.out.println(obj.div());
	}
}