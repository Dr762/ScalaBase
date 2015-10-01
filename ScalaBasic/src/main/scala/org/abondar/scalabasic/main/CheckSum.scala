/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic.main
import scala.collection.mutable.Map
//they are companions
class CheckSum {

  private var sum = 0

  def add(b: Byte){sum += b} 
  def checkSum():Int =  ~(sum & 0xFF) +1
    
  

}


//this is a singleton
object CheckSum {

  private val cache = Map[String,Int]()
  
  def calc(s:String): Int = 
    if (cache.contains(s))
      cache(s)
    else {
       val acc = new CheckSum  
       for (c <- s)
         acc.add(c.toByte)
       val cs = acc.checkSum
       cache +=(s->cs)
       cs
    }  
}


