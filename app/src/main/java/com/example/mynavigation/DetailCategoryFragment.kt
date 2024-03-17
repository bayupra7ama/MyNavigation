package com.example.mynavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mynavigation.databinding.FragmentCategoryBinding
import com.example.mynavigation.databinding.FragmentDetailCategoryBinding

// TODO: peroses menerima data dengan argument

class DetailCategoryFragment : Fragment() {
    private var _binding  : FragmentDetailCategoryBinding? = null
    private val binding get() = _binding!!

    companion object{
        val EXTA_NAME = "extra_name"
        val EXTRA_STROCK = "extra_stock"
    }

  

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding =FragmentDetailCategoryBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        //menangkap data yang dikirimkan

        val dataName = arguments?.getString(CategoryFragment.EXTRA_NAME)
        val dataDescription = arguments?.getLong(CategoryFragment.EXTRA_STOCK)

        binding.tvCategoryName.text = dataName
        binding.tvCategoryDescription.text = "Stock =  $dataDescription"


    }
    
}