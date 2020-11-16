package lab.main.olympics

import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.widget.ImageView

class OlympicsDrafter(
	private val width: Int,
	private val height: Int,
	imageView: ImageView
) {
	private val bitmap =
		Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
	private val canvas = Canvas(bitmap)
	private val radius = 30f

	init {
		imageView.background = BitmapDrawable(bitmap)
	}

	private fun drawCircle(centerx: Float, centery: Float, color: Int) {
		val paint = Paint()
		paint.color = color
		paint.style = Paint.Style.STROKE
		paint.strokeWidth = 3f
		canvas.drawCircle(centerx, centery, radius, paint)
	}

	private fun drawText(center: Point) {
		val paint = Paint()
		val textSize = 36f
		paint.color = Color.BLACK
		paint.textSize = textSize
		canvas.drawText(
			"Tokyo 2020",
			center.x.toFloat() - textSize * 2,
			center.y.toFloat() + radius * 3,
			paint
		)
	}

	fun draw() {
		val center = Point(width / 2, height / 2)
		drawCircle(center.x - radius * 1.25f, center.y - radius * 1.25f, Color.BLUE)
		drawCircle(center.x.toFloat(), center.y - radius * 1.25f, Color.BLACK)
		drawCircle(center.x + radius * 1.25f, center.y - radius * 1.25f, Color.RED)
		drawCircle(center.x - radius * 0.75f, center.y.toFloat(), Color.YELLOW)
		drawCircle(center.x + radius * 0.75f, center.y.toFloat(), Color.GREEN)
		drawText(center)
	}
}