package br.com.cit.appfragments.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import br.com.cit.appfragments.R

class Hobbies: Fragment() {

    //onCreate do fragment
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //Inflate do layout do fragment
        return inflater.inflate(R.layout.fragment_hobbies,container,false)
    }

    //após o fragment ser criado
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //Obtendo o argumento enviado para o fragment
        val bundle = arguments
        if (bundle != null) {
            val msg = bundle.get("MSG")
            Toast.makeText(view.context, msg.toString(), Toast.LENGTH_LONG).show()
        }

    }

}