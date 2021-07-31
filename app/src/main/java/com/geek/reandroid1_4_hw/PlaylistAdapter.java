package com.geek.reandroid1_4_hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.SortedMap;

public class PlaylistAdapter extends RecyclerView.Adapter<PlaylistAdapter.ViewHolder> {

    private ArrayList<MusicItem> list = new ArrayList<>();
    private OnItemClick listener;

    public void setListener(OnItemClick listener){
        this.listener = listener;
    }

    public void setList(ArrayList<MusicItem> list){
        this.list = list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.playlist_rv, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.onBind(list.get(position));
        holder.itemView.setOnClickListener(v -> {
            listener.setClick(list.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView num, song, name, time;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            num = itemView.findViewById(R.id.num_txt);
            song = itemView.findViewById(R.id.song_name_txt);
            name = itemView.findViewById(R.id.artist_name_txt);
            time = itemView.findViewById(R.id.time_txt);
        }

        public void onBind(MusicItem item) {
            num.setText(item.getNum());
            song.setText(item.getSong());
            name.setText(item.getName());
            time.setText(item.getTime());
        }
    }
}
