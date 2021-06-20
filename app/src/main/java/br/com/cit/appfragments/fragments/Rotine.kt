package br.com.cit.appfragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import br.com.cit.appfragments.R

class Rotine: Fragment() {

    //onCreate do fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Inflate do layout do fragment
        return inflater.inflate(R.layout.fragment_rotine,container,false)
    }

    //após o fragment ser criado
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

}