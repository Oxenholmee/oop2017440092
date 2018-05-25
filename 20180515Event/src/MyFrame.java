import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	//필드: 모든 메소드에서 접근할 수 있다
	JButton button;
	JTextField tf;
	JButton btn;
	MyFrame() {
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("choice 2nd frame");
		//새로운 컴포넌트를 프레임에 추가
		this.setLayout(new FlowLayout());//플로우 배치 메니저 사용

		button = new JButton("choice button");
		
		this.add(button);//버튼 객체를 프레임에 추가
		
		MyListener listener = new MyListener();
		
		this.button.setActionCommand("button 1");
		
		button.addActionListener(this);//이벤트 리스너 객체 등록
		
		this.btn = new JButton("두 번째 버튼");
		
		this.add(btn);
		
		this.btn.setActionCommand("button 2");
		
		btn.addActionListener(this);
		
		tf= new JTextField(20);
		
		this.add(tf);
		
		this.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if((e.getActionCommand()).equals("button 1"))
			this.tf.setText("첫 번째 버튼");
		else
			this.tf.setText("두 번째 버튼");

	}
}


