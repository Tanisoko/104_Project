package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Stack;

import javax.swing.JButton;
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
		
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton kakaotalk = new JButton("카카오톡");
		kakaotalk.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				Process p = null;
				String[] kakaoTEx = new String[]
						{
							"C:\\Program Files (x86)\\Kakao\\KakaoTalk\\KakaoTalk.exe"	
						};
				try
				{
					p = new ProcessBuilder(kakaoTEx).start();
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
				}
			}
		});
		
		
		c.add(kakaotalk);
		
		setVisible(true);
	}
}
