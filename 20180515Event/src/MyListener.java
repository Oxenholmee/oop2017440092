import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
//ù ��° �̺�Ʈ ������ ���� ���
public class MyListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		//�׼��̺�Ʈ��ü���� ������ ��ư ��ü(��ư ��ü�� ���۷�����)�� �����´�.
		JButton button = (JButton) e.getSource();
		button.setText("��ư ����.");
		//System.out.println("��ư�� ���Ƚ��ϴ�.");
		

	}

}