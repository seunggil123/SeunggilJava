import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutExam {
	JFrame jFrame = new JFrame("Cilent");
	JButton[] btn = new JButton[4]; // 4개 생성

	public GridLayoutExam() {
		// GridLayout 적용
		jFrame.setLayout(new GridLayout(4, 1));

		// 컨테이너 가져오기
		Container container = jFrame.getContentPane();

		// 컴포넌트 생성 및 추가하기

		btn[0] = new JButton("Load"); //읽기
		btn[1] = new JButton("Analysis"); //분석
		btn[2] = new JButton("Submit"); // 전송
		btn[3] = new JButton("Exit"); // 종료
		for (int i = 0; i < btn.length; i++)
			container.add(btn[i]);

		// 프레임 크기 지정하기
		jFrame.setSize(300, 400);

		// 프레임 보이기
		jFrame.setVisible(true);

		// 종료버튼에 대한 설정
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new GridLayoutExam();
	}

}