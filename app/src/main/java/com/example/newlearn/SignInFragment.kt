package com.example.newlearn


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.newlearn.databinding.FragmentSigninBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class SignInFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSigninBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_signin, container, false
        )
        binding.toFgtPwd.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_signInFragment_to_forgotPasswordFragment)
        )
        binding.toSignUp.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_signInFragment_to_signUpFragment)
        )
        return binding.root

    }

}
