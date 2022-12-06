import java.awt.*;
import java.awt.event.*;

public class feedback extends Frame 
{
	private TextField tfCount;
	private Button btnCountUp, btnCountDown, btnReset;
	private int count = 0;
	public feedback()
	{
		setLayout(new FlowLayout());
		add(new Label("Please Give Your Valuable Feedback"));
		tfCount = new TextField("0", 20);
		tfCount.setEditable(false);
		add(tfCount);
		btnCountUp = new Button("+");
		add(btnCountUp);
		btnCountDown = new Button("-");
		add(btnCountDown);
		btnReset = new Button("Submit");
		add(btnReset);
		BtnListener listener = new BtnListener();
		btnCountUp.addActionListener(listener);
		btnCountDown.addActionListener(listener);
		btnReset.addActionListener(listener);
		setTitle("Patient Feedback System");
		setSize(600, 80);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new feedback();
	}
	private class BtnListener implements ActionListener 
	{
		public void actionPerformed(ActionEvent evt) 
		{
			int feedback_value;
			String btnLabel = evt.getActionCommand();
			if (btnLabel.equals("+")) 
			{
				++count;
				if(count==11)
				{
					count=0;
				}
			} 
			else if (btnLabel.equals("-")) 
			{
				--count;
				if(count==-1)
				{
					count=0;
				}
			} 
			else 
			{
				feedback_value=count;
				count = 0;
			}
			tfCount.setText(count + "");
		}
	}
}















