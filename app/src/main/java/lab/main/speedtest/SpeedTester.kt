package lab.main.speedtest

import android.widget.ImageView
import kotlin.system.measureTimeMillis

class SpeedTester(imageView: ImageView) {
	val drafter = TriangleDrafter(500, 500, imageView)
	fun startTest(): Long {
		return measureTimeMillis {
			for(i in (0..10000))
				drafter.drawRandom()
		}
	}
}