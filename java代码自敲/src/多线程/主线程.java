package ���߳�;

public class ���߳� {
	public static void main(String[] args){
		Thread thread = Thread.currentThread();
		System.out.println("���߳���" + thread);
		thread.setName("New Thread");
		System.out.println("���߳������޸�Ϊ" + thread);
		try {
			for(int i = 0;i < 10;i ++){
				System.out.println(i);
				thread.sleep(1000);
			}
		}
		catch(Exception e){
			System.out.println("�߳��쳣");
		}
		
	}

}
