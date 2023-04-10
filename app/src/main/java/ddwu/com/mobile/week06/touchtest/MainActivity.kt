package ddwu.com.mobile.week06.touchtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        when(event?.action){
            MotionEvent.ACTION_DOWN ->
                Toast.makeText( this, "down!", Toast.LENGTH_SHORT ).show()
            MotionEvent.ACTION_UP ->
                Toast.makeText( this, "up!", Toast.LENGTH_SHORT ).show()
        }
        return super.onTouchEvent(event)
    }
}