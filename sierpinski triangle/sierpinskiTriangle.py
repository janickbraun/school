import random
import turtle as t

dots = []
pyramid_size = 600
pen_size = 2
def setup():
    t.bgcolor("black")
    t.speed(0)
    t.color('green')
    t.penup()
    t.forward(300)
    t.right(90)
    t.forward(150)
    t.left(90)
    t.pensize(pen_size)
    dot()

    t.back(pyramid_size)
    dot()
    t.left(60)
    t.forward(pyramid_size)
    dot()

def dot():
    t.pendown()
    t.forward(0)
    t.penup()
    dots.append(t.pos())

def get_random_corner_point():
    return dots[random.randint(0, 2)]

def point_on_triangle(pt1, pt2, pt3):
    """
    Random point on the triangle with vertices pt1, pt2 and pt3.
    """
    x, y = random.random(), random.random()
    q = abs(x - y)
    s, z, u = q, 0.5 * (x + y - q), 1 - 0.5 * (q + x + y)
    return (
        s * pt1[0] + z * pt2[0] + u * pt3[0],
        s * pt1[1] + z * pt2[1] + u * pt3[1],
    )

def midpoint(x1, y1, x2, y2):
    return (x1 + x2) / 2, (y1 + y2) / 2



if __name__ == '__main__':
    setup()
    # go to random point in triangle
    t.goto(point_on_triangle(dots[0], dots[1], dots[2]))
    dot()

    for i in range(0, 100_000_000):
        t.title(str(i + 1))
        current = t.pos()
        ran = get_random_corner_point()
        t.goto(midpoint(current[0], current[1], ran[0], ran[1]))
        dot()

    t.hideturtle()
    t.done()
    print("Done")