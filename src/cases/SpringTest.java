

package cases;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * @author Administrator
 *
 */
public class SpringTest {

	public static void main(String args[]){
	
	 String spring_fileName = "";
	 
	 ApplicationContext context = null;
	    try {
	      context = WebApplicationContextUtils.getWebApplicationContext(ServletActionContext.getServletContext());
	      context.getBean("");
	    }
	    catch (Exception e) {
	      context = new ClassPathXmlApplicationContext(spring_fileName);
	    }
	    
	return ;

	}
}