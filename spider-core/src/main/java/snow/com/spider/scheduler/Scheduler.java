package snow.com.spider.scheduler;

import snow.com.spider.core.Requset;
import snow.com.spider.core.Spider;

public interface Scheduler {

	public void push(Requset requset, Spider spider);

	public void poll();

}
