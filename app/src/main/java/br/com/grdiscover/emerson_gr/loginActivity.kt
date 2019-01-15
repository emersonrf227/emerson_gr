package br.com.grdiscover.emerson_gr

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.grdiscover.emerson_gr.fragment.homeFragment.HomeFragment
import kotlinx.android.synthetic.main.activity_login.*

class loginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        btnIdEnviar.setOnClickListener {
            val proximaTela = Intent(this, Molde::class.java)
            startActivity(proximaTela)
        }







    }
}
