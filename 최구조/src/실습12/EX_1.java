package �ǽ�12;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class EX_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Student item;
		String temp = "";
		File file = new File("case.txt");
		Heap h = new Heap();
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while((temp=br.readLine()) != null){
				
				String[] str = temp.split(" ");
				Student record = new Student();
				record.id = Integer.parseInt(str[0]); //�й�
				record.name = str[1]; //�̸�
				record.addr = str[2]; //�ּ�
				h.insertHeap(record);  // heap�� insert(�ּ�)
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		h.printHeap(); //insert item ���
		
		n = h.getHeapSize(); // n = heap������
		System.out.println();
		for(int i=1; i<=n; i++)
		{
			item = h.deleteHeap(); //���� ������ ���� ���� ��
			System.out.print("deleted Item : ");
			item.print(); //�ش� �й��� �´� Student ���� ���
			
		}
	}

}
