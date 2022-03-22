package lambda_Expressions;
import javax.swing.*;
import javax.swing.JTextField;

public class Lambda_Event_Listener {

	public static void main(String[] args) {

		JTextField tf=new JTextField();
		tf.setBounds(50,50,150,20);
		JButton b=new JButton("Click");
		b.setBounds(80,100,70,30);
		
		//Lambda Expression
		b.addActionListener(e->{tf.setText("Hello swing");});
		JFrame f=new JFrame();
		f.add(tf);
		f.add(b);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLayout(null);
		f.setSize(300,200);
		f.setVisible(true);
		
		
		
	}

}
