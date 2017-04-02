package form;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import form.Sberegatel;
import form.Nakopitel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MainForm {
	
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
	}
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Выбор типа депозита");
		frame.setBounds(100, 100, 386, 274);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("Выберите тип депозита:");
		label.setBounds(131, 11, 191, 34);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("Накопительный депозит");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Sberegatel().setVisible(true);
				
			}
		});
		btnNewButton.setBounds(102, 56, 191, 51);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Сберегательный депозит");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Nakopitel().setVisible(true);
			}
		});
		btnNewButton_1.setBounds(102, 133, 191, 51);
		frame.getContentPane().add(btnNewButton_1);
		
		
	}
}

