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
        val list = listOf(
            RecyclerModel(
                "Вася Петрушин", R.drawable.img, 3.3, 21565, 8, "Команда1"
            ),
            RecyclerModel(
                "Петя Васильев", R.drawable.img_1, 4.0, 751, 1, "Команда2"
            ),
            RecyclerModel(
                "Гоша Руденко", R.drawable.img_2, 4.2, 3127, 3, "Команда3"
            ),
            RecyclerModel(
                "Сёма Богданов", R.drawable.img_3, 4.5, 97842, 51, "Команда4"
            ),
            RecyclerModel(
                "Антон Серов", R.drawable.img_4, 5.0, 6458, 6, "Команда5"
            ),
            RecyclerModel(
                "Стас Асафьев", R.drawable.img_5, 2.3, 13561, 13, "Команда6"
            ),
            RecyclerModel(
                "Женя Зимин", R.drawable.img_6, 5.0, 312612, 63, "Команда7"
            )
        )
        adapter.createList(list)
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