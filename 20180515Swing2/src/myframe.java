import java.awt.FlowLayout;
import javax.swing.JFrame;
import javax.swing.*;
//������ ����� �� ��° ���: JFrame���κ��� ��ӹ��� Ŭ������ �����.
public class myframe extends JFrame {
	myframe() {
		this.setSize(900,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("choice 2nd frame");
		//���ο� ������Ʈ�� �����ӿ� �߰�
		this.setLayout(new FlowLayout());//�÷ο� ��ġ �޴��� ���
		JLabel label = new JLabel("�� �ڸ� ������ �Է��ϼ���.");//���̺� ��ü ����
		JTextField tf = new JTextField(30);//�ؽ�Ʈ�ʵ� ��ü ����
		JButton button = new JButton("choice button");
		
		button.setText("�̱⼱");
		tf.setText("�ǰ�");
		
		//�г� ����
		JPanel panel = new JPanel();
		panel.add(label);
		panel.add(tf);
		
		
		this.add(button);//��ư ��ü�� �����ӿ� �߰�
		this.add(panel);
		//this.add(label);//���̺� ��ü�� �����ӿ� �߰�
		//this.add(tf);//�ؽ�Ʈ�ʵ� ��ü�� �����ӿ� �߰�
		
		//pack()//������Ʈ���� �� ä���� ������ũ�⸦ ����
		
		
		
		this.setVisible(true);
		
		
	}

}
