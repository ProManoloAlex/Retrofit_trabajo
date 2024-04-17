package plascencia.manuel.retrofit

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import plascencia.manuel.retrofit.API.ZeldaItem

class ZeldaAdapter(private val lista: List<ZeldaItem>) : RecyclerView.Adapter<ZeldaHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ZeldaHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.elemento_ind, parent, false)
        return ZeldaHolder(view)
    }

    override fun onBindViewHolder(holder: ZeldaHolder, position: Int) {
        val item = lista[position]
        holder.tvTitulo.text = item.name // Asume que ZeldaItem tiene una propiedad 'nombre'
        holder.tvTipo.text = item.image // Asume que ZeldaItem tiene una propiedad 'tipo'
        // Aquí puedes configurar ivFondo con una imagen usando Glide o Picasso
        Glide.with(holder.itemView.context)
            .load(item.image)
            .into(holder.ivFondo)


    }

    override fun getItemCount(): Int {
        return lista.size
    }
}