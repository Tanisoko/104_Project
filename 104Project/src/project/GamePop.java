package project;

import java.awt.Color;
import java.awt.Container;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GamePop extends JFrame
{
	public GamePop(String title)
	{
		setTitle(title);
		Dimension res = Toolkit.getDefaultToolkit().getScreenSize();
		setLocation((res.width / 2) - 900, (res.height / 2) - 450);
		setSize(1200, 600);
		setResizable(false);
		
		Container c = getContentPane();
		c.setBackground(Color.WHITE);
		c.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		JButton lostark = new JButton("로스트 아크");
		lostark.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String laURL = "https://lostark.game.onstove.com/Main";
					Desktop.getDesktop().browse(new URI(laURL));
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "예기치 않은 오류 발생");
				}
				catch (URISyntaxException e1)
				{
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "예기치 않은 오류 발생");
				}
			}
		});
		
		JButton maplestory = new JButton("메이플스토리");
		maplestory.addActionListener(new ActionListener()
		{
			
			@Override
			public void actionPerformed(ActionEvent e)
			{
				try
				{
					String msURL = "https://maplestory.nexon.com/Home/Main";
					Desktop.getDesktop().browse(new URI(msURL));
				}
				catch (IOException e1)
				{
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "예기치 않은 오류 발생");
				}
				catch (URISyntaxException e1)
				{
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null, "예기치 않은 오류 발생");
				}
			}
		});
		
		c.add(lostark);
		c.add(maplestory);
		
		setVisible(true);
	}
}
