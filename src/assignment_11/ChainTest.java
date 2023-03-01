package assignment_11;

public class ChainTest extends Chaining{
	ChainTest(){
		System.out.println("No-arg constructor ofChainTest");
	}
ChainTest(String name){
	super(name);
	System.out.println("Calling parameterized Constructor of ChainTest");
}
	public static void main(String[] args) {
		ChainTest chaintest=new ChainTest("test");

	}

}
