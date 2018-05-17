package controllers.forms;

import play.data.validation.Constraints.Required;

public class SignInUserForm {

    @Required
    public String email;

    @Required
    public String password;

}
