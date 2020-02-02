public class Main {
	public static void main(String[] args) {
		Turkey realTurkey=new RealTurkey();
		Turkey plasticTurkey=new PlasticTurkey();
		AdapterTurkey adapter1=new AdapterTurkey(realTurkey);
		AdapterTurkey adapter2=new AdapterTurkey(plasticTurkey);
		adapter1.Quack();
		adapter1.Swim();
		System.out.println("=============");
		adapter2.Quack();
		adapter2.Swim();
	}

}
