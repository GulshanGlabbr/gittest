package demoproject.sachin.task1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ChatList> arrayList = new ArrayList();
    RecyclerView recyclerView;
    adapter mAdapter;
    int[] images={R.drawable.img,R.drawable.img,R.drawable.img,
            R.drawable.img,
            R.drawable.img,R.drawable.img,R.drawable.img,R.drawable.img,R.drawable.img,R.drawable.img,};
    String[] name;
    String[] status;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name=getResources().getStringArray(R.array.email);
        status=getResources().getStringArray(R.array.status);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        mAdapter = new adapter(arrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);

        recyclerView.setAdapter(mAdapter);
        addlist();
    }
    public void addlist()
    {
        for(int i=0;i<10;i++) {
            ChatList cl = new ChatList(images[i],name[i],status[i],R.drawable.logo);
            arrayList.add(cl);
        }
    }
}
