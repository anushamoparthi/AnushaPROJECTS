package java_prgs;

public class ThreadsUsingRunnable implements Runnable{
	private Thread t;
	private String threadName;
	
	ThreadsUsingRunnable(String name){
		threadName = name;
		System.out.println("creating thread "+threadName);
	}
	
	
	public static void main(String[] args) {
		ThreadsUsingRunnable runnable=new ThreadsUsingRunnable("thread1");
		runnable.start();
		
	}

	@Override
	public void run() {
		System.out.println("thread" +threadName+ "running" );
		try{			for(int i=3;i>0;i--){
				System.out.println("Thread : "+ threadName + " "+i);
				Thread.sleep(1000L);
			}
			}
		catch(Exception e){
				System.out.println("Thread "+threadName +"interrupted");
			}
		
		
		}
	public void start(){
		System.out.println("resuming thread:" +threadName);
		if(t==null){
			t= new Thread (this, threadName);
			t.start();
		}
	}
		
	}


