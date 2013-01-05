package solubris.test;

import org.springframework.scheduling.config.TaskExecutorFactoryBean;

public class NopTaskExecutor extends TaskExecutorFactoryBean {
	public void afterPropertiesSet() throws Exception {
	}

}
