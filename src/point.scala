/*
 *  2d Point class
 *  @x - x coordinate
 *  @y - y coordinate
 */
class Point {
    // x coordinate
    private var xCoord : Int = 0
    // y coordinate
    private var yCoord : Int = 0
	
    def this(x : Int, y : Int){
	this()
	this.xCoord = x
	this.yCoord = y
    }
	
    // x getter
    def x() =
        this.xCoord

    // y getter
    def y() =
	this.yCoord
	
    //move point
    def movePoint(newX : Int, newY : Int) = {
	xCoord = newX
	yCoord = newY
    }
    
    // range between 2 point
    def range(p1 : Point, p2 : Point) = {
        var sqr = (x : Int) => x * x
	sqrt(sqr.apply(p1.x - p2.x) - sqr.apply(p1.y - p2.y))
    }
}
