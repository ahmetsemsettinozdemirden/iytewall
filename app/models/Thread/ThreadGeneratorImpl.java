package models.Thread;

import com.google.inject.Singleton;

import java.io.File;
import java.io.UnsupportedEncodingException;

@Singleton
public class ThreadGeneratorImpl implements ThreadGenerator{

	@Override
	public Thread generate(Long userId,
						   File image,
						   String title,
						   String msg) throws UnsupportedEncodingException {

		Thread thread = new Thread(userId, image, title, msg);

		thread.save();

		return thread;
	}
}
