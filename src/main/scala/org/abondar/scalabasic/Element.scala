/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic

import Element.elem

abstract class Element {

  def contents: Array[String] //abstr method
  def height: Int = contents.length //parametrless method - equals to val heght=...
  def width: Int = if (height == 0) 0 else contents(0).length

  def above(that: Element): Element = {
    
    val this1 = this widen that.width
    val that1 = that widen this.width
    elem(this1.contents ++ that1.contents ) 
  }
  
 

  def beside(that: Element): Element = {

   val this1 = this heighten that.height
   val that1 = that heighten this.height
   
   elem( for ((line1,line2)<-this1.contents zip that1.contents)
         yield line1+line2)
   
  }
  
  def widen(w:Int):Element = 
    if (w <= width) this
    else {
       var left = elem(' ',(w-width),height)  
       var right = elem(' ',w-width-left.width,height)
       left beside this beside right
    }
       
  def heighten(h:Int): Element =
    if (h<=height) this 
       else { 
          val top =elem(' ',width,(h -height)) 
          val bot = elem(' ', width,h-height-top.height)
          top above this above bot
      }
  
  override def toString = contents mkString "\n"
}

object Element { // factory object

  private class ArrayElement(
    val contents: Array[String]
  ) extends Element

  private class LineElement(s: String) extends Element {
    var contents = Array(s) //instead of extending ArrayElement and invoking its constructor
    override def width = s.length
    override def height = 1

  }

  class UniformElement( //for polymorphysm
    ch: Char,
    override val width: Int,
    override val height: Int

  ) extends Element {

    private val line = ch.toString * width
    def contents = Array.fill(height)(line)
  }
 
  def elem(contents: Array[String]): Element = new ArrayElement(contents)
  def elem(chr: Char, width: Int, height: Int): Element = new UniformElement(chr, width, height)
  def elem(line: String): Element = new LineElement(line)

}