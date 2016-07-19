package com.apkmarvel.imageviewpager;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class ImagePagerAdapter extends PagerAdapter {
	private int[] images;
	public ImagePagerAdapter(int[] images) {
		this.images = images;
	}
	@Override
	public int getCount() {
		return images.length;
	}

	@Override
	public Object instantiateItem(ViewGroup viewGroup, int position) {
		LayoutInflater inflater = (LayoutInflater) viewGroup.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		View layout = inflater.inflate(R.layout.pager_item, null);
		ImageView img = (ImageView)layout.findViewById(R.id.img_item);
		img.setImageResource(images[position]);
		viewGroup.addView(layout);
		return layout;
	}
	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		View view = (View) object;
		container.removeView(view);
	}
	@Override
	public boolean isViewFromObject(View view, Object obj) {
		return view == obj;
	}
}
