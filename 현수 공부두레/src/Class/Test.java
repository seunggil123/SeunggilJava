package Class;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Machine pc1 = new PC();
		Machine tv1 = new TV();
		Machine au = new AUDIO();
		boolean done = false;

		while (!done) {
			System.out.println("어떤 기기를 다루시겠습니까? ");
			String str1 = input.next();

			if (str1.equals("PC")) {
				System.out.println("어떤 기능을 하시겠습니까? ");
				String str2 = input.next();
				if (str2.equals("p"))
					((PC) pc1).Turn();
				else if (str2.equals("v")) {
					if (((PC) pc1).getPower() == true) {
						System.out.println("불륨을 조절하세요");
						int vol = input.nextInt();
						((PC) pc1).setVol(vol);
						System.out.println(pc1);
					} else
						System.out.println("PC 전원이 꺼져있습니다.");
				}
			} else if (str1.equals("TV")) {
				System.out.println("어떤 기능을 하시겠습니까? ");
				String str3 = input.next();
				if (str3.equals("p"))
					((TV) tv1).Turn();
				else if (str3.equals("v")) {
					if (((TV) tv1).getPower() == true) {
						System.out.println("불륨을 조절하세요");
						int vol2 = input.nextInt();
						((TV) tv1).setVol(vol2);
						System.out.println(tv1);
					} else
						System.out.println("TV 전원이 꺼져있습니다.");
				} else if (str3.equals("ch")) {

					if (((TV) tv1).getPower() == true) {
						System.out.println("채널을 조절하세요: ");
						int ch1 = input.nextInt();
						((TV) tv1).setch(ch1);
						System.out.println(tv1);
					} else
						System.out.println("TV 전원이 꺼져있습니다.");
				}
			}

			else if (str1.equals("AUDIO")) {
				System.out.println("어떤 기능을 하시겠습니까? ");
				String str4 = input.next();
				if (str4.equals("p"))
					((AUDIO) au).Turn();
				else if (str4.equals("v")) {
					if (((AUDIO) au).getPower() == true) {
						System.out.println("불륨을 조절하세요");
						int vol3 = input.nextInt();
						((AUDIO) au).setVol(vol3);
						System.out.println(au);
					} else
						System.out.println("AUDIO 전원이 꺼져있습니다.");
				} else if (str4.equals("ch")) {
					if (((AUDIO) au).getPower() == true) {
						System.out.println("채널을 조절하세요: ");
						double hz = input.nextDouble();
						((AUDIO) au).setHz(hz);
						System.out.println(au);
					} else
						System.out.println("AUDIO 전원이 꺼져있습니다.");
				}
			} else {
				done = true;
				System.out.println("리모콘 종료");
			}
		}

	}
}
