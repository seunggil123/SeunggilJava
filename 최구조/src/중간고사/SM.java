package 중간고사;

public class SM {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = new int[][] { { 7, 4, 4 }, { 0, 3, 9 }, { 1, 1, 1 }, { 3, 2, 7 }, { 5, 0, 3 } };

		printSM(a);

		System.out.println();

		System.out.println("희소행렬 전치행렬화");
		printSM(transposeSM(a));

	}

	private static void printSM(int[][] a) {
		for (int i = 0; i < a[0][2] + 1; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("%d ", a[i][j]);
			}
			System.out.println();
		}
	}

	private static int[][] transposeSM(int[][] a) {
		int[][] b = new int[a[0][2] + 1][3]; //[v+1][3] //v-> 데이터개수 -> 행의 수

		int nM = a[0][0];
		int nN = a[0][1];
		int nV = a[0][2];

		b[0][0] = nN;
		b[0][1] = nM;
		b[0][2] = nV;

		if (nV > 0) {
			int nP = 1;

			for (int i = 0; i < nN; i++) {
				for (int j = 1; j <= nV; j++) {
					if (a[j][1] == i) {
						b[nP][0] = a[j][1];
						b[nP][1] = a[j][0];
						b[nP][2] = a[j][2];
						nP++;
					}
				}
			}
		}

		return b;
	}
}
