class anonomousType{
	void additionArray(int[] a)
	{
		int total=0;
		for(int i:a){
			total+=i;
		}
		System.out.println(total);
	}
	public static void main(String[] args) 
	{
			anonomousType a1= new anonomousType();
			a1.additionArray(new int[] {1,2,3,4,5});
	}
}