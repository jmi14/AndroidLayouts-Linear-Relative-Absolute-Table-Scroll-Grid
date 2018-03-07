package com.example.intagpc.androidlayouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridViewActivity extends AppCompatActivity {
    private GridView gridView;

    int[] images = {R.drawable.download, R.drawable.download,
            R.drawable.download, R.drawable.download, R.drawable.download,
            R.drawable.download, R.drawable.download, R.drawable.download,
            R.drawable.download, R.drawable.download, R.drawable.download,
            R.drawable.download, R.drawable.download, R.drawable.download,
            R.drawable.download, R.drawable.download, R.drawable.download,
            R.drawable.download,
            R.drawable.download, R.drawable.download, R.drawable.download, R.drawable.download,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view);
        initWidgets();
        callGridView();

    }

    public void initWidgets() {
        gridView = (GridView) findViewById(R.id.gridView);

    }

    public void callGridView() {
        gridView.setAdapter(new GridViewImageAdapter(this,images));

    }
}
