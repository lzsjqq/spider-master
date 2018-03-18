package snow.com.spider.core;
/**
 * 
 * 描述：url静态相关
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
public class Requset {
	private String url;

	public Requset(String url) {
		this.url = url;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
