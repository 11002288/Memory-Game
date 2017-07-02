
public class MoveTimer {
	private void startEndGameTimer (long delay)
	{
		new java.util.Timer().schedule(new java.util.TimerTask() {
			@Override
			public void run() {
				System.out.println("test");
				
			}
		}, delay*1000);
	}  
}
