package auto;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class log4j {
	private static Logger logger = LogManager.getLogger(log4j.class);
	
	public static void main(String[] args) {
		logger.info("Hello");
	}
}
