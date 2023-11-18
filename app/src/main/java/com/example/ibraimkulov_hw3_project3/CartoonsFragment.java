package com.example.ibraimkulov_hw3_project3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CartoonsFragment extends Fragment {
    private RecyclerView rvCartoons;
    private ArrayList<String> cartoonsList=new ArrayList<>();
    private CartoonsAdapter adapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_cartoons, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initView();
        loadData();
        initAdapter();
    }

    private void initAdapter() {
        adapter= new CartoonsAdapter(cartoonsList);
        rvCartoons.setAdapter(adapter);
    }

    private void loadData() {
        cartoonsList.add("Душа");
        cartoonsList.add("КУнгфу Панда");
        cartoonsList.add("Маугли");
        cartoonsList.add("Ну погоди");
        cartoonsList.add("Том и Джери");
        cartoonsList.add("Лука");
        cartoonsList.add("Русалка");
        cartoonsList.add("Лоло");
        cartoonsList.add("Винипух");
        cartoonsList.add("Король лев");
        cartoonsList.add("Валли");
        cartoonsList.add("Атлантида");
        cartoonsList.add("Микки Маус");
        cartoonsList.add("Босс молокосос");
        cartoonsList.add("Балто");
        cartoonsList.add("Спирит");

    }

    private void initView() {
        rvCartoons=requireActivity().findViewById(R.id.rv_cartoons);
    }
}