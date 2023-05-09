package com.example.newsapp4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;




public class NewsFragment extends Fragment {
    private ArrayList<DataModel> list = new ArrayList<>();
    private ImageView image;
    private TextView heading;
    public NewsFragment() {
        // Required empty public constructor
    }

    public static NewsFragment newInstance() {
        NewsFragment fragment = new NewsFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_news,container,false);
        image = view.findViewById(R.id.imageView);
        heading = view.findViewById(R.id.textView);
        image.setImageResource(R.drawable.a);
        heading.setText("Heading111");

        buildListData();
        initrecyclerview(view);
        return view;
    }

    private void initrecyclerview(View view){

        RecyclerView recyclerView = view.findViewById(R.id.recycleview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getActivity());

        recyclerView.setLayoutManager(layoutManager);
        Adapter adapter = new Adapter(list);
        recyclerView.setAdapter(adapter);
    }
    private void buildListData(){

        list.add(new DataModel("AAA",R.drawable.c));
        list.add(new DataModel("AAAdd",R.drawable.d));
        list.add(new DataModel("AAAff",R.drawable.e));


    }
}