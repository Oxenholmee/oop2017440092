import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener {
	//�ʵ�: ��� �޼ҵ忡�� ������ �� �ִ�
	JButton button;
	JTextField tf;
	JButton btn;
	MyFrame() {
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("choice 2nd frame");
		//���ο� ������Ʈ�� �����ӿ� �߰�
		this.setLayout(new FlowLayout());//�÷ο� ��ġ �޴��� ���

		button = new JButton("choice button");
		
		this.add(button);//��ư ��ü�� �����ӿ� �߰�
		
		MyListener listener = new MyListener();
		
		this.button.setActionCommand("button 1");
		
		button.addActionListener(this);//�̺�Ʈ ������ ��ü ���
		
		this.btn = new JButton("�� ��° ��ư");
		
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
			this.tf.setText("ù ��° ��ư");
		else
			this.tf.setText("�� ��° ��ư");

	}
}


