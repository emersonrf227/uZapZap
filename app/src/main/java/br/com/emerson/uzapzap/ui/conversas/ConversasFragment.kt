package br.com.emerson.uzapzap.ui.conversas


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import br.com.emerson.uzapzap.R
import br.com.emerson.uzapzap.ui.base.BaseFragment


class ConversasFragment : BaseFragment() {
    override fun getTitulo(): Int {
        return R.string.tab_conversas
    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_conversas, container, false)
    }


}
