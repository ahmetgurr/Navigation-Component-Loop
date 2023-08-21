package com.example.navigationcircle

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.navigationcircle.databinding.FragmentFirstBinding

class FirstFragment : Fragment() {
    private lateinit var tasarim: FragmentFirstBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        tasarim = FragmentFirstBinding.inflate(inflater,container,false)

        tasarim.buttonMainPage.setOnClickListener{
            val gecis = FirstFragmentDirections.actionFirstFragmentToSecondFragment()
            Navigation.findNavController(it).navigate(gecis)
        }
        return tasarim.root
        //return inflater.inflate(R.layout.fragment_first, container, false)
        // val view = inflater.inflate(R.layout.fragment_first,container,false)
        //return view
    }

}