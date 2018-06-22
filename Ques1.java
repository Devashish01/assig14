
public  class Ques1 implements Runnable{
	public synchronized void run() {
	 for(int i=1;i<=500;i++)
		 System.out.println(i+" ->thread 1");
		
		  try {
			Thread.sleep(1000);
		} 
		  catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		  
	  

	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
      Ques1 thread1=new Ques1();
      Thread th1=new Thread(thread1);
      T2 thread2=new T2();
	   Thread th2=new Thread(thread2);
	   th1.start();
       th1.join();
	   th2.start();
	   th2.join();

	}

}
class T2 implements Runnable{
	public synchronized void run() {
	for(int i=501;i<=1000;i++)
			System.out.println(i+" ->thread 2");
			try 
			{
				Thread.sleep(500);
			} 
			catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
	}
}