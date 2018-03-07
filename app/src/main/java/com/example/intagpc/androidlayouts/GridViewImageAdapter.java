package com.example.intagpc.androidlayouts;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.GridLayout;
import android.widget.ImageView;

/**
 * Created by intag pc on 3/7/2018.
 */

public class GridViewImageAdapter extends BaseAdapter {
    Context context;
    int[] images;

    public GridViewImageAdapter(Context context, int[] images) {
        this.context = context;
        this.images = images;
    }

    @Override
    public int getCount() {
        return images.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(images[i]);
        imageView.setLayoutParams(new ViewGroup.LayoutParams(200, 200));

        return imageView;
    }
}
