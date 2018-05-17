package controllers.forms;

import play.data.validation.Constraints.Required;

public class ThreadCreateForm {

    @Required
    public String title;

    @Required
    public String msg;

}
