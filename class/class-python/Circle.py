class Circle(object):

    def __init__(self, r=0.0, x=0.0, y=0.0):
        self.x = x
        self.y = y
        self.r = r

    def to_write(self):
        print("x =", self.x, ", y  =", self.y, ", r =", self.r)

    @staticmethod
    def greater_than_two(circle1, circle2):
        if circle1.r > circle2.r:
            return circle1
        else:
            return circle2

    def circumference(self):
        return 2 * 3.14159 * self.r

    def surface(self):
        return 3.14159 * self.r * self.r


circle1 = Circle(50)
circle2 = Circle(100)
circle3 = Circle(300)
circle4 = Circle()
circle5 = Circle()

circle4 = Circle.greater_than_two(circle1, circle3)
circle5 = Circle.greater_than_two(circle1, circle4);

circle1.to_write()
circle2.to_write()
circle3.to_write()
circle4.to_write()
circle5.to_write()

