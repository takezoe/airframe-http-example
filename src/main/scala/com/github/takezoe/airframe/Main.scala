package com.github.takezoe.airframe

import wvlet.airframe.http._
import wvlet.airframe.http.finagle._

object Main extends App {
  val router = Router.of[MyResource]

  val module = finagleDefaultDesign
    .bind[MyResource].toSingleton
    .bind[Router].toInstance(router)
    .bind[FinagleServerConfig].toInstance(FinagleServerConfig(port = 8080))

  module.build[FinagleServer] { server =>
    server.waitServerTermination
  }
}
