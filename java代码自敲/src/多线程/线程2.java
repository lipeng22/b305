package 多线程;

public class 线程2 {
	public static void main(String[] args){
		ThreadTest test = new  ThreadTest();
		Thread thread = new Thread(test);
		thread.start();
		for(int i = 0;i < 10;i ++){
			System.out.println(i);
		}
		
	}

}
class ThreadTest implements Runnable{
	public void run(){
		for (int a = 0;a < 10;a++){
			System.out.println("s"+a);
			if(a==9)
				break;
		}
	}
}
