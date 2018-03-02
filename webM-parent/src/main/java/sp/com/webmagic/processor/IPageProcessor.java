package sp.com.webmagic.processor;

import sp.com.webmagic.Page;
import sp.com.webmagic.Site;

/**
 * 
 * 页面处理器
 * 
 * @author 80002253
 *
 */
public interface IPageProcessor {
	/**
	 * 执行处理程序
	 * 
	 * @param page
	 */
	void process(Page page);

	/**
	 * 获取网络基本配置
	 * 
	 * @return Site
	 */
	Site getSite();
}
