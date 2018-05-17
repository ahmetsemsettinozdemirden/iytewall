// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alpay/Desktop/iytewall/backend/conf/routes
// @DATE:Thu May 17 02:19:35 EET 2018

package controllers.api;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.api.ReverseCommentController CommentController = new controllers.api.ReverseCommentController(RoutesPrefix.byNamePrefix());
  public static final controllers.api.ReverseUserController UserController = new controllers.api.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.api.ReverseThreadController ThreadController = new controllers.api.ReverseThreadController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.api.javascript.ReverseCommentController CommentController = new controllers.api.javascript.ReverseCommentController(RoutesPrefix.byNamePrefix());
    public static final controllers.api.javascript.ReverseUserController UserController = new controllers.api.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.api.javascript.ReverseThreadController ThreadController = new controllers.api.javascript.ReverseThreadController(RoutesPrefix.byNamePrefix());
  }

}
