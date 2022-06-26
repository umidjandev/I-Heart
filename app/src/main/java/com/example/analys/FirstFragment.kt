package com.example.analys


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_first.*


class FirstFragment : Fragment(R.layout.fragment_first) {

    private var cardView1Visibility = true
    private var cardView2Visibility = true
    private var cardView3Visibility = true
    private var cardView4Visibility = true
    private var cardView5Visibility = true
    private var cardView6Visibility = true
    private var cardView7Visibility = true

    private var natija = 0.0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        cardView1.setOnClickListener {
            if (cardView1Visibility) {
                linearLayout1.visibility = View.VISIBLE
                cardView1Visibility = false
            }else{
                linearLayout1.visibility = View.GONE
                cardView1Visibility = true
            }
        }

        cardView2.setOnClickListener {
            if (cardView2Visibility) {
                linearLayout2.visibility = View.VISIBLE
                cardView2Visibility = false
            }else {
                linearLayout2.visibility = View.GONE
                cardView2Visibility = true
            }
        }

        cardView3.setOnClickListener {
            if (cardView3Visibility) {
                linearLayout3.visibility = View.VISIBLE
                cardView3Visibility = false
            }else{
                linearLayout3.visibility = View.GONE
                cardView3Visibility = true
            }
        }

        cardView4.setOnClickListener {
            if (cardView4Visibility) {
                linearLayout4.visibility = View.VISIBLE
                cardView4Visibility = false
            }else{
                linearLayout4.visibility = View.GONE
                cardView4Visibility = true
            }
        }

        cardView5.setOnClickListener {
            if (cardView5Visibility) {
                linearLayout5.visibility = View.VISIBLE
                cardView5Visibility = false
            }else{
                linearLayout5.visibility = View.GONE
                cardView5Visibility = true
            }
        }

        cardView6.setOnClickListener {
            if (cardView6Visibility) {
                linearLayout6.visibility = View.VISIBLE
                cardView6Visibility = false
            }else{
                linearLayout6.visibility = View.GONE
                cardView6Visibility = true
            }
        }

        cardView7.setOnClickListener {
            if (cardView7Visibility) {
                linearLayout7.visibility = View.VISIBLE
                cardView7Visibility = false
            }else{
                linearLayout7.visibility = View.GONE
                cardView7Visibility = true
            }
        }

        ritm_switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        ritm_switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        ritm_switch3.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        ritm_switch4.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        ritm_switch5.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        ritm_switch6.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        ritm_switch7.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        yurak_switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        yurak_switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        yurak_switch3.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmayurak_switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmayurak_switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmayurak_switch3.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmayurak_switch4.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmaporok_switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmaporok_switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmaporok_switch3.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmaporok_switch4.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmaporok_switch5.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        tugmaporok_switch6.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        ishemik_switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        ishemik_switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        yurakQon_switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        yurakQon_switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        yurakQon_switch3.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        patologik_switch1.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        patologik_switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        patologik_switch3.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        patologik_switch4.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        patologik_switch5.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        patologik_switch6.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }
        patologik_switch7.setOnCheckedChangeListener { buttonView, isChecked ->
            check(isChecked)
        }

        natija_btn.setOnClickListener {

            findNavController().navigate(R.id.second,
            Bundle().apply
             { putDouble("natija", natija) })

            println("$natija salam")
            natija = 0.0
        }

    }

    private fun check(check: Boolean){
        if (check){
            natija += 3.125
        }else{
            natija -= 3.125
        }
    }

}