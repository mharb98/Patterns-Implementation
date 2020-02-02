
public class Main {

	public static void main(String[] args) {
		Flyable yf=new yesFly();
		Quackable yq=new yesQuack();
		Flyable nf=new NoFly();
		Quackable nq=new noQuack();
		Flyable fwm=new FlyWithMotor();
		LivingDuck LD=new LivingDuck(yf,yq);
		RubberDuck RD=new RubberDuck(nf,nq);
		LD.performFly();
		LD.performQuack();
		RD.performFly();
		RD.performQuack();
		LD.setFlyable(fwm);
		LD.performFly();
	}

}
