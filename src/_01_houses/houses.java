package _01_houses;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class houses {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		Robot robo = new Robot("mini");
		robo.setX(50);
		robo.setY(550);
		robo.setPenColor(255,0,0);
		robo.penDown();
		robo.setSpeed(10);
		robo.turn(90);
		String tallness;
		int count03;
		for (int i = 0; i < 10; i++) {
			count03 = rand.nextInt(3);
			if (count03== 0) {
				tallness = "small";
			}
			else if (count03 == 1) {
				tallness = "medium";
			}
			else {
				tallness = "large";
			}
			drawHouse(robo, tallness);
			robo.setPenColor(255,0,0);
		}
		
		
	}
	
	
	static void drawHouse(Robot rob, String tall) {
		int hieght = 0;
		if (tall.equals("small")) {
			hieght= 60;
		}
		else if (tall.equals("medium")){
			hieght = 120;
		}
		else {
			hieght=250;
		}
		
		rob.turn(-90);
		rob.move(hieght);
		rob.turn(90);
		rob.move(20);
		rob.turn(90);
		rob.move(hieght);
		rob.turn(-90);
		rob.setPenColor(0,200,0);
		rob.move(20);
		
		
	}

}
