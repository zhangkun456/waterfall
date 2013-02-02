package com.test.waterfall;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;

public class WaterfallActivity extends Activity {
    /** Called when the activity is first created. */
	private HorizontalListView mListViewChild;
	private List<String[]> mListChild = new ArrayList();
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mListViewChild = (HorizontalListView) findViewById(R.id.listview_child);

		String item[];
		mListChild = new ArrayList();
		for (int i = 0; i < 100; i++) {
			item = new String[5];
			item[0] = "test/1.jpg";
			item[1] = "test/2.jpg";
			item[2] = "test/3.jpg";
			item[3] = "test/4.jpg";
			item[4] = "test/5.jpg";
			mListChild.add(item);

			item = new String[4];
			item[0] = "test/2.jpg";
			item[1] = "test/7.jpg";
			item[2] = "test/8.jpg";
			item[3] = "test/9.jpg";
			mListChild.add(item);

			item = new String[3];
			item[0] = "test/10.jpg";
			item[1] = "test/11.jpg";
			item[2] = "test/12.jpg";
			mListChild.add(item);

			item = new String[4];
			item[0] = "test/4.jpg";
			item[1] = "test/3.jpg";
			item[2] = "test/2.jpg";
			item[3] = "test/1.jpg";
			mListChild.add(item);

			item = new String[3];
			item[0] = "test/5.jpg";
			item[1] = "test/6.jpg";
			item[2] = "test/7.jpg";
			mListChild.add(item);

			item = new String[5];
			item[0] = "test/8.jpg";
			item[1] = "test/6.jpg";
			item[2] = "test/7.jpg";
			item[3] = "test/9.jpg";
			item[4] = "test/10.jpg";
			mListChild.add(item);

			item = new String[4];
			item[0] = "test/7.jpg";
			item[1] = "test/9.jpg";
			item[2] = "test/2.jpg";
			item[3] = "test/1.jpg";
			mListChild.add(item);

			item = new String[5];
			item[0] = "test/8.jpg";
			item[1] = "test/9.jpg";
			item[2] = "test/11.jpg";
			item[3] = "test/12.jpg";
			item[4] = "test/4.jpg";
			mListChild.add(item);

			item = new String[5];
			item[0] = "test/9.jpg";
			item[1] = "test/4.jpg";
			item[2] = "test/6.jpg";
			item[3] = "test/1.jpg";
			item[4] = "test/8.jpg";
			mListChild.add(item);
		}

		mListViewChild.setAdapter(new AdapterChild(this, mListChild, mListViewChild));
    }
}