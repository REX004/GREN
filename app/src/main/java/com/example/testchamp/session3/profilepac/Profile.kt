package com.example.testchamp.session3.profilepac

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RelativeLayout
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.findNavController
import com.example.testchamp.R


class Profile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bF1 = view.findViewById<ConstraintLayout>(R.id.notifications)
        val bF2 = view.findViewById<ConstraintLayout>(R.id.card_bank_settings)
        val bF3 = view.findViewById<ConstraintLayout>(R.id.referals)

        val controller = findNavController()
        bF1.setOnClickListener {
            controller.navigate(R.id.notfication) }
        bF2.setOnClickListener {
            controller.navigate(R.id.addPaymentMethod)
        }
        bF3.setOnClickListener {
            controller.navigate(R.id.sendAPacage)
        }
    }

}