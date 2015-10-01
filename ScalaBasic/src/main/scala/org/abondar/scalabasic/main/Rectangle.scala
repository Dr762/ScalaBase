/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic.main
import Element.elem

object Rectangle {

  
  val corner = elem("+")

  def square(h: Int,w:Int): Element = {

      val hline = elem('-',w,1)
      val vline = elem('|',1,h)
     
     val s1 = corner beside hline beside corner
     val s2 = vline  
     val s3 = corner above vline 
     
     ((corner above (vline above corner )) beside hline beside corner) beside ((hline beside corner) above vline) 
  }

}
