package com.rockthejvm

import java.security.DigestException
import java.text.DecimalFormat

class Kangaroo {
  var crtPoint:Point = new Point(0,0)
  var die:Die = new Die()

  def ThrowDie(grid: Grid): Unit ={
    var direction = die.ThrowDie
    ChangePoint(direction, grid)
  }

  protected def ChangePoint(direction:String, grid: Grid): Unit ={
    if(direction == "North"){
      if(crtPoint.y != grid.dimension-1)
        crtPoint.y += 1
    }
    else if(direction == "South"){
      if(crtPoint.y != 0)
        crtPoint.y -= 1
    }
    else if(direction == "West"){
      if(crtPoint.x != 0)
        crtPoint.x -= 1
    }
    else if(direction == "East"){
      if(crtPoint.x != grid.dimension-1)
        crtPoint.x += 1
    }
  }

  def IsHome(grid: Grid): Boolean ={
    if(crtPoint.x == grid.dimension-1 && crtPoint.y == grid.dimension-1) true else false
  }

  def GetNumofThrow(direction:String):String = {
    val percentage = die.numofThrow(direction).toDouble/die.totalThrow * 100
    val df = new DecimalFormat("#.0")
    val ret = df.format(percentage)+"%"

    return ret
  }

  def GetTotalThrow:Int = {
    return die.totalThrow
  }
}
