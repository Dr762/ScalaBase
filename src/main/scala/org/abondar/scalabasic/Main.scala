/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/

package org.abondar.scalabasic

import org.abondar.scalabasic.siumulation.ConcerteSim
import org.abondar.scalabasic.typeparam.QueueAlter

import scala.collection.mutable

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

    if (args.length>0){

      val arg = args(0)
      if (arg.equals("fn")) {
        res = func1(2, 3)
        println("Calculation result")
        println(res)
      }

      if (arg.equals("fl")){
            println(" ")
            println("Number range")
            for (ar <- 0 to 10)
              println(ar)
      }

      if (arg.equals("arr")){
        val demoArr: Array[String] = new Array[String](3)
        demoArr(0) = "Medved"
        demoArr(1) = "Vodka"
        demoArr(2) = "Balalaika"
        demoArr.foreach(ar => println(ar))

        val arr = Array("Matryoshka", "Babushka", "Sibir")
        arr.foreach(ar => println(ar)) // for-each for the real man

      }

      if (arg.equals("wl")){
        val arr = Array("Berlin", "Moscow", "Tokio")
        var i = 0
        while(i<arr.length){
        println(arr(i))
        i+=1
        }
      }

      if (arg.equals("lst")){
        val lst = List(1, 2, 3, 4, 5)
        val lst1 = List(6, 7, 8, 9, 10) //imutable(can't change elems by assignment)
        val bigLst = lst ::: lst1 // ::: add to back
        val bigLst1 = 0 :: bigLst // :: ad to front
        println(bigLst1)
      }

      if (arg.equals("tup")){
        val tup = (100, "cool", 3.4) //tuple
        println(tup._3)
      }

      if (arg.equals("set")){
        var st = mutable.Set("aa", "bb") //immutable set
        st += "cc" //here it's actually st = st+"cc"
        println(st)
        println(st.contains("dd"))
      }

      if (arg.equals("map")){
        val mMap = mutable.Map[Int, String]() //mut map
        mMap += (1 -> "Cool")
        mMap += (2 -> "Great")
        mMap += (3 -> "Awesome")
        println(mMap(1))
      }

    }

