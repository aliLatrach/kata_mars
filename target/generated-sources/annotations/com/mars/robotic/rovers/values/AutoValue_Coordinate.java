
package com.mars.robotic.rovers.values;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Coordinate extends Coordinate {

  private final Point x;
  private final Point y;

  AutoValue_Coordinate(
      Point x,
      Point y) {
    if (x == null) {
      throw new NullPointerException("Null x");
    }
    this.x = x;
    if (y == null) {
      throw new NullPointerException("Null y");
    }
    this.y = y;
  }

  @Override
  public Point x() {
    return x;
  }

  @Override
  public Point y() {
    return y;
  }

  @Override
  public String toString() {
    return "Coordinate{"
        + "x=" + x + ", "
        + "y=" + y
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Coordinate) {
      Coordinate that = (Coordinate) o;
      return (this.x.equals(that.x()))
           && (this.y.equals(that.y()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= x.hashCode();
    h *= 1000003;
    h ^= y.hashCode();
    return h;
  }

}
