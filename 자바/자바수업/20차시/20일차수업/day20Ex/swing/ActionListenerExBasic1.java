package day20Ex.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

 
/*
 * ActionEvent  : 버튼을 클릭하거나 , 텍스트 필드 등에서 Enter를 눌렀을 때  발생하는 이벤트
 * ActionListener : ActionEvent를 감지하는 역할  , 리스너가 있어야 ActionEvent를 감지할 수 있다.
 * 리스너등록시 : 수행할코드를 작성해서 인자값으로 전달해야 함 
 *############ ActionListener인터페이스 구현해야 함 ########################
 * 인터페이스로 작성되어 있고 인터페이스를 구현한 구현체를 넘겨줘야 함 
 * 클릭했을 시  actionPerformed() 매서드를 호출해줌 이 때 생성된 이벤트 정보를 전달해줌
 * 이벤트와 이벤트 발생시 수행할 매서드는 약속으로 만들어 져 있다.
 * 실제 버튼 클릭되었을 때 해야할 일은 개발자가 책임져야 한다. !!
 */

 public class ActionListenerExBasic1 extends JFrame   implements ActionListener  {
 
  
    private JButton btn ;
 
    
    public ActionListenerExBasic1() {
        init();
        setDisplay();
        addListener();
        showFrame();
    }
    
    // 구성
    private void init() {    
        
        btn  = new JButton();
        btn.setText("클릭");    
        
    }
    // 배치
    private void setDisplay() {        
        JPanel pnlSouth = new JPanel( );
        pnlSouth.add(btn);              
        add(pnlSouth );
 
    }
   
    private void addListener() {       
      
        btn.addActionListener(this);
            
    }
        
    // 프레임 설정
    private void showFrame() {
        setTitle("Counter");
        setSize(300,400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    // 
   

	@Override
	public void actionPerformed(ActionEvent e) {
	 
               
	  	  // 클릭되었을 때 하고 싶은 코드를 작성해야 함
	  	  //현재 발생한 이벤트의 정보를 얻어옴 , 누가 이벤트를 발생시켰는지를 알 수 있음 		
               if(btn.equals(e.getSource())){    //  이벤트를 발생시킨것이 버튼이라면                   
            	   JOptionPane aa=new JOptionPane();
           		   aa.showMessageDialog(null, "자바 GUI에 오신것을 환영합니다.");
               }
             
	}
	 
	
	 public static void main(String[] args)  {
	        new ActionListenerExBasic1();
	   }
}