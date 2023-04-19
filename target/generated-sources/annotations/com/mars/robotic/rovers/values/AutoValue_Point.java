
package com.mars.robotic.rovers.values;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Point extends Point {

  private final int location;

  AutoValue_Point(
      int location) {
    this.location = location;
  }

  @Override
  public int location() {
    return location;
  }

  @Override
  public String toString() {
    return "Point{"
        + "location=" + location
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Point) {
      Point that = (Point) o;
      return (this.location == that.location());
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= location;
    return h;
  }

}
