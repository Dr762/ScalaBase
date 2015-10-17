/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic.main.siumulation

object ConcerteSim extends CircuitSimulation{
 def InverterDelay = 1
 def AndGateDelay = 4
 def OrGateDelay = 5
  
  val input1,input2,sum,carry = new Wire
  probe("sum",sum)
  probe("carry",carry)
  
} 




