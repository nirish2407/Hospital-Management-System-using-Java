import java.applet.*;
import java.awt.*;

public class app extends Applet
{
	Font f1=new Font("Courier New",Font.BOLD,40);
	public void paint(Graphics g)
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				g.drawOval(60,i*60+10,50,50);
			}
			else
			{
				g.fillOval(60,i*60+10,50,50);
			}
		}
		for(int i=2;i<=20;i++)
		{
			if(i%2!=0)
			{
				g.drawOval(i*60+10,10,50,50);
			}
			else
			{
				g.fillOval(i*60+10,10,50,50);
			}
		}
		for(int i=2;i<=20;i++)
		{
			if(i%2!=0)
			{
				g.drawOval(i*60+10,610,50,50);
			}
			else
			{
				g.fillOval(i*60+10,610,50,50);
			}
		}
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				g.drawOval(1210,i*60+10,50,50);
			}
			else
			{
				g.fillOval(1210,i*60+10,50,50);
			}
		}
		g.setColor(Color.red);
		g.fillRect(640,110,50,500);
		g.fillRect(415,335,500,50);
		g.setFont(f1);
		g.setColor(Color.blue);
		g.drawString("Jupiter Hospital",490,100);
	}
}

/*
<APPLET
CODE=app.class
WIDTH=1500
HEIGHT=900>
</APPLET>
*/
