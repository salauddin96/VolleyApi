package org.techtales.volleyapi

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import de.hdodenhof.circleimageview.CircleImageView

class Adapter (val context: Context, val userInfo: UserInfo): RecyclerView.Adapter<Adapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter.ViewHolder {
       val view = LayoutInflater.from(context).inflate(R.layout.user_item, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return userInfo.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        Glide.with(context).load(userInfo.get(position).avatar_url).into(holder.image)

    }
    class  ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val image = itemView.findViewById<CircleImageView>(R.id.circleImageView)
        val name = itemView.findViewById<TextView>(R.id.nameTxt)

    }
}