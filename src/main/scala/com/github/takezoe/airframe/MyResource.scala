package com.github.takezoe.airframe

import wvlet.airframe.http.{Endpoint, HttpMethod}

object MyResource {
  case class User(name: String)
}

trait MyResource {
  import MyResource._

  @Endpoint(path = "/user/:name", method = HttpMethod.GET)
  def getUser(name: String): User = User(name)

}
