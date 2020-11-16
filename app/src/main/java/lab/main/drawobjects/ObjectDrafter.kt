package lab.main.drawobjects

import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.RectShape
import android.widget.ImageView
import kotlin.random.Random

class ObjectDrafter(
	private val width: Int,
	private val height: Int,
	imageView: ImageView
) {
	private val bitmap =
		Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
	private val canvas = Canvas(bitmap)

	init {
		imageView.background = BitmapDrawable(bitmap)
	}

	private fun drawRect() {
		val rect = ShapeDrawable(RectShape())
		val left = Random.nextInt(5, width - 50)
		val top = Random.nextInt(5, height - 50)
		val right = Random.nextInt(left + 5, width - 5)
		val bottom = Random.nextInt(top + 5, height - 5)
		rect.setBounds(left, top, right, bottom)
		rect.paint.color = Random.nextInt()
		rect.draw(canvas)
	}

	private fun drawOval() {
		val oval = ShapeDrawable(OvalShape())
		val left = Random.nextInt(5, width - 50)
		val top = Random.nextInt(5, height - 50)
		val right = Random.nextInt(left + 5, width - 5)
		val bottom = Random.nextInt(top + 5, height - 5)
		oval.setBounds(left, top, right, bottom)
		oval.paint.color = Random.nextInt()
		oval.draw(canvas)
	}

	private fun drawCircle() {
		val paint = Paint()
		paint.color = Random.nextInt()
		val centerx = Random.nextInt(5, width).toFloat()
		val centery = Random.nextInt(5, height).toFloat()
		val radius =
			Random.nextInt(4, ((width - centerx + height - centery) / 2).toInt() - 10)
		canvas.drawCircle(centerx, centery, radius.toFloat(), paint)
	}

	private fun drawLine() {
		val begin =
			Point(Random.nextInt(5, width - 50), Random.nextInt(5, height - 50))
		val end = Point(
			Random.nextInt(begin.x + 5, width - 5),
			Random.nextInt(begin.y + 5, height - 5)
		)
		val paint = Paint()
		paint.color = Random.nextInt()
		canvas.drawLine(
			begin.x.toFloat(),
			begin.y.toFloat(),
			end.x.toFloat(),
			end.y.toFloat(),
			paint
		);
	}

	private fun drawArc() {
		val left = Random.nextInt(5, width - 50).toFloat()
		val top = Random.nextInt(5, height - 50).toFloat()
		val right = Random.nextInt(left.toInt() + 5, width - 5).toFloat()
		val bottom = Random.nextInt(top.toInt() + 5, height - 5).toFloat()
		val startAngle = Random.nextInt(0, 330).toFloat()
		val sweepAngle = Random.nextInt(startAngle.toInt() + 10, 360).toFloat()
		val paint = Paint()
		paint.color = Random.nextInt()
		canvas.drawArc(
			left,
			top,
			right,
			bottom,
			startAngle,
			sweepAngle,
			true,
			paint
		)
	}

	fun draw() {
		val paint = Paint()
		paint.color = Color.WHITE
		canvas.drawPaint(paint)
		drawRect()
		drawRect()
		drawOval()
		drawOval()
		drawCircle()
		drawCircle()
		drawArc()
		drawArc()
		drawLine()
		drawLine()
		drawLine()
	}
}