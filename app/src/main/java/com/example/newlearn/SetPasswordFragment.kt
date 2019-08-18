package com.example.newlearn


import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.newlearn.databinding.FragmentSetpasswordBinding
import com.example.newlearn.databinding.FragmentSignupBinding


/**
 * A simple [Fragment] subclass.
 *
 */
class SetPasswordFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSetpasswordBinding = DataBindingUtil.inflate(
            inflater, R.layout.fragment_setpassword, container, false
        )
        return binding.root
    }


}
