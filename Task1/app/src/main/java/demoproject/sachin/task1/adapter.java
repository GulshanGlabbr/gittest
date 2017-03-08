package demoproject.sachin.task1;

import android.content.Context;
import android.graphics.Movie;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by HACKER on 2/26/2017.
 */

public class adapter extends RecyclerView.Adapter<adapter.MyViewHolder> {



    private List<ChatList> chatlist;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView email,status;
        public ImageView image,logo;


        public MyViewHolder(View view) {
            super(view);
            email= (TextView) view.findViewById(R.id.email);
            image= (ImageView) view.findViewById(R.id.imageview);
            logo= (ImageView) view.findViewById(R.id.logo);
            status= (TextView) view.findViewById(R.id.status);
        }
    }


    public adapter(List<ChatList> chatlist) {
        this.chatlist = chatlist;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.content_layout, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        ChatList list = chatlist.get(position);
        holder.image.setImageResource(list.getimages());
        holder.status.setText(list.getStstus());
        holder.email.setText(list.getemail());
        holder.logo.setImageResource(list.getLogo());

    }



    @Override
    public int getItemCount() {
        return chatlist.size();
    }
}
