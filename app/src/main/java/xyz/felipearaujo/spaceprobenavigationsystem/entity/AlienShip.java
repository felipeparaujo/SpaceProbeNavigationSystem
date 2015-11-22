package xyz.felipearaujo.spaceprobenavigationsystem.entity;

import android.graphics.Point;

import com.google.common.collect.ImmutableMap;

import xyz.felipearaujo.spaceprobenavigationsystem.repository.datasource.AlienTrackingServiceContract;

public class AlienShip {
  public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST
  }

  private Direction mCurrentDirection = Direction.NORTH;
  private Point mPosition;

  public AlienShip(Point initial) {
    this.mPosition = initial;
  }

  public Direction getCurrentDirection() {
    return mCurrentDirection;
  }

  public void setCurrentDirection(Direction currentDirection) {
    mCurrentDirection = currentDirection;
  }

  public Point getPosition() {
    return mPosition;
  }

  public void setPosition(Point position) {
    mPosition = position;
  }

  public void resetShip() {
    mPosition.x = 0;
    mPosition.y = 0;
    mCurrentDirection = Direction.NORTH;
  }
}
