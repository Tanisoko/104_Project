package project;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class msgPop extends JFrame
{
	public msgPop(String title)
	{
		setTitle(title);
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((res.width / 2) - 900, (res.height / 2) - 450);
		setSize(1200, 600);
		setResizable(false);
		setVisible(true);
	}
}
