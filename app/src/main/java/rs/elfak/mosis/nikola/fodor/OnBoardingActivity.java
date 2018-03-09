package rs.elfak.mosis.nikola.fodor;

import android.os.Build;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OnBoardingActivity extends AppCompatActivity {
    ViewPager mViewPager;
    SlideAdapter mSlideAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //transparent statusbar

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP)
        {
            getWindow().getDecorView().setSystemUiVisibility(
                    View.SYSTEM_UI_FLAG_FULLSCREEN |
                            View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            );
            getWindow().setStatusBarColor(getResources().getColor(R.color.black_trans80, null));
        }

        setContentView(R.layout.activity_on_boarding);
        mViewPager = (ViewPager) findViewById(R.id.onBoardingPager);
        mSlideAdapter = new SlideAdapter(this);
        mViewPager.setAdapter(mSlideAdapter);
    }
}
