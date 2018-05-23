package models.Thread;

import models.Utils.Image;

import java.io.File;
import java.io.UnsupportedEncodingException;

public interface ThreadGenerator {
	Thread generate(Long userId,
					Image image,
					String title,
					String msg) throws UnsupportedEncodingException;
}
