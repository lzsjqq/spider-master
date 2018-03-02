package sp.com.webmagic;

/**
 * 网络请求基本参数配置
 * 
 * @author 80002253
 */
public class Site {
	// 联网重试次数
	private int retryTimes = 0;

	/**
	 * 获取site实例
	 * 
	 * @return
	 */
	public static Site me() {
		return new Site();
	}

	public int getRetryTimes() {
		return retryTimes;
	}

	/**
	 * 设置网络连接重试次数
	 * 
	 * @param retryTimes
	 * @return
	 */
	public Site setRetryTimes(int retryTimes) {
		this.retryTimes = retryTimes;
		return this;
	}

}
