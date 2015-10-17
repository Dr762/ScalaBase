/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic.main.typeparam


// another variant of queue definition
// here queue class is private and we use trait taking a type param.
// we can use this impl for setting param queues  
trait QueueAlter[T]{
  def head:T
  def tail:Queue[T]
  def enqueue(x:T): Queue[T]
    
}
  
object QueueAlter{
  
  def apply[T](xs:T*)= new Queue[T](xs.toList,Nil) //factory method to add
  
  private class QueueImpl[T](
    private val leading: List[T],
    private val trailing: List[T]
  ) {
    //queue data struct impl  
    def this() = this(Nil,Nil) 
  
  
    private def mirror = if (leading.isEmpty) new QueueImpl[T](trailing.reverse, Nil)
    else this

    def head: T = mirror.leading.head
    def tail: QueueImpl[T] = {
      val q = mirror
      new QueueImpl(q.leading.tail,q.trailing)
    
    }
  
    def enqueue(x:T) = new QueueImpl(leading,x :: trailing)
  }
}
