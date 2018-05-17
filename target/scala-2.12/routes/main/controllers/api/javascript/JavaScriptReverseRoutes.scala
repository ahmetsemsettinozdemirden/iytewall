// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alpay/Desktop/iytewall/backend/conf/routes
// @DATE:Thu May 17 02:19:35 EET 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package controllers.api.javascript {

  // @LINE:35
  class ReverseCommentController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.CommentController.create",
      """
        function(threadId0) {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("threadId", threadId0))})
        }
      """
    )
  
    // @LINE:41
    def vote: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.CommentController.vote",
      """
        function(id0,vote1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/vote/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Boolean]].javascriptUnbind + """)("vote", vote1))})
        }
      """
    )
  
    // @LINE:39
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.CommentController.delete",
      """
        function(commentId0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("commentId", commentId0))})
        }
      """
    )
  
    // @LINE:35
    def fetch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.CommentController.fetch",
      """
        function(threadId0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "comment/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("threadId", threadId0))})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.UserController.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:12
    def signUp: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.UserController.signUp",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/signUp"})
        }
      """
    )
  
    // @LINE:11
    def fetch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.UserController.fetch",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:10
    def fetchAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.UserController.fetchAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "user"})
        }
      """
    )
  
    // @LINE:13
    def signIn: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.UserController.signIn",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "user/signIn"})
        }
      """
    )
  
  }

  // @LINE:20
  class ReverseThreadController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def delete: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.ThreadController.delete",
      """
        function(id0) {
          return _wA({method:"DELETE", url:"""" + _prefix + { _defaultPrefix } + """" + "thread/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:24
    def create: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.ThreadController.create",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "thread"})
        }
      """
    )
  
    // @LINE:22
    def fetch: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.ThreadController.fetch",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "thread/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0))})
        }
      """
    )
  
    // @LINE:20
    def fetchAll: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.ThreadController.fetchAll",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "thread"})
        }
      """
    )
  
    // @LINE:26
    def vote: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.api.ThreadController.vote",
      """
        function(id0,vote1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "thread/vote/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Long]].javascriptUnbind + """)("id", id0)) + "/" + encodeURIComponent((""" + implicitly[play.api.mvc.PathBindable[Boolean]].javascriptUnbind + """)("vote", vote1))})
        }
      """
    )
  
  }


}
