import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExam {
	JFrame jFrame = new JFrame("Cilent");
	JButton[] btn = new JButton[4]; // 4�� ����

	public GridLayoutExam() {
		// GridLayout ����
		jFrame.setLayout(new GridLayout(4, 1));

		// �����̳� ��������
		Container container = jFrame.getContentPane();

		// ������Ʈ ���� �� �߰��ϱ�

		btn[0] = new JButton("Load"); //�б�
		btn[1] = new JButton("Analysis"); //�м�
		btn[2] = new JButton("Submit"); // ����
		btn[3] = new JButton("Exit"); // ����
		for (int i = 0; i < btn.length; i++)
			container.add(btn[i]);

		// ������ ũ�� �����ϱ�
		jFrame.setSize(300, 400);

		// ������ ���̱�
		jFrame.setVisible(true);

		// �����ư�� ���� ����
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new GridLayoutExam();
	}

}