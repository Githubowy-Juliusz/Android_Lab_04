package lab.main.olympics

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.fragment.app.Fragment
import lab.main.R

class OlympicsFragment :
	Fragment(R.layout.olympics_fragment) {
	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		val imageView = view.findViewById<ImageView>(R.id.olympicsImageView)
	}
}