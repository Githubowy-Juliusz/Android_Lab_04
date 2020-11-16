package lab.main.speedtest

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Point
import android.graphics.drawable.BitmapDrawable
import android.widget.ImageView
import kotlin.random.Random

class TriangleDrafter(
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

	fun drawRandom() {
		TriangleShape(
			Point(Random.nextInt(0, width), Random.nextInt(0, height)),
			Point(Random.nextInt(0, width), Random.nextInt(0, height)),
			Point(Random.nextInt(0, width), Random.nextInt(0, height)),
			Random.nextInt()
		).draw(canvas)

		// set bitmap as background to ImageView
		//imageV.background = BitmapDrawable(bitmap)
	}
}