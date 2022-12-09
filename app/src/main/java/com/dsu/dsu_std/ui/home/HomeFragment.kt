package com.dsu.dsu_std.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.dsu.dsu_std.CustomAdapter
import com.dsu.dsu_std.ItemsViewModel
import com.dsu.dsu_std.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        parent: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Defines the xml file for the fragment
        val view = inflater.inflate(R.layout.fragment_home, parent, false)

        val recyclerview = view.findViewById<RecyclerView>(R.id.recyclerview)

        // this creates a vertical layout Manager
        recyclerview.layoutManager = LinearLayoutManager(requireContext())

        // ArrayList of class ItemsViewModel
        val data = ArrayList<ItemsViewModel>()

        // This loop will create 20 Views containing
        // the image with the count of view

        data.add(ItemsViewModel(R.drawable.user1, "Huzaifa Rehman "))
        data.add(ItemsViewModel(R.drawable.user2, "ALI Khan "))
        data.add(ItemsViewModel(R.drawable.user3, "BABAR Ali "))
        data.add(ItemsViewModel(R.drawable.user4, "Rizwan Faizan "))
        data.add(ItemsViewModel(R.drawable.user5, "Sarfaraz Ali"))
        data.add(ItemsViewModel(R.drawable.user6, "Syed Hamza "))
        data.add(ItemsViewModel(R.drawable.user7, "ATTA Khan "))
        data.add(ItemsViewModel(R.drawable.user1, "Bilal Rizwan "))
        data.add(ItemsViewModel(R.drawable.user2, "Sara Ahmed"))
        data.add(ItemsViewModel(R.drawable.user3, "Mirza Ali"))
        data.add(ItemsViewModel(R.drawable.user4, "Iman Rizwan "))
        data.add(ItemsViewModel(R.drawable.user5, "Muhammad Ahmed"))


        // This will pass the ArrayList to our Adapter
        val adapter = CustomAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter


        return view
    }
}