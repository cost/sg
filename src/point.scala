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
}
