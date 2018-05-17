package models.Thread;

import java.io.File;
import java.io.UnsupportedEncodingException;

public interface ThreadGenerator {
	Thread generate(Long userId,
					File image,
					String title,
					String msg) throws UnsupportedEncodingException;
}
