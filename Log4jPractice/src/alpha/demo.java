package alpha;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class demo {
	private static Logger log = LogManager.getLogger(demo.class.getName());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		log.debug("I have clicked on the button");
		log.info("Button is clicked");
		log.error("button is not displayed");
		log.fatal("button is missing");
	}

}
