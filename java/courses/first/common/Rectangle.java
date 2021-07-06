package courses.first.common;

public class Rectangle {
  public int x;
  public int y;
  public int width;
  public int height;

  public Rectangle() {
    x = 0;
    y = 0;
    width = 0;
    height = 0;
  }

  public Rectangle(int width, int height) {
    this.width = width;
    this.height = height;
  }

  public Rectangle(int x, int y, int width, int height) {
    this.x = x;
    this.y = y;
    this.width = width;
    this.height = height;
  }

  public int surface () {
    return width * height;
  }

  public void displace(int dx, int dy) {
    x += dx;
    y += dy;
  }

  public boolean indoors(int x1, int y1) {
    if ((x1 > x && x1 < x + width) && (y1 > y && y1 < y + width)) {
      return true;
    }
    return false;
  }
}
