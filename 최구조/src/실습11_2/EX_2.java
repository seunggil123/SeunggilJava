package 실습11_2;
import java.io.*;
public class EX_2 {

	public static void main(String[] args) {
		BinarySearchTree BST = new BinarySearchTree();
		String temp = "";
		File file = new File("case.txt");
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while((temp=br.readLine()) != null){
				
				String[] str = temp.split(" ");
				Student record = new Student();
				record.id = Integer.parseInt(str[0]);
				record.name = str[1];
				record.addr = str[2];
				BST.insertBST(record); //이진탐색 트리에 삽입
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		BST.printBST();

	}

}
