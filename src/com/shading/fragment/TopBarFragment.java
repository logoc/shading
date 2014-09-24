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
public class TopBarFragment extends Fragment {
    TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        Log.v("Contentfragment","Contentfragment_onCreate");
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Log.v("Contentfragment","Contentfragment_onCreateView");
        return inflater.inflate(R.layout.fragment_topbar,container,false);
    }

    public void changeContent(int index){
        textView = (TextView) getActivity().findViewById(R.id.fragment_topbar_topic);
        switch (index){
            case 0:
                textView.setText("1标题");
                break;
            case 1:
                textView.setText("2标题");
                break;
            case 2:
                textView.setText("3标题");
                break;
            case 3:
                textView.setText("4标题");
                break;
            case 4:
                textView.setText("5标题");
                break;
            default:
                break;
        }
    }
}