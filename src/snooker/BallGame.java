package snooker;

import java.awt.*;
import javax.swing.*;

public class BallGame extends JFrame {
	
	Image ball = Toolkit.getDefaultToolkit().getImage("images/ball.png");
	Image desk = Toolkit.getDefaultToolkit().getImage("images/desk.png");
	
	//С�����꣬����
	double  x=100;
	double y=100;
//	boolean right = true;
	double degree = 3.14/3;//����
	
	//�����ڵķ���
	public void paint(Graphics g) {
		System.out.println("���ڱ�����һ��");
		g.drawImage(desk,0,0,null);
		g.drawImage(ball,(int)x,(int)y,null);
		
		x=x+10*Math.cos(degree);
		y=y+10*Math.sin(degree);
		
		if (y>260||y<40) {
			degree=-degree;
		}
		if (x<30||x>856-320) {
			degree=3.14-degree;
		}
//		if(right) {
//			x=x+10;
//		}else {
//			x=x-10;
//		}
//		
//		if(x>856-320) {
//			right=false;
//		}
//		if(x<40) {
//			right=true;
//		}
}
	
	//���ڼ���
	void launchFrame() {
		setSize(856,500);
		setLocation(50,50);
		setVisible(true);
		
		//�ػ�����
		while(true) {
			repaint();
			try {
				Thread.sleep(40);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	//main�����ǳ���ִ�е����
	public static void main(String[] args){
		System.out.println("hi");
		BallGame game = new BallGame();
		game.launchFrame();
	}
}
