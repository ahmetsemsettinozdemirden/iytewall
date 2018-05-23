package controllers.forms;

import play.data.validation.Constraints.Required;
import play.mvc.Http;
import play.mvc.Http.MultipartFormData.FilePart;

import static play.mvc.Controller.request;

public class UploadImageForm {

	public FilePart image;

	public String validate() {
		Http.MultipartFormData data = request().body().asMultipartFormData();
		image = data.getFile("image");

		if (image == null) {
			return "File is missing.";
		}

		return null;
	}
}
