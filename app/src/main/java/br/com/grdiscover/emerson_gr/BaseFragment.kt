package br.com.grdiscover.emerson_gr

import android.support.annotation.StringRes
import android.support.v4.app.Fragment

abstract class BaseFragment :Fragment(){

    @StringRes
    abstract fun getTitulo() : Int
}

