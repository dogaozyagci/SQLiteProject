package com.example.sqliteproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sqliteproject.databinding.FragmentDetailBinding


class DetailFragment : Fragment() {
    lateinit var binding : FragmentDetailBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentDetailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonAdd.setOnClickListener {
            kaydet(it)
        }
        binding.imageView.setOnClickListener {
            addPhoto(it)
        }

    }

    fun kaydet(view: View){
        println("tıklandı")
    }

    fun addPhoto(view: View){
        println("görsel tıklandı")
    }


}