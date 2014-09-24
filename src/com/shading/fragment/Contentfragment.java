package com.shading.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.shading.R;

/**
 * Created by liliang11 on 2014/9/22.
 */
public class Contentfragment extends Fragment {
    TextView displayTextView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v("Contentfragment", "Contentfragment_onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v("Contentfragment", "Contentfragment_onCreateView");
        return inflater.inflate(R.layout.fragment_content,container,false);
    }

    public void changeContent(int index){
        displayTextView =(TextView) getActivity().findViewById(R.id.fragment_context_context);
        switch (index){
            case 0:
                displayTextView.setText("1内容");
                break;
            case 1:
                displayTextView.setText("2内容");
                break;
            case 2:
                displayTextView.setText("3内容");
                break;
            case 3:
                displayTextView.setText("4内容");
                break;
            case 4:
                displayTextView.setText("5内容");
                break;
            default:
                break;
        }
    }
}