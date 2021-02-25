package sem1_cts;

import clase.Girafa;
import clase.Zebra;
import clase.Zoo;
import clase.Zookeeper;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.out.println("hello");
    Zoo zoo=new Zoo();
    Zookeeper keeper=new Zookeeper();
    
    zoo.setKeeper1(keeper);
    
    Zebra zebra1=new Zebra("zebra1");
    Zebra zebra2=new Zebra("zebra2");
    zoo.add(zebra1);
    zoo.add(zebra2);
    zoo.feedAll();
    Girafa girafa1=new Girafa("girafa1");
    Girafa girafa2=new Girafa("girafa2");
    zoo.add(girafa1);
    zoo.add(girafa2);
    zoo.feedAll();
	}

}
