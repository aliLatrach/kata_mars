package com.mars.robotic.rovers.values;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

public class CoordinateShould {

    private final Point x = Point.create(2);
    private final Point y = Point.create(3);
    
    private Coordinate coordinate;
    
    @Before public void
    setUp() {
        coordinate = Coordinate.create(x,y);
    }

    @Test public void
    x_when_get_x_coordinates_from_a_point() {
        assertThat(coordinate.x(), is(Point.create(2)));
    }

    @Test public void
    y_when_get_y_coordinates_from_a_point() {
        assertThat(coordinate.y(), is(Point.create(3)));
    }

    @Test public void
    equality() {
        assertThat(Coordinate.create(x,y), equalTo(Coordinate.create(x,y)));
    }
}
