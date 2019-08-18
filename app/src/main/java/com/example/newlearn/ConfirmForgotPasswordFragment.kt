package com.example.newlearn


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.navigation.Navigation
import com.example.newlearn.databinding.FragmentCforgotpasswordBinding
import com.example.newlearn.databinding.FragmentForgotpasswordBinding

/**
 * A simple [Fragment] subclass.
 *
 */
class ConfirmForgotPasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentCforgotpasswordBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_cforgotpassword, container, false
        )
        binding.toSignIn.setOnClickListener(
            Navigation.createNavigateOnClickListener(R.id.action_confirmForgotPasswordFragment_to_signInFragment)
        )
        return binding.root
    }


}
