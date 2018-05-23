package controllers.forms;

import play.data.validation.Constraints.Required;
import play.mvc.Http;
import play.mvc.Http.MultipartFormData.FilePart;

import java.util.Arrays;
import java.util.Map;

import static play.mvc.Controller.request;

public class ThreadCreateForm {

    public String title;

    public String msg;

    public FilePart image;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public FilePart getImage() {
        return image;
    }

    public void setImage(FilePart image) {
        this.image = image;
    }

    public String validate() {
        Http.MultipartFormData data = request().body().asMultipartFormData();
        image = data.getFile("image");
        Map<String, String[]> body = data.asFormUrlEncoded();
        String[] message = body.get("msg");
        String[] titles = body.get("title");
        msg = Arrays.toString(message);
        msg = msg.substring(1, msg.length() - 1);
        title = Arrays.toString(titles);
        title = title.substring(1, title.length() - 1);



        if (image == null) {
            return "File is missing.";
        }

        if (title.equals("")) {
            return "Title is missing.";
        }

        if (msg.equals("")) {
            return "Message is missing.";
        }

        return null;
    }
}
