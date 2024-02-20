package day20.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ActionListenerEx1 extends JFrame {

	private JLabel lblNum;
	private JButton btnPlus;

	public ActionListenerEx1() {
		init();
		setDisplay();
		addListener();
		showFrame();
	}

	// 구성
	private void init() {

		btnPlus = new JButton();
		btnPlus.setText("Plus");

	}

	// 배치
	private void setDisplay() {

		add(lblNum, BorderLayout.CENTER);
		add(btnPlus, BorderLayout.SOUTH);

	}

	private void addListener() {

		ActionListener actionHandler = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				// 현재 발생한 이벤트의 정보를 얻어옴 , 누가 이벤트를 발생시켰는지를 알 수 있음
				if (btnPlus.equals(e.getSource())) { //

					String strNum = lblNum.getText();
					int num = Integer.parseInt(strNum);
					num++;

					// JLabel에 들어가는 파라미터값은 String이기 때문에
					// int 형태인 num을 String의 형태로 변환합니다.
					strNum = String.valueOf(num);
					lblNum.setText(strNum);
				}

			}
		};
		
		//

		btnPlus.addActionListener(actionHandler);
	}

	// 프레임 설정
	private void showFrame() {
		setTitle("Counter");
		setSize(300, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	//

	public static void main(String[] args) {
		new ActionListenerEx1();
	}
}