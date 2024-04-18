package plascencia.manuel.retrofit

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch
import plascencia.manuel.retrofit.API.ApiRepository

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ZeldaAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)

        lifecycleScope.launch {
            try {
                val response = ApiRepository().fetchContents()
                adapter = ZeldaAdapter(response)
                recyclerView.adapter = adapter
                Log.d("API","recibido: $response")
            }catch (ex:Exception){
                Log.e("ERROR API", "${ex.message}")
            }
        }
    }
}