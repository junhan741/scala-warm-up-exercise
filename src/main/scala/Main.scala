package com.rockthejvm
import scala.collection.mutable
import scala.collection.mutable.HashMap
import scala.util.Random

@main def hello() = {
  var dimension = 100
  var Skippy = new Kangaroo
  var grid = new Grid(dimension)

  while (!Skippy.IsHome(grid)) {
    Skippy.ThrowDie(grid)
  }

  println("totalThrows: " + Skippy.GetTotalThrow)
  println("North: " + Skippy.GetNumofThrow("North"))
  println("South: " + Skippy.GetNumofThrow("South"))
  println("West: " + Skippy.GetNumofThrow("West"))
  println("East: " + Skippy.GetNumofThrow("East"))
}