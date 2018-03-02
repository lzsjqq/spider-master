package sp.com.test;

import sp.com.webmagic.Page;
import sp.com.webmagic.Site;
import sp.com.webmagic.processor.IPageProcessor;

/**
 * 抓取Github
 * 
 * @author 80002253
 *
 */
public class GithubRepoPageProcessor implements IPageProcessor {
	// 部分一：抓取网站的相关配置，包括编码、抓取间隔、重试次数等
	private Site site = Site.me().setRetryTimes(3);

	@Override
	public void process(Page page) {

	}

	@Override
	public Site getSite() {
		return this.site;
	}

	public static void main(String[] args) {

	}

}
