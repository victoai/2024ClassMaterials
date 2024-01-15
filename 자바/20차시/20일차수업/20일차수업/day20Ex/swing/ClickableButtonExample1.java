package day20Ex.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickableButtonExample1 extends JFrame {
    private JButton button;

    public ClickableButtonExample1() {
        // 프레임 제목 설정
        super("Clickable Button Example");

        // 프레임 닫기 동작 설정
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // 버튼 생성
        button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 버튼이 클릭되었을 때 실행되는 코드
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });

        // 버튼을 프레임에 추가
        getContentPane().add(button, BorderLayout.CENTER);

        // 프레임 크기 조정 및 보이기 설정
        pack();
        setVisible(true);
    }

    public static void main(String[] args) {
        // Swing UI를 생성하는 이벤트 디스패치 스레드 시작
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ClickableButtonExample();
            }
        });
    }
}
