package com.dsu.dsu_std.ui.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dsu.dsu_std.databinding.FragmentSearchBinding
import com.dsu.dsu_std.ui.search.SearchViewModel

class SearchFragment :Fragment(){

    private var _binding : FragmentSearchBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Defines the xml file for the fragment
        val searchRecord = ViewModelProvider(this).get(SearchViewModel::class.java)
        _binding = FragmentSearchBinding.inflate(inflater, container, false)

        val root: View = binding.root

        val textView: TextView = binding.textSearch
        searchRecord.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}