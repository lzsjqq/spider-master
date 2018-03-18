package snow.com.spider.processor;

import snow.com.spider.core.Site;

public interface PageProcessor {
	void processor();

	Site getSite();
}
