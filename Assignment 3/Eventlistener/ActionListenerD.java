import java.awt.* ;
import java.awt.event.*;

class ActionListenerD extends Frame implements ActionListener{
	ActionListenerD(){
		Button b = new Button("Click Me") ;
		b.addActionListener(this) ;
		add(b) ;
		setVisible(true) ;
		setSize(400, 400) ;
	}
	public void actionPerformed(ActionEvent e){
		System.out.println("Button Clicked") ;
	}
	public static void main(String[] args){
		new ActionListenerD() ;
	}
}