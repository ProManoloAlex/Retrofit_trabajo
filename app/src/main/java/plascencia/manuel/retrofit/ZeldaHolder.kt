package plascencia.manuel.retrofit

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ZeldaHolder(item: View):RecyclerView.ViewHolder(item) {

    val tvTitulo = item.findViewById<TextView>(R.id.tvTitulo)
    val ivFondo = item.findViewById<ImageView>(R.id.ivFondo)
    val tvTipo = item.findViewById<TextView>(R.id.tvTipo)

}