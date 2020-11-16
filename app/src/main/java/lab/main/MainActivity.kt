package lab.main

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import lab.main.drawobjects.DrawObjectsFragment
import lab.main.speedtest.SpeedtestFragment

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		val drawObjectsFragment = DrawObjectsFragment()
		val speedtestFragment = SpeedtestFragment()
		val buttonToWordstest = findViewById<Button>(R.id.mainToObjectsButton)
		val buttonToHangman = findViewById<Button>(R.id.mainToSpeedtest)

		supportFragmentManager.beginTransaction().apply {
			replace(R.id.frameLayout, drawObjectsFragment)
			commit()
		}
		buttonToWordstest.visibility = View.GONE

		buttonToWordstest.setOnClickListener {
			buttonToWordstest.visibility = View.GONE
			buttonToHangman.visibility = View.VISIBLE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, drawObjectsFragment)
				commit()
			}
		}
		buttonToHangman.setOnClickListener {
			buttonToWordstest.visibility = View.VISIBLE
			buttonToHangman.visibility = View.GONE
			supportFragmentManager.beginTransaction().apply {
				replace(R.id.frameLayout, speedtestFragment)
				commit()
			}
		}
	}
}