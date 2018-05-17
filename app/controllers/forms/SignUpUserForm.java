package controllers.forms;

import play.data.validation.Constraints.Required;

public class SignUpUserForm {

    @Required
    public String name;

    @Required
    public String email;

    @Required
    public String password;

}
