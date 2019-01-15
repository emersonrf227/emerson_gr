package br.com.grdiscover.emerson_gr

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_home -> {
                message.setText(R.string.title_home)
               return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_aportes -> {
                message.setText(R.string.title_aportes)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_resgates -> {
                message.setText(R.string.title_resgates)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_extrato -> {
                message.setText(R.string.title_extrato)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }
}
