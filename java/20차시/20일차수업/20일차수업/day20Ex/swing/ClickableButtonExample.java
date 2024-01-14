package day20Ex.swing;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickableButtonExample {
    public static void main(String[] args) {
        // Swing UI를 생성하는 이벤트 디스패치 스레드 시작
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

    private static void createAndShowGUI() {
        // 프레임 생성
        JFrame frame = new JFrame("Clickable Button Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // 버튼 생성
        JButton button = new JButton("Click Me!");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // 버튼이 클릭되었을 때 실행되는 코드
                JOptionPane.showMessageDialog(null, "Button Clicked!");
            }
        });
        
        // 버튼을 프레임에 추가
        frame.getContentPane().add(button, BorderLayout.CENTER);
        
        // 프레임 크기 조정 및 보이기 설정
        frame.pack();
        frame.setVisible(true);
    }
}
