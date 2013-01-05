package solubris.test;

import java.util.Date;
import java.util.concurrent.ScheduledFuture;

import org.springframework.scheduling.Trigger;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;

public class NopTaskScheduler extends ThreadPoolTaskScheduler {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void execute(Runnable task) {
	}
	// TaskScheduler implementation

	public ScheduledFuture<?> schedule(Runnable task, Trigger trigger) {
		return null;
	}

	public ScheduledFuture<?> schedule(Runnable task, Date startTime) {
		return null;
	}

	public ScheduledFuture<?> scheduleAtFixedRate(Runnable task, Date startTime, long period) {
		return null;
	}

	public ScheduledFuture<?> scheduleAtFixedRate(Runnable task, long period) {
		return null;
	}

	public ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, Date startTime, long delay) {
		return null;
	}

	public ScheduledFuture<?> scheduleWithFixedDelay(Runnable task, long delay) {
		return null;
	}

}
