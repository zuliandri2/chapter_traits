import scala.collection.mutable.ArrayBuffer

object chapter_traits {

  def main(args: Array[String]): Unit = {

    val t = new IntIterator(10)
    println(t.next())
    println(t.next())

    val dog = new Dog("Sinta")
    val cat = new Cat("Carrye")

    val animals = ArrayBuffer.empty[Pet]
    animals.append(dog)
    animals.append(cat)
    animals.foreach(i => println(i.name))
  }

}


trait hairColor

trait Iterator[A] {

  def hasNext: Boolean
  def next(): A
}


class IntIterator(to: Int) extends Iterator[Int] {

  private var current = 0

  override def hasNext: Boolean = current < to

  override def next(): Int = {
    if (hasNext) {
      val t = current
      current += 1
      t
    } else 0
  }

}