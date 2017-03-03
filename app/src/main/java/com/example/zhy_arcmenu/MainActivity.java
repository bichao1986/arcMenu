package com.example.zhy_arcmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.zhy_arcmenu.ArcMenu.OnMenuItemClickListener;

public class MainActivity extends Activity
{

	private ArcMenu mArcMenuLeftTop;

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mArcMenuLeftTop = (ArcMenu) findViewById(R.id.id_arcmenu1);
		//动态添加一个MenuItem
		ImageView people = new ImageView(this);
		people.setImageResource(R.drawable.composer_with);
		people.setTag("People");
		mArcMenuLeftTop.addView(people);

	
		mArcMenuLeftTop
				.setOnMenuItemClickListener(new OnMenuItemClickListener()
				{
					@Override
					public void onClick(View view, int pos)
					{
						Toast.makeText(MainActivity.this,
								pos + ":" + view.getTag(), Toast.LENGTH_SHORT)
								.show();
					}
				});
	}

}
