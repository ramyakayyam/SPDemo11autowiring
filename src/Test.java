import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test
{
	public static void main(String[] args) 
		{
		 Resource res=new ClassPathResource("myconfig1.xml");
	      BeanFactory fac=new XmlBeanFactory(res);
	      DemoBean ob1=(DemoBean)fac.getBean("id2");
			ob1.showMsg();    
		}
	}


