import kotlin.math.atan


class Point(val x: Double, val y: Double) {
    fun AngleToX(): Double{
        val angle = Math.toDegrees(atan(y/x))
        return angle
    }
}