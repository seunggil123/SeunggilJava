import java.util.*;
import javax.swing.*;
import java.awt.Button;
import java.awt.Frame;

public class FrameExam {

	Frame frame = new Frame("������");
	Button button = new Button("������");

	public void createFrame()
	{
		//�����ӿ� ������Ʈ �߰�
		frame.add(button);

		//������ ũ�� ����
		frame.setSize(300, 600);

		//������ ���̱�
		frame.setVisible(true);
	}

	public static void main(String[] args)
	{
		//������ ����
		FrameExam frameExam = new FrameExam();
		frameExam.createFrame();
	}
}