package com.shading;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import com.shading.fragment.Contentfragment;
import com.shading.fragment.TopBarFragment;
import com.shading.utils.MoveBackground;

public class ShadingActivity extends Activity {
    /**
     * Called when the activity is first created.
     */
    RadioGroup radioGroup;
    ImageView imageView;
    TabHost tabHost;
    int startLeft;
    RelativeLayout bottom_layout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        tabHost = (TabHost) findViewById(R.id.tabhost);
        bottom_layout = (RelativeLayout) findViewById(R.id.layout_bottom);

        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(checkedChangeListener);
        imageView = new ImageView(this);
        imageView.setImageResource(R.drawable.tab_front_bg);
        bottom_layout.addView(imageView);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_activity, menu);
        return true;
    }

    private RadioGroup.OnCheckedChangeListener checkedChangeListener = new RadioGroup.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(RadioGroup radioGroup, int i) {
            Contentfragment contentfragment = (Contentfragment) getFragmentManager().findFragmentById(R.id.content_fragment);
            TopBarFragment topBarFragment = (TopBarFragment) getFragmentManager().findFragmentById(R.id.content_fragment_top);
            switch (i){
                case R.id.radio_home:
                    contentfragment.changeContent(0);
                    topBarFragment.changeContent(0);
                    tabHost.setCurrentTabByTag("home");
                    MoveBackground.moveFrontBackground(imageView,startLeft,0,0,0);
                    startLeft = 0;
                    break;
                case R.id.radio_hot:
                    contentfragment.changeContent(1);
                    topBarFragment.changeContent(1);
                    tabHost.setCurrentTabByTag("hot");
                    MoveBackground.moveFrontBackground(imageView,startLeft,imageView.getWidth(),0,0);
                    startLeft = imageView.getWidth();
                    break;
                case R.id.radio_search:
                    contentfragment.changeContent(2);
                    topBarFragment.changeContent(2);
                    tabHost.setCurrentTabByTag("search");
                    MoveBackground.moveFrontBackground(imageView,startLeft,imageView.getWidth()*2,0,0);
                    startLeft = imageView.getWidth()*2;
                    break;
                case R.id.radio_setting:
                    contentfragment.changeContent(3);
                    topBarFragment.changeContent(3);
                    tabHost.setCurrentTabByTag("setting");
                    MoveBackground.moveFrontBackground(imageView,startLeft,imageView.getWidth()*3,0,0);
                    startLeft = imageView.getWidth()*3;
                    break;
                default:
                    break;
            }

        }
    };
}
