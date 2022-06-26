package com.example.analys

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_second.*


class SecondFragment : Fragment(R.layout.fragment_second) {

    private val natija = 0.0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        arguments.let {
            if (it != null) {
                val natija = it.getDouble("natija")
                if (natija != null) {
                    natijaText.text = "$natija%"
                    if (natija <= 30.0) {
                        natijaDarajaText.text = "Xavf darajasi pas"
                    }else if (natija > 30.0 && 80.0 >= natija) {
                        natijaDarajaText.text = "Xavf darajasi o'rtacha"
                    }else{
                        natijaDarajaText.text = "Xavf darajasi yuqori"
                    }
                }
            }

        }

    }

    override fun onDestroyView() {
        super.onDestroyView()

    }

    override fun onDestroy() {
        super.onDestroy()

    }
}