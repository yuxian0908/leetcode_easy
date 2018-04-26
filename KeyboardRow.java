package leetcode;

import java.util.stream.Stream;

public class KeyboardRow {
	public String[] findWords(String[] words) {
	    return Stream.of(words).filter(s -> s.toLowerCase().matches("[qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*")).toArray(String[]::new);
	}
}
