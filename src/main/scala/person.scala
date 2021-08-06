object main
{
  def main(args: Array[String]): Unit = {
    val personOne = new Person("test", 24)
    val personTwo = new Person("testagain", 25)
    println(personOne < personTwo)

  }
}

class Person(val name: String, val age: Int) extends Ordered[Person]{
  def compare(that: Person): Int = {
    val res = this.name compare that.name
    if (res == 0) {
      if(this.age > that.age){
        1
      }
      else{
        -1
      }
    }
    else if (this.name.length < that.name.length){
      -1
    }
    else{
      1
    }

  }
}
