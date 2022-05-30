package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

public class UtilityPop extends JFrame
{
	public UtilityPop(String title)
	{
		setTitle(title);
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((res.width / 2) - 900, (res.height / 2) - 450);
		setSize(1200, 600);
		setResizable(false);
		
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new GridLayout());
		
		Runtime rt = Runtime.getRuntime();
		
		JButton iex = new JButton("인터넷 익스플로러");
		/*	iex.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String exeFile = "‪C:\\Program Files\\Internet Explorer\\iexplore.exe";
				Process p;
				try
				{
					p = rt.exec(exeFile);
					p.waitFor();
				}
				catch (Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});	*/
		JButton chrome = new JButton("구글 크롬");
		
		c.add(iex);
		c.add(chrome);
		
		setVisible(true);
	}
}
