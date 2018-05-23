package models.Utils;

import io.ebean.Finder;
import io.ebean.Model;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

@Entity
@Table(name="image")
public class Image extends Model {
	private static final long serialVersionUID = 1L;

	@Id
	public long id;

	@Constraints.Required
	public String name;

	@Lob
	public byte[] data;

	public static Finder<Long, Image> find = new Finder<>(Image.class);

	public Image(String name, File image) {
		this.name = name;
		this.data = new byte[(int)image.length()];

		/* write the image data into the byte array */
		InputStream inStream = null;
		try {
			inStream = new BufferedInputStream(new FileInputStream(image));
			inStream.read(this.data);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (inStream != null) {
				try {
					inStream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		this.save();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getData() {
		return data;
	}

	public void setData(byte[] data) {
		this.data = data;
	}
}