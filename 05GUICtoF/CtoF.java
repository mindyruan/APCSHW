import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtoF extends JFrame implements ActionListener{

    private Container pane;
    private Container in;
    private Container out;
    private JTextField inTemp;
    private JButton b;
    private JLabel l;

    public CtoF(){
	this.setTitle("Celsius to Fahrenheit Converter");
	this.setSize(600,100);
	this.setLocation(100,100);
	this.setDefaultCloseOperation(EXIT_ON_CLOSE);

	pane = this.getContentPane();
	pane.setLayout(new GridLayout(2,1));
	in = new Container();
	in.setLayout(new FlowLayout());
	out = new Container();
	out.setLayout(new FlowLayout());

	pane.add(in);
	pane.add(out);

	inTemp = new JTextField(20);
	b = new JButton("Give me Fahrenheit!");
	b.setActionCommand("ctof");
	b.addActionListener(this);
	in.add(inTemp);
	in.add(b);

	l = new JLabel();
	out.add(l);

    }

    public void actionPerformed(ActionEvent e){
	String action = e.getActionCommand();
	if (action.equals("ctof")){
	    l.setText(""+ctof(Double.parseDouble(inTemp.getText())));
	}
    }

    private double ctof(double c){
	return (c * (9.0/5.0)) + 32;
    }

    public static void main(String[] args){
	CtoF c = new CtoF();
	c.setVisible(true);
    }

}
