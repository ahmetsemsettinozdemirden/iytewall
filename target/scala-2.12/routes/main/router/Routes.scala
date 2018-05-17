// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alpay/Desktop/iytewall/backend/conf/routes
// @DATE:Thu May 17 02:19:35 EET 2018

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  HomeController_2: controllers.HomeController,
  // @LINE:10
  UserController_0: controllers.api.UserController,
  // @LINE:20
  ThreadController_1: controllers.api.ThreadController,
  // @LINE:35
  CommentController_3: controllers.api.CommentController,
  // @LINE:45
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    HomeController_2: controllers.HomeController,
    // @LINE:10
    UserController_0: controllers.api.UserController,
    // @LINE:20
    ThreadController_1: controllers.api.ThreadController,
    // @LINE:35
    CommentController_3: controllers.api.CommentController,
    // @LINE:45
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_2, UserController_0, ThreadController_1, CommentController_3, Assets_4, "/")

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_2, UserController_0, ThreadController_1, CommentController_3, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user""", """controllers.api.UserController.fetchAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.api.UserController.fetch(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/signUp""", """controllers.api.UserController.signUp"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/signIn""", """controllers.api.UserController.signIn"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """user/""" + "$" + """id<[^/]+>""", """controllers.api.UserController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """thread""", """controllers.api.ThreadController.fetchAll"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """thread/""" + "$" + """id<[^/]+>""", """controllers.api.ThreadController.fetch(id:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """thread""", """controllers.api.ThreadController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """thread/vote/""" + "$" + """id<[^/]+>/""" + "$" + """vote<[^/]+>""", """controllers.api.ThreadController.vote(id:Long, vote:Boolean)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """thread/""" + "$" + """id<[^/]+>""", """controllers.api.ThreadController.delete(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """threadId<[^/]+>""", """controllers.api.CommentController.fetch(threadId:Long)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """threadId<[^/]+>""", """controllers.api.CommentController.create(threadId:Long)"""),
    ("""DELETE""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/""" + "$" + """commentId<[^/]+>""", """controllers.api.CommentController.delete(commentId:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """comment/vote/""" + "$" + """id<[^/]+>/""" + "$" + """vote<[^/]+>""", """controllers.api.CommentController.vote(id:Long, vote:Boolean)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_2.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ An example controller showing a sample home page""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_api_UserController_fetchAll1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user")))
  )
  private[this] lazy val controllers_api_UserController_fetchAll1_invoker = createInvoker(
    UserController_0.fetchAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.UserController",
      "fetchAll",
      Nil,
      "GET",
      this.prefix + """user""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_api_UserController_fetch2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_UserController_fetch2_invoker = createInvoker(
    UserController_0.fetch(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.UserController",
      "fetch",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_api_UserController_signUp3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/signUp")))
  )
  private[this] lazy val controllers_api_UserController_signUp3_invoker = createInvoker(
    UserController_0.signUp,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.UserController",
      "signUp",
      Nil,
      "POST",
      this.prefix + """user/signUp""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_api_UserController_signIn4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/signIn")))
  )
  private[this] lazy val controllers_api_UserController_signIn4_invoker = createInvoker(
    UserController_0.signIn,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.UserController",
      "signIn",
      Nil,
      "POST",
      this.prefix + """user/signIn""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_api_UserController_delete5_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("user/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_UserController_delete5_invoker = createInvoker(
    UserController_0.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.UserController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """user/""" + "$" + """id<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:20
  private[this] lazy val controllers_api_ThreadController_fetchAll6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("thread")))
  )
  private[this] lazy val controllers_api_ThreadController_fetchAll6_invoker = createInvoker(
    ThreadController_1.fetchAll,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.ThreadController",
      "fetchAll",
      Nil,
      "GET",
      this.prefix + """thread""",
      """""",
      Seq("""userFilter""")
    )
  )

  // @LINE:22
  private[this] lazy val controllers_api_ThreadController_fetch7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("thread/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_ThreadController_fetch7_invoker = createInvoker(
    ThreadController_1.fetch(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.ThreadController",
      "fetch",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """thread/""" + "$" + """id<[^/]+>""",
      """""",
      Seq("""userFilter""")
    )
  )

  // @LINE:24
  private[this] lazy val controllers_api_ThreadController_create8_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("thread")))
  )
  private[this] lazy val controllers_api_ThreadController_create8_invoker = createInvoker(
    ThreadController_1.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.ThreadController",
      "create",
      Nil,
      "POST",
      this.prefix + """thread""",
      """""",
      Seq("""userFilter""")
    )
  )

  // @LINE:26
  private[this] lazy val controllers_api_ThreadController_vote9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("thread/vote/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("vote", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_ThreadController_vote9_invoker = createInvoker(
    ThreadController_1.vote(fakeValue[Long], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.ThreadController",
      "vote",
      Seq(classOf[Long], classOf[Boolean]),
      "GET",
      this.prefix + """thread/vote/""" + "$" + """id<[^/]+>/""" + "$" + """vote<[^/]+>""",
      """""",
      Seq("""userFilter""")
    )
  )

  // @LINE:28
  private[this] lazy val controllers_api_ThreadController_delete10_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("thread/"), DynamicPart("id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_ThreadController_delete10_invoker = createInvoker(
    ThreadController_1.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.ThreadController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """thread/""" + "$" + """id<[^/]+>""",
      """""",
      Seq("""userFilter""")
    )
  )

  // @LINE:35
  private[this] lazy val controllers_api_CommentController_fetch11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("threadId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_CommentController_fetch11_invoker = createInvoker(
    CommentController_3.fetch(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.CommentController",
      "fetch",
      Seq(classOf[Long]),
      "GET",
      this.prefix + """comment/""" + "$" + """threadId<[^/]+>""",
      """""",
      Seq("""userFilter""")
    )
  )

  // @LINE:37
  private[this] lazy val controllers_api_CommentController_create12_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("threadId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_CommentController_create12_invoker = createInvoker(
    CommentController_3.create(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.CommentController",
      "create",
      Seq(classOf[Long]),
      "POST",
      this.prefix + """comment/""" + "$" + """threadId<[^/]+>""",
      """""",
      Seq("""userFilter""")
    )
  )

  // @LINE:39
  private[this] lazy val controllers_api_CommentController_delete13_route = Route("DELETE",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/"), DynamicPart("commentId", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_CommentController_delete13_invoker = createInvoker(
    CommentController_3.delete(fakeValue[Long]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.CommentController",
      "delete",
      Seq(classOf[Long]),
      "DELETE",
      this.prefix + """comment/""" + "$" + """commentId<[^/]+>""",
      """""",
      Seq("""userFilter""")
    )
  )

  // @LINE:41
  private[this] lazy val controllers_api_CommentController_vote14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("comment/vote/"), DynamicPart("id", """[^/]+""",true), StaticPart("/"), DynamicPart("vote", """[^/]+""",true)))
  )
  private[this] lazy val controllers_api_CommentController_vote14_invoker = createInvoker(
    CommentController_3.vote(fakeValue[Long], fakeValue[Boolean]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.api.CommentController",
      "vote",
      Seq(classOf[Long], classOf[Boolean]),
      "GET",
      this.prefix + """comment/vote/""" + "$" + """id<[^/]+>/""" + "$" + """vote<[^/]+>""",
      """""",
      Seq("""userFilter""")
    )
  )

  // @LINE:45
  private[this] lazy val controllers_Assets_versioned15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned15_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_HomeController_index0_route(params@_) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_2.index)
      }
  
    // @LINE:10
    case controllers_api_UserController_fetchAll1_route(params@_) =>
      call { 
        controllers_api_UserController_fetchAll1_invoker.call(UserController_0.fetchAll)
      }
  
    // @LINE:11
    case controllers_api_UserController_fetch2_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_api_UserController_fetch2_invoker.call(UserController_0.fetch(id))
      }
  
    // @LINE:12
    case controllers_api_UserController_signUp3_route(params@_) =>
      call { 
        controllers_api_UserController_signUp3_invoker.call(UserController_0.signUp)
      }
  
    // @LINE:13
    case controllers_api_UserController_signIn4_route(params@_) =>
      call { 
        controllers_api_UserController_signIn4_invoker.call(UserController_0.signIn)
      }
  
    // @LINE:14
    case controllers_api_UserController_delete5_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_api_UserController_delete5_invoker.call(UserController_0.delete(id))
      }
  
    // @LINE:20
    case controllers_api_ThreadController_fetchAll6_route(params@_) =>
      call { 
        controllers_api_ThreadController_fetchAll6_invoker.call(ThreadController_1.fetchAll)
      }
  
    // @LINE:22
    case controllers_api_ThreadController_fetch7_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_api_ThreadController_fetch7_invoker.call(ThreadController_1.fetch(id))
      }
  
    // @LINE:24
    case controllers_api_ThreadController_create8_route(params@_) =>
      call { 
        controllers_api_ThreadController_create8_invoker.call(ThreadController_1.create)
      }
  
    // @LINE:26
    case controllers_api_ThreadController_vote9_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Boolean]("vote", None)) { (id, vote) =>
        controllers_api_ThreadController_vote9_invoker.call(ThreadController_1.vote(id, vote))
      }
  
    // @LINE:28
    case controllers_api_ThreadController_delete10_route(params@_) =>
      call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_api_ThreadController_delete10_invoker.call(ThreadController_1.delete(id))
      }
  
    // @LINE:35
    case controllers_api_CommentController_fetch11_route(params@_) =>
      call(params.fromPath[Long]("threadId", None)) { (threadId) =>
        controllers_api_CommentController_fetch11_invoker.call(CommentController_3.fetch(threadId))
      }
  
    // @LINE:37
    case controllers_api_CommentController_create12_route(params@_) =>
      call(params.fromPath[Long]("threadId", None)) { (threadId) =>
        controllers_api_CommentController_create12_invoker.call(CommentController_3.create(threadId))
      }
  
    // @LINE:39
    case controllers_api_CommentController_delete13_route(params@_) =>
      call(params.fromPath[Long]("commentId", None)) { (commentId) =>
        controllers_api_CommentController_delete13_invoker.call(CommentController_3.delete(commentId))
      }
  
    // @LINE:41
    case controllers_api_CommentController_vote14_route(params@_) =>
      call(params.fromPath[Long]("id", None), params.fromPath[Boolean]("vote", None)) { (id, vote) =>
        controllers_api_CommentController_vote14_invoker.call(CommentController_3.vote(id, vote))
      }
  
    // @LINE:45
    case controllers_Assets_versioned15_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned15_invoker.call(Assets_4.versioned(path, file))
      }
  }
}
