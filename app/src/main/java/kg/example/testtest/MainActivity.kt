package kg.example.testtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kg.example.testtest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initClicer()
    }

    private fun initClicer(){
        with(binding){

            btn.setOnClickListener{
                var fisrtNum = firtEd.text.toString()
                var secondNum = secondEd.text.toString()
                val math = Math()
                result.text = math.divide(fisrtNum, secondNum)
            }

        }
    }
}