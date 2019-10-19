/**
 * 
 */
package ec.com.kruger.data.util;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigFactory;

/**
 * @author marco
 *
 */
public final class Properties {

	private static Config config = ConfigFactory.load(ConfigFactory.load().getString("play.properties.service"));

	private Properties() {

	}

	public static String getString(String key) {
		try {
			return config.getString(key);
		} catch (ConfigException e) {
			return "";
		}
	}
	
	public static String getString(String key, String... params) {
		try {
			return parametro(key, params);
		} catch (ConfigException e) {
			return "";
		}
	}

	private static String parametro(String key, String... params) {
		String paramStr = config.getString(key);
		int index = 0;
		for (String str : params) {
			paramStr = paramStr.replace("{" + index + "}", str);
			index++;
		}
		return paramStr;
	}

}
