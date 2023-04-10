package ddwu.com.mobile.week06.touchtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.EditText
import android.widget.Toast
import ddwu.com.mobile.week06.touchtest.databinding.ActivityLinearBinding
import ddwu.com.mobile.week06.touchtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // lastinit var binding : ActivityLinearBinding
    lateinit var binding : ActivityLinearBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        binding = ActivityLinearBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val Button = binding.btnDisplay.setOnClickListener {
            val str = binding.editText.getText().toString()
            binding.tvDisplay.setText(str)
        }

    }

}