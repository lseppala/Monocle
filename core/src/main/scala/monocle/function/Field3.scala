package monocle.function

import monocle._

trait Field3[S, A] {

  /** Creates a Lens from S to it is third element */
  def _3: SimpleLens[S, A]

}

object Field3 extends Field3Instances

trait Field3Instances {

  def _3[S, A](implicit ev: Field3[S, A]): SimpleLens[S, A] = ev._3

  implicit def tuple3Field3[A1, A2, A3] = new Field3[(A1, A2, A3), A3] {
    def _3 = SimpleLens[(A1, A2, A3), A3](_._3, (t, a) => t.copy(_3 = a))
  }

  implicit def tuple4Field3[A1, A2, A3, A4] = new Field3[(A1, A2, A3, A4), A3] {
    def _3 = SimpleLens[(A1, A2, A3, A4), A3](_._3, (t, a) => t.copy(_3 = a))
  }

  implicit def tuple5Field3[A1, A2, A3, A4, A5] = new Field3[(A1, A2, A3, A4, A5), A3] {
    def _3 = SimpleLens[(A1, A2, A3, A4, A5), A3](_._3, (t, a) => t.copy(_3 = a))
  }

  implicit def tuple6Field3[A1, A2, A3, A4, A5, A6] = new Field3[(A1, A2, A3, A4, A5, A6), A3] {
    def _3 = SimpleLens[(A1, A2, A3, A4, A5, A6), A3](_._3, (t, a) => t.copy(_3 = a))
  }

}