/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic

import scala.annotation.tailrec

class Rational(n: Int, d: Int) {
  require(d!=0)
  private val g = gcd(n.abs,d.abs)
  val numer: Int=  n /g
  val denom: Int = d/g
  
  def this(n: Int) = this(n,1) //auxiliary constructor
  
  override def toString: String = numer + "/" + denom
  
  def +(that:Rational): Rational = new Rational(
    numer*that.denom + that.numer*denom,
    denom*that.denom
     )
  
  def +(i:Int): Rational = new Rational( numer + i * denom,denom)
  
  def -(that:Rational): Rational = new Rational(
    numer*that.denom - that.numer*denom,
    denom*that.denom
     )
  
  def -(i:Int): Rational = new Rational( numer - i * denom,denom)
 
  
  def *(that:Rational): Rational = new Rational(numer*that.denom , that.numer*denom)
  
  def *(i:Int): Rational = new Rational( numer * i ,denom)//can be a conflict with default * int
  
  def /(that:Rational): Rational = new Rational( 
       numer * that.denom ,denom*that.numer)
     
  def /(i:Int): Rational = new Rational( numer ,denom*i)
  
  def lessThan(that:Rational): Boolean =
    this.numer * that.denom < that.numer * this.denom
  
  def max(that:Rational): Rational =
    if (this.lessThan(that)) that else this
  
  
  @tailrec
  private def gcd(a: Int, b: Int): Int =
    if (b==0) a else gcd(b, a%b)
}



