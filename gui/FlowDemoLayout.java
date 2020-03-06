import java.awt.*;

class FlowDemoLayout
{
	FlowDemoLayout()
	{
		Frame f = new Frame("Flow Layout");

			f.setVisible(true);
			f.setSize(400, 400);

		Button one = new Button("One");
		Button two = new Button("Two");
		Button three = new Button("Three");
		Button four = new Button("Four");

		f.add(one);f.add(two);f.add(three);f.add(four);

			f.setLayout(new FlowLayout(FlowLayout.RIGHT, 20, 30)); // aligning the buttons to right with hspace 20 and vspace 30
	}

	public static void main(String[] args) 
	{
		new FlowDemoLayout();	
	}
}