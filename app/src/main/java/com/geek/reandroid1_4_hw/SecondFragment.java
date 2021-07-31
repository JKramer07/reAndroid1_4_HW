package com.geek.reandroid1_4_hw;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SecondFragment extends Fragment implements OnItemClick {

    private RecyclerView rv;
    private PlaylistAdapter adapter;
    private ArrayList<MusicItem> musicList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_second, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initRecycler(view);
    }

    private void initRecycler(View view) {
        adapter = new PlaylistAdapter();
        adapter.setList(createList());
        adapter.setListener(this);
        rv = view.findViewById(R.id.second_rv);
        rv.setAdapter(adapter);

    }

    private ArrayList<MusicItem> createList() {
        musicList.add(new MusicItem("1", "Blank Space", "Taylor Swift", "3:22"));
        musicList.add(new MusicItem("2", "Watch Me", "Silento", "5:36"));
        musicList.add(new MusicItem("3", "Earned It", "The Weekend", "4:51"));
        musicList.add(new MusicItem("4", "The Hills", "Taylor Swift", "3:41"));
        musicList.add(new MusicItem("5", "Ревность", "Каста", "3:01"));
        musicList.add(new MusicItem("6", "The Show Must Go On", "Queen", "4:33"));
        musicList.add(new MusicItem("7", "Feel Good", "Gorillaz", "3:03"));
        musicList.add(new MusicItem("8", "Fortress", "Illenium", "3:24"));
        musicList.add(new MusicItem("9", "Texture", "Miyagi", "3:27"));
        musicList.add(new MusicItem("10", "Missing Someone", "DJ Quads", "2:29"));
        return musicList;
    }

    @Override
    public void setClick(MusicItem musicItem) {
        getFragmentManager().beginTransaction().replace(R.id.second_cont, new ThirdFragment()).commit();

    }
}