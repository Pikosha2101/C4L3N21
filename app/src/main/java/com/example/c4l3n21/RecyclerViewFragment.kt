package com.example.c4l3n21

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.c4l3n21.databinding.RecyclerViewFragmentBinding

class RecyclerViewFragment : Fragment(R.layout.recycler_view_fragment) {
    private var _binding : RecyclerViewFragmentBinding? = null
    private val binding get() = _binding!!
    private val adapter = RecyclerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = RecyclerViewFragmentBinding.inflate(inflater, container, false)
        binding.recyclerView.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        binding.recyclerView.adapter = adapter
        adapter.createList(
            arrayListOf(
                "Вася Петрушин",
                "Петя Васильев",
                "Гоша Руденко",
                "Сёма Богданов",
                "Антон Серов",
                "Стас Асафьев",
                "Женя Дзимин"
            ),
            arrayListOf(
                R.drawable.img,
                R.drawable.img_1,
                R.drawable.img_2,
                R.drawable.img_3,
                R.drawable.img_4,
                R.drawable.img_5,
                R.drawable.img_6
            )
        )
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) = with(binding) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}