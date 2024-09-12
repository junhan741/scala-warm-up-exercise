package com.rockthejvm

import scala.collection.mutable.HashMap
import scala.util.Random

class Die {
  var hashMap = HashMap(0->"East", 1->"South", 2->"West", 3->"North")
  var numofThrow = HashMap("East"->0, "South"->0, "West"->0, "North"->0)
  var totalThrow = 0

  def ThrowDie: String ={
    var random = new Random()
    var next = random.nextInt(4)
    numofThrow(hashMap(next)) += 1
    totalThrow += 1

    return hashMap(next)
  }
}
