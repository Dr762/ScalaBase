/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic

class ScalaBean {
  
  private[this] var x = 0
  private[this] var xstr = "0"
  
  def xInt: Int = x//getter
  def xInt_=(x1:Int){x=x1}//setter
  
  def xString: String = xstr
  def xString_=(xs: String ){xstr=xs}


}