//    //read lines from file
//
//    //    for (line <- Source.fromFile("/home/alex/license.txt").getLines())
//    //      println(line)
//
//    val cs = new CheckSum
//    cs.add(7)
//    println(cs.checkSum)
//
//    //here we call a singleton
//    val res1 = CheckSum.calc("Ferrari")
//    println(res1)
//
//    val s = 'symbol //symnol literal
//    println(s)
//
//    val rat = new Rational(3, 4)
//    val rat1 = new Rational(5, 6)
//    println("Rational 1: " + rat.toString)
//    println("Rational 2: " + rat1.toString)
//
//    println("Rational 1 + Rational 2: " + (rat + rat1))
//    println("Rational 1 - Rational 2: " + (rat - rat1))
//    println("Rational 1 * Rational 2: " + rat * rat1)
//    println("Rational 1 / Rational 2: " + rat / rat1)
//
//    implicit def intToRational(x: Int): Rational = new Rational(2) //to solve conflict with ints
//    println("2 + Rational 2: " + 2 + rat1)
//    println("2 - Rational 2: " + (2 - rat1))
//    println("2 * Rational 2: " + 2 * rat1)
//    println("2 / Rational 2: " + 2 / rat1)
//
//    LongFile.processFile("/home/alex/bootstrap-3.3.5-dist/js/bootstrap.js", 50);
//
//    var inc = (x: Int) => x + 1 //function literal (1st class func) . CLOSURE HERE!
//
//    def moreInc(more: Int) = (x: Int) => x + more //closure
//    val fff = moreInc(32)
//    println(fff)
//
//    println(inc(10))
//
//    println(bigLst1.filter((x) => x > 5)) //short-formed literal
//    println(bigLst1.filter(x => x > 2)) //short-formed literal
//    println(bigLst1.filter(_ > 7)) // short-formed literal
//    println("Contains odds: " + containsOdd(bigLst1))
//
//    def sum(a: Int, b: Int, c: Int) = a + b + c
//    val su = sum _
//    println(su(1, 5, 6))
//    val su1 = sum(1, _: Int, 8)
//    println(su1(7))
//
//    def currSum(x: Int)(y: Int) = x + y
//    val cres = currSum(1)(5)
//    println("Curr sum res: " + cres)
//
//    println(Rectangle.square(3, 10))
//
//    //case class usage
//    val v = Var("x")
//    val op = BinOp("+", Number(1), v)
//    println(op.right == v)
//    println(simplifyTop(op))
//
//    //option type getiing
//    val caps = Map("Burkina Faso" -> "Uagaduguku", "North Korea" -> "Pyoungyang")
//    println(caps get "Burkina Faso")
//    println(show_option(caps get "North Korea"))
//
//    val f = new ExprFormatter
//    val e1 = BinOp("*", BinOp("/", Number(1), Number(2)), BinOp("+", Var("x"), Number(1)))
//    val e2 = BinOp("+", BinOp("/", Var("x"), Number(2)), BinOp("*", Number(1.5), Var("x")))
//    val e3 = BinOp("/", e1, e2)
//
//    def show(e: Expr): Unit = println(f.format(e) + "\n\n")
//    for (e <- Array(e1, e2, e3)) show(e)
//
//    //some more list ops
//
//    println("Empty list: " + Nil)
//    println("Empty list + non-empty: " + bigLst1 :: Nil)
//    println("head of list: " + bigLst1.head)
//    println("end of list: " + bigLst1.last)
//    println("list init: " + bigLst1.init)
//    println("reverse: " + bigLst1.reverse)
//
//    var bigLst2 = List(11, 12, 13, 14, 15)
//    var bigLst3 = List(bigLst1, bigLst2).flatten
//    println(bigLst3)
//
//    var bigLst4 = List('a', 'b', 'c', 'd', 'e')
//    println("Zipped lists")
//    println(bigLst2 zip bigLst4)
//    println("String view of list: " + bigLst3.mkString(" "))
//    println("+100 to all: " + (bigLst3 map (_ + 100)).mkString(" "))
//    println("Mod 2 list")
//    println(bigLst3 filter (_ % 2 == 0))
//
//    println(countWords("WIR SIND BAUMANS!! WIR SIND ENGINNEEREN"))
//
//    var sb = new ScalaBean()
//    sb.xInt_=(6)
//    sb.xString_=("Cool")
//
//    println("ScalaBean values: " + sb.xInt + " " + sb.xString)
//
//    //simulator usage
//    ConcerteSim.input1 setSignal true
//    ConcerteSim.run()
//
//    //queue usage
//    val q1 = Queue.apply(1, 2, 3)
//    println(q1)
//
//
//    // how we can use tratited queue
//    def qa(q: QueueAlter[String]) {
//
//    }
//
//    //enum iteration
//    for (c <- Color.values) println(c)
//
//    //extractor Usage
//    println(Email.unapply("abondar1992@gmail.com"))
//    println(Email.apply("desertslrc","icloud.com"))

//    SimpleActor.start()
//
//    val actor2 = actor {
//      recieve {
//        case x:Int=> println("Here is "+ x)
//      }
//      Thread.sleep(1000)
//
//    }
  }

  //enum
  object Color extends Enumeration {
    val Red: Color.Value = Value("Red")
    val Green: Color.Value = Value("Green")
    val Blue: Color.Value = Value("Blue")

  }

  def func1(x: Int, y: Int): Int = {

    val r: Int = x * y
    r

  }

  def containsOdd(nums: List[Int]): Boolean = nums.exists(_ % 2 == 1)

  //pattern matching
  def simplifyTop(expr: Expr): Expr = expr match {

    case UnOp("-", UnOp("-", e)) => e // Double -
    case BinOp("+", e, Number(0)) => e // Add zero
    case BinOp("*", e, Number(1)) => e // Multi 1
    case _ => expr


  }

  //sealed class
  def describe(e: Expr): String = (e: @unchecked) match {

    case Number(_) => "a number"
    case Var(_) => "a variable"
  }

  //get option type
  def showOption(x: Option[String]): String = x match {
    case Some(s) => s
    case None => "?"

  }

  //using mutable map for counting words
  def countWords(text: String): mutable.Map[String, Int] = {
    val counts = mutable.Map.empty[String, Int]
    for (rawWord <- text.split("[ ,!.]+")) {
      val word = rawWord.toLowerCase
      val oldCount = if (counts.contains(word)) counts(word) else 0
      counts += (word -> (oldCount + 1))

    }
    counts
  }


}
