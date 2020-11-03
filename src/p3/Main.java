package p3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class Frm extends JFrame implements ActionListener {
	private JPanel p, p1, p2, p3, p4;
	private JLabel l1, l2, l3;
	private JTextField tf1, tf2;
	private JButton b1, b2, b3;
	
	public Frm() {
		this.setTitle("Dönüþtürücü");
		this.setSize(300, 200);
		
		p = new JPanel();
		this.add(p);
		
		// Panel 1
		p1 = new JPanel();
		p.add(p1);
		
		l1 = new JLabel("Inch: ");
		p1.add(l1);
		
		tf1 = new JTextField(10);
		p1.add(tf1);
		
		// Panel 2
		p2 = new JPanel();
		p.add(p2);
		
		l2 = new JLabel("Cm:    ");
		p2.add(l2);
		
		tf2 = new JTextField(10);
		p2.add(tf2);
		
		// Panel 3
		p3 = new JPanel();
		p.add(p3);
		
		b1 = new JButton("TEMÝZLE");
		b2 = new JButton("HESAPLA");
		b3 = new JButton("KAPAT");
		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		
		// Panel
		p4 = new JPanel();
		p.add(p4);
		l3 = new JLabel("");
		p4.add(l3);
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			tf1.setText("");
			tf2.setText("");
			l3.setText("");
		} else if(e.getSource() == b2) {
			if(tf1.getText().equals(""))
				l3.setText("Birinci pencereye deðer girilmelidir!");
			else {
				double s1 = Double.parseDouble(tf1.getText());
				double s2 = s1 * 2.54;
				tf2.setText(Double.toString(s2));
				System.out.println("Okunan: " + s1);
				System.out.println("Hesaplanan: " + s2);
			}
		} else if(e.getSource() == b3) {
			System.exit(0);
		}
	}
}

public class Main {

	public static void main(String[] args) {
		Frm f1 = new Frm();
		f1.setVisible(true);

	}

}
