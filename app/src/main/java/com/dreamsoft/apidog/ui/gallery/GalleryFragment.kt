package com.dreamsoft.apidog.ui.gallery


import android.os.Bundle

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.dreamsoft.apidog.R


class GalleryFragment : Fragment() {

    private lateinit var galleryViewModel: GalleryViewModel




    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        galleryViewModel =
                ViewModelProviders.of(this).get(GalleryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_gallery, container, false)
        //val textView: TextView = root.findViewById(R.id.text_gallery)
        galleryViewModel.text.observe(viewLifecycleOwner, Observer {
           // textView.text = it
        })
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //viewmodel

        }


    }







/*
* Seguir trabajando....revisar lo que se implemento el objeto, mostrar por consola el objeto creado
* c-01-01-20
* no envia el nombre de la operacion c-14-11-20, creo que es porque estoy creando el objeto por el patron,
* quizas deba obtener el objeto c-14-11-20 revisar!
* seguir revisando lo que no envia el nombre, los reportes van funcionando bien c-21-11-20
* */