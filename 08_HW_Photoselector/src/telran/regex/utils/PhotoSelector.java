package telran.regex.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhotoSelector {
	public static String[] selectPictures(String[] pictures, String regex) {
		int count = 0;
		Pattern pattern = Pattern.compile(regex);
		for (int i = 0; i < pictures.length; i++) {
			Matcher matcher = pattern.matcher(pictures[i]);
			if (matcher.find())
				count++;
		}
		String[] newArray = new String[count];
		int j = 0;
		for (int i = 0; i < pictures.length; i++) {
			Matcher matcher = pattern.matcher(pictures[i]);
			if (matcher.find())
				newArray[j++] = pictures[i];
		}

		return newArray;
	}

}
