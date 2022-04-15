package com.zhangqi.percentagecircle;

import android.app.Activity;
import android.os.Bundle;




public class MainActivity extends Activity {
    private PercentageRing mPercentageRing4;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mPercentageRing4 = (PercentageRing) findViewById(R.id.Circle4);
        //设置目标百分比为100
        mPercentageRing4.setTargetPercent(100);
    }

}
