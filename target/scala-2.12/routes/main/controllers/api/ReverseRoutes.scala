// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alpay/Desktop/iytewall/backend/conf/routes
// @DATE:Thu May 17 02:19:35 EET 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:10
package controllers.api {

  // @LINE:35
  class ReverseCommentController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:37
    def create(threadId:Long): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("threadId", threadId)))
    }
  
    // @LINE:41
    def vote(id:Long, vote:Boolean): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/vote/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("vote", vote)))
    }
  
    // @LINE:39
    def delete(commentId:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("commentId", commentId)))
    }
  
    // @LINE:35
    def fetch(threadId:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "comment/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("threadId", threadId)))
    }
  
  }

  // @LINE:10
  class ReverseUserController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:14
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:12
    def signUp(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/signUp")
    }
  
    // @LINE:11
    def fetch(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:10
    def fetchAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "user")
    }
  
    // @LINE:13
    def signIn(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "user/signIn")
    }
  
  }

  // @LINE:20
  class ReverseThreadController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:28
    def delete(id:Long): Call = {
      
      Call("DELETE", _prefix + { _defaultPrefix } + "thread/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:24
    def create(): Call = {
      
      Call("POST", _prefix + { _defaultPrefix } + "thread")
    }
  
    // @LINE:22
    def fetch(id:Long): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "thread/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)))
    }
  
    // @LINE:20
    def fetchAll(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "thread")
    }
  
    // @LINE:26
    def vote(id:Long, vote:Boolean): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "thread/vote/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Long]].unbind("id", id)) + "/" + play.core.routing.dynamicString(implicitly[play.api.mvc.PathBindable[Boolean]].unbind("vote", vote)))
    }
  
  }


}
