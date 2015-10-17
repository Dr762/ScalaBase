/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic.main
import scala.io.Source

object LongFile {

  def processFile(filename: String, width: Int) {

    def processLine(line: String) { //local func
      if (line.length > width)
        println(filename + ": " + line)

    }

    val source = Source.fromFile(filename)
    for (line <- source.getLines()) {

      processLine(line)
    }
}
  

}
