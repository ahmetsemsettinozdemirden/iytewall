package controllers.forms;

import play.data.validation.Constraints.Required;

public class CommentCreateForm {

    @Required
    public String msg;

}
