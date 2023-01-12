package tutorial.webapp

import typings.node.processMod.global.process

object TutorialApp {
  def main(args: Array[String]): Unit = {
    println("Hello from Scala.js")
    process.env.take(5).foreach(kv =>
      println(s"${kv._1}=${kv._2}")
    )
  }
}
