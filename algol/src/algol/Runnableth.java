package algol;



public class Runnableth implements Runnable
{
    // Runnable 인터페이스의 run()오버라이딩
    public void run()
    {
    	int x; 
    	while(true) {
    		try{
                Thread.sleep(5000);
    			 try {
    			 		x = queueExam.getqueueExam().s.deque();
    					System.out.println( x + "번 처리완료");
    			 	} catch (queue.EmptyIntQueueException e) {
    					System.out.println("프린트 대기열 명단이 존재하지 않습니다.");
    				}
            }catch(InterruptedException e ) 
            {
               
                Thread.currentThread().interrupt();
            }
    	}
        
 
    }
}
