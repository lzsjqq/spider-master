package snow.com.spider.example;

import snow.com.spider.core.Site;
import snow.com.spider.core.Spider;
import snow.com.spider.processor.PageProcessor;

public class HubProcessor implements PageProcessor {

	public void processor() {

	}

	public Site getSite() {
		return Site.me();
	}

	public static void main(String[] args) {
		Spider.create(new HubProcessor()).addUrl("").run();
	}

}
