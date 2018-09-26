package beerchart.gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JSplitPane;
import javax.swing.JDesktopPane;
import javax.swing.BoxLayout;
import javax.swing.border.TitledBorder;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.border.EtchedBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.JInternalFrame;
import java.awt.FlowLayout;
import java.awt.Dimension;
import java.awt.Canvas;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;

public class BeerChart
{

	private JFrame frmBeerchart;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					BeerChart window = new BeerChart();
					window.frmBeerchart.setVisible(true);
				}
				catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BeerChart()
	{
		initComponents();
		createEvents();
	}

	private void initComponents()
	{
		frmBeerchart = new JFrame();
		frmBeerchart.setIconImage(Toolkit.getDefaultToolkit().getImage(BeerChart.class.getResource("/beerchart/resources/beerIcon.png")));
		frmBeerchart.setTitle("BeerChart");
		frmBeerchart.setBounds(100, 100, 800, 648);
		frmBeerchart.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblUser = new JLabel("User:");
		
		JComboBox comboBoxUser = new JComboBox();
		comboBoxUser.setModel(new DefaultComboBoxModel(new String[] {"Choose user:", "Charlotte", "Poul Erik", "Rene", "Add new user"}));
		comboBoxUser.setEditable(true);
		
		JPanel panelChoices = new JPanel();
		panelChoices.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Beers", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelWine = new JPanel();
		panelWine.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Wine & Spirits", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelExtras = new JPanel();
		panelExtras.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null), "Non-Alcoholic & Extras", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelPic = new JPanel();
		panelPic.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Item", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		
		JScrollPane scrollPaneTotal = new JScrollPane();
		scrollPaneTotal.setBorder(null);
		scrollPaneTotal.setViewportBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Totals for user:", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JPanel panelAccounting = new JPanel();
		panelAccounting.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null), "Accounting", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		GroupLayout groupLayout = new GroupLayout(frmBeerchart.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING, false)
							.addComponent(panelExtras, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addGroup(groupLayout.createSequentialGroup()
								.addComponent(lblUser)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(comboBoxUser, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
							.addComponent(panelChoices, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addComponent(panelWine, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelAccounting, GroupLayout.PREFERRED_SIZE, 296, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(panelPic, GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(scrollPaneTotal, GroupLayout.DEFAULT_SIZE, 456, Short.MAX_VALUE)
							.addGap(2)))
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(7)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(comboBoxUser, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUser))
							.addGap(4)
							.addComponent(panelChoices, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(panelWine, GroupLayout.PREFERRED_SIZE, 130, GroupLayout.PREFERRED_SIZE))
						.addComponent(panelPic, 0, 0, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(panelExtras, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE)
							.addGap(13)
							.addComponent(panelAccounting, GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
						.addComponent(scrollPaneTotal, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE))
					.addGap(13))
		);
		
		JLabel lblPicture = new JLabel("");
		lblPicture.setFont(new Font("Segoe UI", Font.PLAIN, 8));
		lblPicture.setHorizontalTextPosition(SwingConstants.CENTER);
		lblPicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicture.setIcon(new ImageIcon(BeerChart.class.getResource("/beerchart/resources/Beer_256.png")));
		GroupLayout gl_panelPic = new GroupLayout(panelPic);
		gl_panelPic.setHorizontalGroup(
			gl_panelPic.createParallelGroup(Alignment.LEADING)
				.addComponent(lblPicture, GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
		);
		gl_panelPic.setVerticalGroup(
			gl_panelPic.createParallelGroup(Alignment.LEADING)
				.addComponent(lblPicture, GroupLayout.DEFAULT_SIZE, 267, Short.MAX_VALUE)
		);
		panelPic.setLayout(gl_panelPic);
		
		JComboBox comboBoxExtras = new JComboBox();
		comboBoxExtras.setModel(new DefaultComboBoxModel(new String[] {"Choose an item:"}));
		comboBoxExtras.setEditable(true);
		
		JButton btnExtrasAdd1 = new JButton("+1");
		btnExtrasAdd1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnExtrasAdd2 = new JButton("+2");
		btnExtrasAdd2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnExtrasSub2 = new JButton("-2");
		btnExtrasSub2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnExtrasSub1 = new JButton("-1");
		btnExtrasSub1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GroupLayout gl_panelExtras = new GroupLayout(panelExtras);
		gl_panelExtras.setHorizontalGroup(
			gl_panelExtras.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelExtras.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBoxExtras, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelExtras.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelExtras.createSequentialGroup()
							.addComponent(btnExtrasAdd1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnExtrasAdd2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelExtras.createSequentialGroup()
							.addComponent(btnExtrasSub1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnExtrasSub2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		gl_panelExtras.setVerticalGroup(
			gl_panelExtras.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelExtras.createSequentialGroup()
					.addGroup(gl_panelExtras.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxExtras, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelExtras.createSequentialGroup()
							.addGroup(gl_panelExtras.createParallelGroup(Alignment.LEADING)
								.addComponent(btnExtrasAdd1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnExtrasAdd2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_panelExtras.createParallelGroup(Alignment.LEADING)
								.addComponent(btnExtrasSub1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnExtrasSub2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(13, Short.MAX_VALUE))
		);
		panelExtras.setLayout(gl_panelExtras);
		
		JComboBox comboBoxChooseBeer = new JComboBox();
		comboBoxChooseBeer.setModel(new DefaultComboBoxModel(new String[] {"Choose a beer:"}));
		comboBoxChooseBeer.setEditable(true);
		
		JButton btnBeerAdd1 = new JButton("+1");
		btnBeerAdd1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnBeerAdd2 = new JButton("+2");
		btnBeerAdd2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnBeerSub1 = new JButton("-1");
		btnBeerSub1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnBeerSub2 = new JButton("-2");
		btnBeerSub2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GroupLayout gl_panelChoices = new GroupLayout(panelChoices);
		gl_panelChoices.setHorizontalGroup(
			gl_panelChoices.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelChoices.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBoxChooseBeer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelChoices.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelChoices.createSequentialGroup()
							.addComponent(btnBeerSub1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBeerSub2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelChoices.createSequentialGroup()
							.addComponent(btnBeerAdd1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnBeerAdd2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_panelChoices.setVerticalGroup(
			gl_panelChoices.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelChoices.createSequentialGroup()
					.addGroup(gl_panelChoices.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxChooseBeer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelChoices.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnBeerAdd1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
							.addComponent(btnBeerAdd2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panelChoices.createParallelGroup(Alignment.LEADING)
						.addComponent(btnBeerSub1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnBeerSub2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelChoices.setLayout(gl_panelChoices);
		
		JComboBox comboBoxWine = new JComboBox();
		comboBoxWine.setEditable(true);
		comboBoxWine.setModel(new DefaultComboBoxModel(new String[] {"Choose an item:"}));
		
		JButton btnWineAdd1 = new JButton("+1");
		btnWineAdd1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnWineAdd2 = new JButton("+2");
		btnWineAdd2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnWineSub2 = new JButton("-2");
		btnWineSub2.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		
		JButton btnWineSub1 = new JButton("-1");
		btnWineSub1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
		GroupLayout gl_panelWine = new GroupLayout(panelWine);
		gl_panelWine.setHorizontalGroup(
			gl_panelWine.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelWine.createSequentialGroup()
					.addContainerGap()
					.addComponent(comboBoxWine, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_panelWine.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panelWine.createSequentialGroup()
							.addComponent(btnWineAdd1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnWineAdd2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_panelWine.createSequentialGroup()
							.addComponent(btnWineSub1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
							.addGap(7)
							.addComponent(btnWineSub2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(80, Short.MAX_VALUE))
		);
		gl_panelWine.setVerticalGroup(
			gl_panelWine.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panelWine.createSequentialGroup()
					.addGroup(gl_panelWine.createParallelGroup(Alignment.LEADING)
						.addComponent(comboBoxWine, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_panelWine.createSequentialGroup()
							.addGroup(gl_panelWine.createParallelGroup(Alignment.LEADING)
								.addComponent(btnWineAdd1, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnWineAdd2, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE))
							.addGap(7)
							.addGroup(gl_panelWine.createParallelGroup(Alignment.LEADING)
								.addComponent(btnWineSub1, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnWineSub2, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		panelWine.setLayout(gl_panelWine);
		frmBeerchart.getContentPane().setLayout(groupLayout);
	}
	
	private void createEvents()
	{
		// TODO Auto-generated method stub	
	}
}