package lab.main.speedtest

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import lab.main.R

class SpeedtestFragment :
	Fragment(R.layout.speedtest_fragment) {
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val imageView = view.findViewById<ImageView>(R.id.speedTestImageView)
		val resultText =
			view.findViewById<TextView>(R.id.speedTestResultText)
		val drawButton = view.findViewById<Button>(R.id.speedTestDrawButton)

		resultText.text = ""
		val speedTester = SpeedTester(imageView)

		drawButton.setOnClickListener() {
			val time = speedTester.startTest()
			resultText.text = "It took $time ms to draw 10000 triangles"
		}
	}
}