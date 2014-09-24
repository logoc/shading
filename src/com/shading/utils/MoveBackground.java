package com.shading.utils;

import android.view.View;
import android.view.animation.TranslateAnimation;

/**
 * Created by liliang11 on 2014/9/22.
 */
public class MoveBackground {

    public static void moveFrontBackground(View v,int starx,int tox,int starty,int toy){
        TranslateAnimation translateAnimation = new TranslateAnimation(starx,tox,starty,toy);
        translateAnimation.setDuration(200);
        translateAnimation.setFillAfter(true);
        v.startAnimation(translateAnimation);
    }
}
