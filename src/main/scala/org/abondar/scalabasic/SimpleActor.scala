package org.abondar.scalabasic

/**
 * Created by alex on 28.10.15
 */
import akka.actor._

object SimpleActor extends Actor{

  def act(){
      for (_ <- 1 to 10){
        println("We are delta")
        Thread.sleep(1000)
      }
  }

  override def receive: Receive = ???
}
