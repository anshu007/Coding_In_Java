import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;




public class helloworld {
	
	public static Log log=LogFactory.getLog(helloworld.class);
  
	//private static final Logger log=LoggerFactory.getLogger(helloworld.class);

	public static void main(String[] args) {
		//System.setProperty("log4j.configuration", "log4j.properties");
		log.debug("start app");
		System.out.println("HELLO WQORLD");
		hw1.hello();
		log.debug("end app");

	}

}
