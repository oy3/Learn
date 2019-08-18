package com.example.newlearn


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.newlearn.databinding.FragmentForgotpasswordBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class ForgotPasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentForgotpasswordBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_forgotpassword, container, false
        )
        binding.resetpwd.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_forgotPasswordFragment_to_confirmForgotPasswordFragment)
        )
        binding.toSignIn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_forgotPasswordFragment_to_signInFragment)
        )
        return binding.root
    }


}
