package snow.com.spider.core;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

import snow.com.spider.processor.PageProcessor;
import snow.com.spider.scheduler.QueueScheduler;
import snow.com.spider.scheduler.Scheduler;
import snow.com.spider.task.Task;
import snow.com.spider.util.UrlUtils;

/**
 * 
 * 描述：组织管理类
 * 
 * <pre>
 * HISTORY
 * ****************************************************************************
 *  ID   DATE           PERSON          REASON
 *  1    2018年3月16日        	80002253        Create
 * ****************************************************************************
 * </pre>
 * 
 * @author 80002253
 * @since 1.0
 */
public class Spider implements Runnable, Task {

	private Scheduler scheduler = new QueueScheduler();

	private PageProcessor pageProcessor;
	private Site site;

	private ReentrantLock newUrlLock = new ReentrantLock();
	private Condition newUrlCondition = newUrlLock.newCondition();

	public Spider(PageProcessor pageProcessor) {
		this.pageProcessor = pageProcessor;
		this.site = pageProcessor.getSite();

	}

	public static Spider create(PageProcessor pageProcessor) {

		return new Spider(pageProcessor);
	}

	public PageProcessor getPageProcessor() {
		return pageProcessor;
	}

	public void setPageProcessor(PageProcessor pageProcessor) {
		this.pageProcessor = pageProcessor;
	}

	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public Spider addUrl(String... urls) {
		for (String url : urls) {
			addRequset(new Requset(url));
		}
		//
		signalNewUrl();
		return this;
	}

	private void signalNewUrl() {
		try {
			newUrlLock.lock();
			newUrlCondition.signalAll();
		} catch (Exception e) {
			newUrlLock.unlock();
		}
	}

	/**
	 * 
	 * @param requset
	 */
	private void addRequset(Requset requset) {
		String url = requset.getUrl();
		if (this.site.getDomain() == null && requset != null && url != null) {
			this.site.setDomain(UrlUtils.getDomain(url));
		}
		//
		scheduler.push(requset, this);
	}

	public Scheduler getScheduler() {
		return scheduler;
	}

	public void setScheduler(Scheduler scheduler) {
		this.scheduler = scheduler;
	}

	public void run() {

	}

	public String getUUID() {

		return null;
	}

}
