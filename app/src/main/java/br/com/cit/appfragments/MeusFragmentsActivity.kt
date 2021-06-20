package br.com.cit.appfragments

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import br.com.cit.appfragments.fragments.Rotine
import br.com.cit.appfragments.fragments.Hobbies
import kotlinx.android.synthetic.main.activity_main.btFragment1
import kotlinx.android.synthetic.main.activity_main.btFragment2

class MeusFragmentsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadRotineFragment()

        btFragment1.setOnClickListener {
            loadRotineFragment()
        }

        btFragment2.setOnClickListener {
            loadHobbiesFragment()
        }

    }

    private fun loadRotineFragment() {

        //Carrega o fragment
        val fragment = Rotine()
        supportFragmentManager.beginTransaction()
                .replace(R.id.containerFragment, fragment)
                .commit()

        //Muda as cores dos botões
        btFragment1.setTextColor(ContextCompat.getColor(this, R.color.black))
        btFragment2.setTextColor(ContextCompat.getColor(this, R.color.white))
    }

    private fun loadHobbiesFragment() {
        //Muda as cores dos botões
        btFragment1.setTextColor(ContextCompat.getColor(this, R.color.white))
        btFragment2.setTextColor(ContextCompat.getColor(this, R.color.black))

        //Carrega o fragment passando parâmetros para o fragment
        val fragment = Hobbies()


        supportFragmentManager.beginTransaction()
                .replace(R.id.containerFragment, fragment)
                .commit()

    }


}