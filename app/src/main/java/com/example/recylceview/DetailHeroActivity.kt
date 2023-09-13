package com.example.recylceview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.bumptech.glide.Glide
import com.example.recylceview.databinding.ActivityDetailHeroBinding
import com.example.recylceview.model.dataHeroes

class DetailHeroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailHeroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHeroBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data = intent.getParcelableExtra<dataHeroes>("DATA")
//        if (data != null){
//            Log.d("DATAKU", data.name)
//        }
        Glide.with(this)
            .load(data!!.image)
            .into(binding.imgProfile)

        binding.tvName.text = data?.name
        binding.tvDescription.text=data?.description
    }
}