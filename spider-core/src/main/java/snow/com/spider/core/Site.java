package snow.com.spider.core;
/**
 * 
 * 描述：请求相关
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
public class Site {
	private String domain;
	public static Site me() {
		return new Site();
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	
}
