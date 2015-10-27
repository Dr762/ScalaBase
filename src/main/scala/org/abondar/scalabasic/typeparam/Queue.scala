/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.abondar.scalabasic.typeparam

class Queue[T](
  private[this] var leading: List[T],
  private[this] var trailing: List[T]
) {
  //queue data struct impl  
  def this() = this(Nil,Nil) 
  
  
  private def mirror() = if (leading.isEmpty) {
     while(!trailing.isEmpty){
       leading = trailing.head :: leading
       trailing = trailing.tail 
     }
  }
 

  def head :T ={
    
    mirror()
    leading.head
  }
  def tail: Queue[T] = {
    mirror()
    new Queue(leading.tail,trailing)
    
  }
  
  def enqueue[U>:T](x:U) = new Queue[U](leading,x :: trailing)
}
 
object Queue{
  
  def apply[T](xs:T*)= new Queue[T](xs.toList,Nil) //factory method to add
}