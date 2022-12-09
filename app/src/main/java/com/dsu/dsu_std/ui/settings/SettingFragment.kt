package com.dsu.dsu_std.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.dsu.dsu_std.databinding.FragmentSettingBinding
import com.dsu.dsu_std.ui.search.SettingViewModel
//import com.dsu.dsu_std.ui.settings.SettingViewModel
import com.dsu.dsu_std.ui.settings.SettingFragment

class SettingFragment :Fragment(){

    private var _binding : FragmentSettingBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Defines the xml file for the fragment
        val settingRecord = ViewModelProvider(this).get(SettingViewModel::class.java)
        _binding = FragmentSettingBinding.inflate(inflater, container, false)

        val root: View = binding.root

        val textView: TextView = binding.textSetting
        settingRecord.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }
}