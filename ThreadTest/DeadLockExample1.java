package ThreadTest;

public class DeadLockExample1 {

	public static void main(String[] args) {
		
	final String s1 = "java";
	final String s2 = "Oak";
		
		Thread t1 = new Thread(){
		
		public void run()
		{
			synchronized(s1)
			{
				System.out.println("s1");
				try{
					Thread.sleep(1000);
				}
				catch(Exception e)
				{}
				synchronized(s2)
				{
					System.out.println("s2");
				}
			}
		}
		};
		
		Thread t2 = new Thread(){
			
			public void run()
			{
				synchronized(s2)
				{
					System.out.println("s2");
					try{
						Thread.sleep(1000);
					}
					catch(Exception e)
					{}
					synchronized(s1)
					{
						System.out.println("s1");
					}
				}
			}
			};
			
		 t1.start();  
		 t2.start();
	
	}
}
