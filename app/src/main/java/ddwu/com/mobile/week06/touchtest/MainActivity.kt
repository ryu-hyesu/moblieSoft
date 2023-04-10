package ddwu.com.mobile.week06.touchtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Toast
import ddwu.com.mobile.week06.touchtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button2

        // val clickEvent = ClickEvent()

//        binding.button2.setOnClickListener(object : View.OnClickListener {
//            // 이벤트 헨들러
//            override fun onClick(view: View?) {
//                Toast.makeText(this@MainActivity, "down!", Toast.LENGTH_SHORT).show()
//            }
//        })

        // setOn~ 리스너는 인터페이스에서 객체를 바로 생성할 수 있다는 걸 암묵적으로 함의하고 있기 때문에(다른 함수가 들어올 수 없다.)
        // 해당하는 리스너의 인터페이스의 규칙 없이 람다함수 형식으로 생성할 수 있다.
        // single abstract method (SAM)
        binding.button2.setOnClickListener{
                Toast.makeText(this@MainActivity, "down!", Toast.LENGTH_SHORT).show()
        }

    }

    fun onMyClick(view: View?){
        Toast.makeText(this, "on My Click!", Toast.LENGTH_SHORT).show()
    }

    // 이벤트 리스너
    // 인터페이스는 선언만 있기 때문에 구현하는 class를 만들어 내용을 채워야 한다.
    inner class ClickEvent : View.OnClickListener {
        // 이벤트 헨들러
        override fun onClick(view: View?) {
            Toast.makeText( this@MainActivity, "down!", Toast.LENGTH_SHORT ).show()
        }
    }

    // long click
    inner class longClicEvent : View.OnLongClickListener {
        override fun onLongClick(p0: View?): Boolean {
            TODO("Not yet implemented")
        }

    }



//    override fun onTouchEvent(event: MotionEvent?): Boolean {
//
//        when(event?.action){
//            MotionEvent.ACTION_DOWN ->
//                Toast.makeText( this, "down!", Toast.LENGTH_SHORT ).show()
//            MotionEvent.ACTION_UP ->
//                Toast.makeText( this, "up!", Toast.LENGTH_SHORT ).show()
//        }
//        return super.onTouchEvent(event)
//    }
}