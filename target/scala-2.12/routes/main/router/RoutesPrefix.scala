// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/alpay/Desktop/iytewall/backend/conf/routes
// @DATE:Wed May 23 21:10:09 EET 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
