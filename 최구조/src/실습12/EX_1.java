package 실습12;

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
				record.id = Integer.parseInt(str[0]); //학번
				record.name = str[1]; //이름
				record.addr = str[2]; //주소
				h.insertHeap(record);  // heap에 insert(최소)
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		h.printHeap(); //insert item 출력
		
		n = h.getHeapSize(); // n = heap사이즈
		System.out.println();
		for(int i=1; i<=n; i++)
		{
			item = h.deleteHeap(); //현재 힙에서 제일 작은 값
			System.out.print("deleted Item : ");
			item.print(); //해당 학번에 맞는 Student 정보 출력
			
		}
	}

}
