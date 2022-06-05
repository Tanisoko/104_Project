package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		Runtime rt = Runtime.getRuntime();
		
		JButton iex = new JButton("인터넷 익스플로러");
			iex.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Process p = null;
				String[] iexEx = new String[]
						{
								"C:\\Program Files\\Internet Explorer\\iexplore.exe"
						};
				try
				{
					p = new ProcessBuilder(iexEx).start();
				}
				catch (Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		JButton chrome = new JButton("구글 크롬");
		chrome.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Process p = null;
				String[] chromeEx = new String[]
						{
								"C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe"
						};
				try
				{
					p = new ProcessBuilder(chromeEx).start();
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		JButton firefox = new JButton("파이어 폭스");
		firefox.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Process p = null;
				String[] firefoxEx = new String[]
						{
								"C:\\Program Files\\Mozilla FireFox\\firefox.exe"
						};
				try
				{
					p = new ProcessBuilder(firefoxEx).start();
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		
		c.add(iex);
		c.add(chrome);
		c.add(firefox);
		
		setVisible(true);
	}
}
