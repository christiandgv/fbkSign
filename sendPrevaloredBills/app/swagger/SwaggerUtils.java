package swagger;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import play.mvc.With;

public class SwaggerUtils {

	@With(ApiCall.class)
	@Target({ ElementType.TYPE, ElementType.METHOD })
	@Retention(RetentionPolicy.RUNTIME)
	public @interface ApiAction {
	}

	public static List<String> parametersToList(String collectionFormat, String name, Object value) {
		List<String> params = new ArrayList<>();

		// preconditions
		if (name == null || name.isEmpty() || value == null)
			return params;

		Collection valueCollection = null;
		if (value instanceof Collection) {
			valueCollection = (Collection) value;
		} else {
			params.add(parameterToString(value));
			return params;
		}

		if (valueCollection.isEmpty()) {
			return params;
		}

		// get the collection format
		collectionFormat = (collectionFormat == null || collectionFormat.isEmpty() ? "csv" : collectionFormat); // default:
																												// csv

		// create the params based on the collection format
		if (collectionFormat.equals("multi")) {
			for (Object item : valueCollection) {
				params.add(parameterToString(item));
			}

			return params;
		}

		String delimiter = ",";

		if (collectionFormat.equals("csv")) {
			delimiter = ",";
		} else if (collectionFormat.equals("ssv")) {
			delimiter = " ";
		} else if (collectionFormat.equals("tsv")) {
			delimiter = "\t";
		} else if (collectionFormat.equals("pipes")) {
			delimiter = "|";
		}

		StringBuilder sb = new StringBuilder();
		for (Object item : valueCollection) {
			sb.append(delimiter);
			sb.append(parameterToString(item));
		}

		params.add(sb.substring(1));

		return params;
	}

	public static String parameterToString(Object param) {
		if (param == null) {
			return "";
		} else if (param instanceof Date) {
			return formatDatetime((Date) param);
		} else if (param instanceof Collection) {
			StringBuilder b = new StringBuilder();
			for (Object o : (Collection) param) {
				if (b.length() > 0) {
					b.append(",");
				}
				b.append(String.valueOf(o));
			}

			return b.toString();
		} else {
			return String.valueOf(param);
		}
	}

	public static String formatDatetime(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSXXX").format(date);
	}
}