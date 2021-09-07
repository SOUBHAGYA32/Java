class Phone {
	public void call()
	{
		System.out.println("Phone Call Method.");
	}
	public void sms(){
		System.out.println("Phone Sms Method.");
	}
}
interface ICamera {
	void click();
	void record();
}
interface IMusicplayer {
	void play();
	void stop();
}
class Smartphone extends Phone implements ICamera,IMusicplayer {
	public void click(){
		System.out.println("You can Click a photo.");
	}
	public void record(){
		System.out.println("You can record Video.");
	}
	public void play(){
		System.out.println("You can play music.");
	}
	public void stop(){
		System.out.println("You can stop music.");
	}
}
public class InterfaceTest1 {
	public static void main(String args[]){
		Smartphone s1 = new Smartphone();
		Phone p = s1;
		p.call();
		p.sms();
		ICamera c = s1;
		c.click();
		c.record();
		IMusicplayer m= s1;
		m.play();
		m.stop();
	}
}