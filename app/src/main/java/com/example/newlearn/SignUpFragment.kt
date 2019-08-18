package com.example.newlearn


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.newlearn.databinding.FragmentSignupBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class SignUpFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSignupBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_signup, container, false
        )
        binding.nextBtn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_signUpFragment_to_setPasswordFragment)
        )
        binding.toSignIn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_signUpFragment_to_signInFragment)
        )
        binding.toSignIn2.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_signUpFragment_to_signInFragment)
        )
        return binding.root
    }


}
