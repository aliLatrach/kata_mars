package com.mars.robotic.rovers.entities;

import com.mars.robotic.rovers.values.Coordinate;
import com.mars.robotic.rovers.values.Obstacles;
import com.mars.robotic.rovers.values.Point;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class WorldShould {

    private final Point x = Point.create(3);
    private final Point y = Point.create(4);
    private final Point xLimit = Point.create(9);
    private final Point yLimit = Point.create(9);

    private World world;

    @Before public void
    setUp() {
        world = new World(Coordinate.create(xLimit, yLimit), Obstacles.empty());
    }

    @Test public void
    get_rover_position_when_has_not_rover() {
        world.addRover(Coordinate.create(x,y));
        assertThat(world.roverPosition(), is(Coordinate.create(x,y)));
    }

    @Test(expected = IllegalStateException.class) public void
    throw_exception_when_get_rover_position_and_has_not_rover() {
        world.roverPosition();
    }

    @Test public void
    get_limits() {
        assertThat(world.limit(), is(Coordinate.create(xLimit,yLimit)));
    }

    @Test public void
    update_rover_position() {
        world.addRover(Coordinate.create(x,y));
        world.updateRover(Coordinate.create(x.increase(),y.increase()));
        assertThat(world.roverPosition(), is(Coordinate.create(x.increase(), y.increase())));
    }

    @Test(expected = IllegalStateException.class) public void
    throws_exception_when_update_rover_position_and_has_Not_rover() {
        world.updateRover(Coordinate.create(x.increase(), y.increase()));
    }

}
