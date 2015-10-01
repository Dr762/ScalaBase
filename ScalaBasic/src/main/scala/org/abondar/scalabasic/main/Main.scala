/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic.main

import scala.collection.mutable.Map
import scala.io.Source

object Main {

  /**
   * @param args the command line arguments
   */
  def main(args: Array[String]): Unit = {
    val msg = "Hello Scala" //or  val msg : String = "Hello Scala" 
    val one = 1
    val two = 2
    var res = one + two
    println(msg)
    println(res)

    res = func1(2, 3)
    println(res)

    //var arr: Array[String] = new Array[String](3)
    //arr(0) = "Medved"
    //arr(1) = "Vodka"
    //arr(2) = "Balalaika"
    var arr = Array("Medved", "Vodka", "Balalaika")
    arr.foreach(ar => println(ar)) // for-each for the real man

    // typical for-each through range.    
    println(" ")
    println("Number range")
    for (ar <- 0 to 10)
      println(ar)

    // typical while    
    //    var i = 0
    //    while(i<arr.length){
    //    println(arr(i))
    //    i+=1
    //      
    //    }

    var lst = List(1, 2, 3, 4, 5)
    var lst1 = List(6, 7, 8, 9, 10)
    var bigLst = lst ::: lst1 // ::: add to back
    var bigLst1 = 0 :: bigLst // :: ad to front
    println(bigLst1)

    var tup = (100, "cool", 3.4) //tuple
    println(tup._3)

    var st = Set("aa", "bb") //immutable set 
    st += "cc" //here it's actually st = st+"cc"
    println(st)
    println(st.contains("dd"))

    val mMap = Map[Int, String]() //mut map
    mMap += (1 -> "Cool")
    mMap += (2 -> "Great")
    mMap += (3 -> "Awesome")
    println(mMap(1))

    //read lines from file

    for (line <- Source.fromFile("/home/alex/license.txt").getLines())
      println(line)

    val cs = new CheckSum
    cs.add(7)
    println(cs.checkSum)

    //here we call a singleton
    val res1 = CheckSum.calc("Ferrari")
    println(res1)

    val s = 'symbol //symnol literal
    println(s)

    val rat = new Rational(3, 4)
    val rat1 = new Rational(5, 6)
    println("Rational 1: " + rat.toString)
    println("Rational 2: " + rat1.toString)

    println("Rational 1 + Rational 2: " + (rat + rat1))
    println("Rational 1 - Rational 2: " + (rat - rat1))
    println("Rational 1 * Rational 2: " + rat * rat1)
    println("Rational 1 / Rational 2: " + rat / rat1)

    implicit def intToRational(x: Int) = new Rational(2) //to solve conflict with ints
    println("2 + Rational 2: " + 2 + rat1)
    println("2 - Rational 2: " + (2 - rat1))
    println("2 * Rational 2: " + 2 * rat1)
    println("2 / Rational 2: " + 2 / rat1)

    LongFile.processFile("/home/alex/bootstrap-3.3.5-dist/js/bootstrap.js", 50);

    var inc = (x: Int) => x + 1 //function literal (1st class func) . CLOSURE HERE!

    def moreInc(more: Int) = (x: Int) => x + more //closure 
    val fff = moreInc(32)
    println(fff)

    println(inc(10))

    println(bigLst1.filter((x) => x > 5)) //short-formed literal
    println(bigLst1.filter(x => x > 2)) //short-formed literal
    println(bigLst1.filter(_ > 7)) // short-formed literal
    println("Contains odds: " + containsOdd(bigLst1))

    def sum(a: Int, b: Int, c: Int) = a + b + c
    val su = sum _
    println(su(1, 5, 6))
    val su1 = sum(1, _: Int, 8)
    println(su1(7))

    def currSum(x: Int)(y: Int) = x + y
    val cres = currSum(1)(5)
    println("Curr sum res: " + cres)

    println(Rectangle.square(3, 10))

   
    
  }

  def func1(x: Int, y: Int): Int = {

    var r: Int = x * y
    return r

  }

  def containsOdd(nums: List[Int]) = nums.exists(_ % 2 == 1)

}
