package mainsrc;

import javax.swing.JFrame;
import java.util.ArrayList;

public class MainFunction extends JFrame{

	public static final int WIDTH = 500;
	public static final int HEIGHT = 500;
	public ArrayList<Creature> crList = new ArrayList<Creature>();
	
	public MainFunction(){		
		add(new Field());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setLocationRelativeTo(null);
		setTitle("lol");
		setResizable(false);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		MainFunction mf = new MainFunction();
		return;
	}
}
