
package com.mars.robotic.rovers.values;

import java.util.Collection;
import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
final class AutoValue_Obstacles extends Obstacles {

  private final Collection<Coordinate> obstacles;

  AutoValue_Obstacles(
      Collection<Coordinate> obstacles) {
    if (obstacles == null) {
      throw new NullPointerException("Null obstacles");
    }
    this.obstacles = obstacles;
  }

  @Override
  public Collection<Coordinate> obstacles() {
    return obstacles;
  }

  @Override
  public String toString() {
    return "Obstacles{"
        + "obstacles=" + obstacles
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof Obstacles) {
      Obstacles that = (Obstacles) o;
      return (this.obstacles.equals(that.obstacles()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= obstacles.hashCode();
    return h;
  }

}
