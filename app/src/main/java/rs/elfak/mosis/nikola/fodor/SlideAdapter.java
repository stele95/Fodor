package rs.elfak.mosis.nikola.fodor;


import android.content.Context;
import android.graphics.Color;
import android.media.Image;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by nik_j on 3/8/2018.
 */

public class SlideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater inflater;

    //list of images sa id-jevima
    public int[] images = {
            R.drawable.image_1,
            R.drawable.image_2,
            R.drawable.image_3,
            R.drawable.image_4
    };

    // naslovi

    public String[] titles = {
            "UP UP AND AWAY",
            "AROUND AND BACK",
            "CENTER GALAXY",
            "ROCKET MAN"
    };

    public int[] colors = {
            Color.rgb(55, 55, 55),
            Color.rgb(239, 85, 85),
            Color.rgb(110, 49, 89),
            Color.rgb(1, 188, 212)
    };

    public SlideAdapter(Context context)
    {
        this.context = context;
    }


    @Override
    public int getCount() {
        return titles.length;
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slide, container, false);
        LinearLayout layoutSlide = (LinearLayout) view.findViewById(R.id.layoutslide);
        ImageView slideImage = (ImageView) view.findViewById(R.id.slide_image);
        TextView title = (TextView) view.findViewById(R.id.slide_title);
        layoutSlide.setBackgroundColor(colors[position]);
        slideImage.setImageResource(images[position]);
        title.setText(titles[position]);
        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((LinearLayout)object);
    }

    @Override
    public boolean isViewFromObject(View view, Object object) {
        return (view == (LinearLayout) object);
    }
}
