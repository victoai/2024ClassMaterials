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
 
 public class ActionListenerExBasic2 extends JFrame     {
 
  
    private JButton btn ;
 
    
    public ActionListenerExBasic2() {
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
      
    	//ActionListener 인터페이스를 익명클래스로 작성 
    	
        btn.addActionListener( new ActionListener(){

			 
			@Override
			public void actionPerformed(ActionEvent e) {
			 
		               
				 //현재 발생한 이벤트의 정보를 얻어옴 , 누가 이벤트를 발생시켰는지를 알 수 있음 		
		               if(btn.equals(e.getSource())){    //  
		                   
		            	   JOptionPane aa=new JOptionPane();
		           		   aa.showMessageDialog(null, "자바 GUI에 오신것을 환영합니다.");
		               }
		             
			}
        	
        });
            
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
   

	
	 
	
	 public static void main(String[] args)  {
	        new ActionListenerExBasic2();
	   }
}