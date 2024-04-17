package plascencia.manuel.retrofit

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.launch
import plascencia.manuel.retrofit.API.ApiRepository

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        lifecycleScope.launch {
            try {
                val response = ApiRepository().fetchContents()
                Log.d("API","recibido: $response")
            }catch (ex:Exception){
                Log.e("ERROR API", "${ex.message}")
            }

        }

    }
}