package bdjobs.lict.gridview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import bdjobs.lict.gridview.R;
import bdjobs.lict.gridview.model.Friends;

public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<Friends> arrayList;

    public CustomAdapter(Context context, ArrayList<Friends> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int Position, View view, ViewGroup viewGroup) {

        LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View custom_view=inflater.inflate(R.layout.grid_item_layout,null);

        ImageView imageView=custom_view.findViewById(R.id.imageView);
        TextView textView = custom_view.findViewById(R.id.textView);

        imageView.setImageResource(arrayList.get(Position).getImageId());
        textView.setText(arrayList.get(Position).getName());

        return custom_view;
    }
}
