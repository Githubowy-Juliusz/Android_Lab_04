package lab.main.drawobjects

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import androidx.fragment.app.Fragment
import lab.main.R

class DrawObjectsFragment :
	Fragment(R.layout.draw_objects_fragment) {
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)

		val imageView = view.findViewById<ImageView>(R.id.drawObjectsImageView)
		val drawButton = view.findViewById<Button>(R.id.drawObjectsDrawButton)
		drawButton.setOnClickListener {
			print("click")
		}
	}
}