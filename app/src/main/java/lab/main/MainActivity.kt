package lab.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import lab.main.drawobjects.DrawObjectsFragment
import lab.main.olympics.OlympicsFragment
import lab.main.speedtest.SpeedtestFragment

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val drawObjectsFragment = DrawObjectsFragment()
		val speedtestFragment = SpeedtestFragment()
		val olympicsFragment = OlympicsFragment()
		val buttonToObjectDrawing = findViewById<Button>(R.id.mainToObjectsButton)
		val buttonToSpeedtest = findViewById<Button>(R.id.mainToSpeedtest)
		val buttonToOlympics = findViewById<Button>(R.id.mainToOlympicsButton)

		supportFragmentManager.beginTransaction().apply {
			replace(R.id.frameLayout, speedtestFragment)
			commit()
		}
		buttonToSpeedtest.visibility = View.GONE

		buttonToObjectDrawing.setOnClickListener {
			buttonToSpeedtest.visibility = View.VISIBLE
			buttonToOlympics.visibility = View.VISIBLE
			buttonToObjectDrawing.visibility = View.GONE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, drawObjectsFragment)
				commit()
			}
		}
		buttonToSpeedtest.setOnClickListener {
			buttonToObjectDrawing.visibility = View.VISIBLE
			buttonToOlympics.visibility = View.VISIBLE
			buttonToSpeedtest.visibility = View.GONE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, speedtestFragment)
				commit()
			}
		}
		buttonToOlympics.setOnClickListener {
			buttonToObjectDrawing.visibility = View.VISIBLE
			buttonToSpeedtest.visibility = View.VISIBLE
			buttonToOlympics.visibility = View.GONE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, olympicsFragment)
				commit()
			}
		}
	}
}