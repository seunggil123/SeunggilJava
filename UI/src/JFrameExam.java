import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameExam {
	
	JFrame frame = new JFrame("������");
	JButton button = new JButton("������");
	
	public void createFrame() {
		
		//�����ӿ� ������Ʈ �߰�
		frame.add(button);
		
		//������ ũ�� ����
		frame.setSize(300, 600);
		
		//������ ���̱�
		frame.setVisible(true);
		
		//swing���� �ִ� X��ư Ŭ���� ����
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		
		//������ ����
		JFrameExam frameExam = new JFrameExam();
		frameExam.createFrame();

		
	}

}
