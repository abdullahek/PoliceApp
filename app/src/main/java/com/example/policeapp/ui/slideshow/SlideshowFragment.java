package com.example.policeapp.ui.slideshow;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.policeapp.MainActivity;
import com.example.policeapp.R;
import com.example.policeapp.RecyclerViewAdapter;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

public class SlideshowFragment extends Fragment {






    List<com.example.policeapp.notification_class> list = new ArrayList<>();

    RecyclerView recyclerView;

    RecyclerView.Adapter adapter ;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);


        ArrayList personNames = new ArrayList<>(Arrays.asList("Person 1", "Person 2", "Person 3", "Person 4", "Person 5", "Person 6", "Person 7"));
        recyclerView = (RecyclerView) root.findViewById(R.id.rc_notication);

//        recyclerView.setHasFixedSize(true);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        String name = "I need some help right now";
        String name1 = "Found someone threating near me please help";
        String name2 = "You can i get help instantly";


        com.example.policeapp.notification_class notification_class = new com.example.policeapp.notification_class(name);
        com.example.policeapp.notification_class abd = new com.example.policeapp.notification_class(name1);
        com.example.policeapp.notification_class vabd = new com.example.policeapp.notification_class(name2);





        list.add(notification_class);
        list.add(abd);
        list.add(vabd);

      //  Toast.makeText(getActivity(), list.toString(), Toast.LENGTH_SHORT).show();
        adapter = new RecyclerViewAdapter(getActivity(), list);

        recyclerView.setAdapter(adapter);




        return root;
    }
}