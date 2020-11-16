package lab.main.speedtest

import android.graphics.Canvas
import android.graphics.Paint
import android.graphics.Path
import android.graphics.Path.FillType
import android.graphics.Point


class TriangleShape(a: Point, b: Point, c: Point, color: Int) {
	private val paint = Paint()
	private val path = Path()

	init {
		paint.setColor(color)
		path.fillType = FillType.EVEN_ODD
		path.moveTo(b.x.toFloat(), b.y.toFloat())
		path.lineTo(c.x.toFloat(), c.y.toFloat())
		path.lineTo(a.x.toFloat(), a.y.toFloat())
		path.close()
	}

	fun draw(canvas: Canvas) {
		canvas.drawPath(path, paint)
	}
}