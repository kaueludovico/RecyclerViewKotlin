package com.bigrocket.recyclerviewkotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.bigrocket.recyclerviewkotlin.models.Profile
import kotlinx.android.synthetic.main.res_item_profile.view.*

class ProfileAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    private lateinit var items: List<Profile>

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ProfileViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.res_item_profile, parent, false)
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is ProfileViewHolder -> {
                holder.bind(items[position])
            }
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    fun setDataSet(list: List<Profile>) {
        this.items = list
    }

    class ProfileViewHolder constructor(
        itemView: View
    ) : RecyclerView.ViewHolder(itemView) {
        private val profileName = itemView.name
        private val profileLanguage = itemView.language
        private val profileImage = itemView.image

        fun bind(profile: Profile) {
            profileName.text = profile.name
            profileLanguage.text = profile.languagem
            profileImage.setImageResource(profile.image)
        }
    }
}