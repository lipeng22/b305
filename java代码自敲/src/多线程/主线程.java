package 多线程;

public class 主线程 {
	public static void main(String[] args){
		Thread thread = Thread.currentThread();
		System.out.println("主线程是" + thread);
		thread.setName("New Thread");
		System.out.println("主线程名称修改为" + thread);
		try {
			for(int i = 0;i < 10;i ++){
				System.out.println(i);
				thread.sleep(1000);
			}
		}
		catch(Exception e){
			System.out.println("线程异常");
		}
		
	}

}
