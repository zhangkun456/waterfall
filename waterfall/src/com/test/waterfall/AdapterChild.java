package com.test.waterfall;

import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.List;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class AdapterChild extends BaseAdapter {
	private WeakReference<Context> mContext;
	private WeakReference<View> mParent;
	private List<String[]> mListPath;
	private int mItemNum = 0;
	private int mLoadingNum = 0;

	public AdapterChild(Context c, List<String[]> path, View list) {
		mContext = new WeakReference<Context>(c);
		mParent = new WeakReference<View>(list);
		mListPath = path;
		if (mListPath != null) {
			mItemNum = mListPath.size();
		}
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mItemNum;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		try {
			// if(mListPath.get(position).length == 3){
			// convertView =
			// LayoutInflater.from(parent.getContext()).inflate(R.layout.item_child_style3,
			// null);
			// }else if(mListPath.get(position).length == 4){
			// convertView =
			// LayoutInflater.from(parent.getContext()).inflate(R.layout.item_child_style4,
			// null);
			// }else if(mListPath.get(position).length == 5){
			// convertView =
			// LayoutInflater.from(parent.getContext()).inflate(R.layout.item_child_style51,
			// null);
			// }
			if (mParent.get() == null || mParent.get().getWidth() == 0) {
				if (convertView == null) {
					convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_child_style, null);
				}
				return convertView;
			}
			if (convertView == null) {
				convertView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_child_style, null);
				// convertView.setTag("" + position);
			}
			Bitmap bmpBack;
			if (mListPath.get(position).length == 3) {
				LinearLayout layout1 = (LinearLayout) convertView.findViewById(R.id.layout_style1);
				layout1.setVisibility(View.GONE);
				LinearLayout layout4 = (LinearLayout) convertView.findViewById(R.id.layout_style4);
				layout4.setVisibility(View.GONE);
				LinearLayout layout51 = (LinearLayout) convertView.findViewById(R.id.layout_style51);
				layout51.setVisibility(View.GONE);

				LinearLayout layout3 = (LinearLayout) convertView.findViewById(R.id.layout_style3);
				layout3.setVisibility(View.VISIBLE);

				// ///////设置图片
				loadItemImage(convertView, R.id.image_item31, mListPath.get(position)[0], position, 0);
				loadItemImage(convertView, R.id.image_item32, mListPath.get(position)[1], position, 1);
				loadItemImage(convertView, R.id.image_item33, mListPath.get(position)[2], position, 2);
				// ImageView view1 = (ImageView)
				// convertView.findViewById(R.id.image_item31);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[0],
				// mContext.get().getAssets());
				// view1.setImageBitmap(bmpBack);
				// ImageView view2 = (ImageView)
				// convertView.findViewById(R.id.image_item32);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[1],
				// mContext.get().getAssets());
				// view2.setImageBitmap(bmpBack);
				// ImageView view3 = (ImageView)
				// convertView.findViewById(R.id.image_item33);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[2],
				// mContext.get().getAssets());
				// view3.setImageBitmap(bmpBack);
			} else if (mListPath.get(position).length == 4) {
				LinearLayout layout1 = (LinearLayout) convertView.findViewById(R.id.layout_style1);
				layout1.setVisibility(View.GONE);
				LinearLayout layout3 = (LinearLayout) convertView.findViewById(R.id.layout_style3);
				layout3.setVisibility(View.GONE);
				LinearLayout layout51 = (LinearLayout) convertView.findViewById(R.id.layout_style51);
				layout51.setVisibility(View.GONE);

				LinearLayout layout4 = (LinearLayout) convertView.findViewById(R.id.layout_style4);
				layout4.setVisibility(View.VISIBLE);
				// ///////设置图片
				loadItemImage(convertView, R.id.image_item41, mListPath.get(position)[0], position, 0);
				loadItemImage(convertView, R.id.image_item42, mListPath.get(position)[1], position, 1);
				loadItemImage(convertView, R.id.image_item43, mListPath.get(position)[2], position, 2);
				loadItemImage(convertView, R.id.image_item44, mListPath.get(position)[3], position, 3);
				// ImageView view1 = (ImageView)
				// convertView.findViewById(R.id.image_item41);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[0],
				// mContext.get().getAssets());
				// view1.setImageBitmap(bmpBack);
				// ImageView view2 = (ImageView)
				// convertView.findViewById(R.id.image_item42);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[1],
				// mContext.get().getAssets());
				// view2.setImageBitmap(bmpBack);
				// ImageView view3 = (ImageView)
				// convertView.findViewById(R.id.image_item43);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[2],
				// mContext.get().getAssets());
				// view3.setImageBitmap(bmpBack);
				// ImageView view4 = (ImageView)
				// convertView.findViewById(R.id.image_item44);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[3],
				// mContext.get().getAssets());
				// view4.setImageBitmap(bmpBack);
			} else if (mListPath.get(position).length == 5) {
				LinearLayout layout1 = (LinearLayout) convertView.findViewById(R.id.layout_style1);
				layout1.setVisibility(View.GONE);
				LinearLayout layout3 = (LinearLayout) convertView.findViewById(R.id.layout_style3);
				layout3.setVisibility(View.GONE);
				LinearLayout layout4 = (LinearLayout) convertView.findViewById(R.id.layout_style4);
				layout4.setVisibility(View.GONE);

				LinearLayout layout51 = (LinearLayout) convertView.findViewById(R.id.layout_style51);
				layout51.setVisibility(View.VISIBLE);
				// ///////设置图片
				loadItemImage(convertView, R.id.image_item511, mListPath.get(position)[0], position, 0);
				loadItemImage(convertView, R.id.image_item512, mListPath.get(position)[1], position, 1);
				loadItemImage(convertView, R.id.image_item513, mListPath.get(position)[2], position, 2);
				loadItemImage(convertView, R.id.image_item514, mListPath.get(position)[3], position, 3);
				loadItemImage(convertView, R.id.image_item515, mListPath.get(position)[4], position, 4);
				// ImageView view1 = (ImageView)
				// convertView.findViewById(R.id.image_item511);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[0],
				// mContext.get().getAssets());
				// view1.setImageBitmap(bmpBack);
				// ImageView view2 = (ImageView)
				// convertView.findViewById(R.id.image_item512);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[1],
				// mContext.get().getAssets());
				// view2.setImageBitmap(bmpBack);
				// ImageView view3 = (ImageView)
				// convertView.findViewById(R.id.image_item513);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[2],
				// mContext.get().getAssets());
				// view3.setImageBitmap(bmpBack);
				// ImageView view4 = (ImageView)
				// convertView.findViewById(R.id.image_item514);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[3],
				// mContext.get().getAssets());
				// view4.setImageBitmap(bmpBack);
				// ImageView view5 = (ImageView)
				// convertView.findViewById(R.id.image_item515);
				// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[4],
				// mContext.get().getAssets());
				// view5.setImageBitmap(bmpBack);
			}
			// if(mListPath.get(position).length >= 1){
			// ImageView view1 = (ImageView)
			// convertView.findViewById(R.id.image_item1);
			// Bitmap bmpBack =
			// MvtPro.LoadAssertsPic(mListPath.get(position)[0],mContext.get().getAssets());
			// view1.setImageBitmap(bmpBack);
			// }
			// if(mListPath.get(position).length >= 2){
			// ImageView view2 = (ImageView)
			// convertView.findViewById(R.id.image_item2);
			// Bitmap bmpBack =
			// MvtPro.LoadAssertsPic(mListPath.get(position)[1],mContext.get().getAssets());
			// view2.setImageBitmap(bmpBack);
			// }
			// if(mListPath.get(position).length >= 3){
			// ImageView view3 = (ImageView)
			// convertView.findViewById(R.id.image_item3);
			// Bitmap bmpBack =
			// MvtPro.LoadAssertsPic(mListPath.get(position)[2],mContext.get().getAssets());
			// view3.setImageBitmap(bmpBack);
			// }
			// if(mListPath.get(position).length >= 4){
			// ImageView view4 = (ImageView)
			// convertView.findViewById(R.id.image_item4);
			// Bitmap bmpBack =
			// MvtPro.LoadAssertsPic(mListPath.get(position)[3],mContext.get().getAssets());
			// view4.setImageBitmap(bmpBack);
			// }
			// if(mListPath.get(position).length >= 5){
			// ImageView view5 = (ImageView)
			// convertView.findViewById(R.id.image_item5);
			// Bitmap bmpBack =
			// MvtPro.LoadAssertsPic(mListPath.get(position)[4],mContext.get().getAssets());
			// view5.setImageBitmap(bmpBack);
			// }

			// // Bitmap bmpItem = MvtPro.LoadAssertsPic(mPath[position * 2],
			// // mContext.get().getAssets());
			// Bitmap bmpItem = null;
			// if (mBmpItem[position] != null && mBmpItem[position].get() !=
			// null
			// && !mBmpItem[position].get().isRecycled()) {
			// bmpItem = mBmpItem[position].get();
			// } else {
			// // String path = FileSaveToSdCard.getSavePath(mPath[position],
			// "kehuanli_" + (position), "kehuanli");
			// // File f = new File(path);
			// // if (f.exists()) {
			// // bmpItem = BitmapFactory.decodeFile(path);
			// // mBmpItem[position] = new WeakReference<Bitmap>(bmpItem);
			// // } else {
			// // bmpItem =
			// // BitmapFactory.decodeResource(mContext.get().getResources(),
			// // R.drawable.bg_loading);
			// // mBmpItem[position] = new WeakReference<Bitmap>(bmp);
			// // mImagePic[0].setImageBitmap(bmp);
			// view.setTag("" + (position));
			// new loadGridAsyncTask(view, mPath[position],
			// position,mContext.get()).execute();
			// // }
			// }
			//
			// if (bmpItem != null) {
			// int dstH = 120 - 4;
			// int dx = 0, dy = 0, w = 0, h = 0;
			// if (bmpItem.getWidth() > bmpItem.getHeight()) {
			// dx = (bmpItem.getWidth() - bmpItem.getHeight()) / 2;
			// dy = 0;
			// w = bmpItem.getHeight();
			// h = bmpItem.getHeight();
			// } else {
			// dx = (bmpItem.getHeight() - bmpItem.getWidth()) / 2;
			// dy = 0;
			// w = bmpItem.getWidth();
			// h = bmpItem.getWidth();
			// }
			// canvas.drawBitmap(bmpItem, new Rect(dx, dy, w, h), new Rect(2, 2,
			// 2 + dstH, 2 + dstH), null);
			// bmpItem.recycle();
			// }

		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
		return convertView;
	}

	public void loadItemImage(View convertView, int resId, String path, int position, int imgId) {
		ImageView view = (ImageView) convertView.findViewById(resId);
		view.setImageBitmap(null);
		int id = (position * 10) + imgId;
		view.setTag("" + id);
		// bmpBack = MvtPro.LoadAssertsPic(mListPath.get(position)[0],
		// mContext.get().getAssets());
		// view1.setImageBitmap(bmpBack);
		new loadGridAsyncTask(view, path, id, mContext.get()).execute();
	}

	public class loadGridAsyncTask extends AsyncTask<Integer, Integer, Bitmap> {
		private ImageView mViewPic;
		private String mUrl;
		private int mPosition;
		private WeakReference<Context> mContext;

		public loadGridAsyncTask(ImageView v, String url, int position, Context context) {
			mViewPic = v;
			mUrl = url;
			mPosition = position;
			mContext = new WeakReference<Context>(context);
		}

		@Override
		protected Bitmap doInBackground(Integer... arg0) {
			// TODO Auto-generated method stub
			Bitmap bmp = null;
			try {
				while (mLoadingNum > 0) {
					Thread.sleep(200);
				}
				mLoadingNum++;
				// 载入的时候，已经不显示了，则停止载入
				// int id = MvtPro.StringToInt((String) mViewPic.getTag());
				// if (id != mStrPosition) {
				// return null;
				// }
				// String path = FileSaveToSdCard.getSavePath(mUrl, "kehuanli_"
				// + mPosition, "kehuanli");
				// bmp = FileSaveToSdCard.saveToSdCardJpgBySizeAndReturn(mUrl,
				// path, "kehuanli", 500, 500, 0xffffffff);
				bmp = LoadAssertsPic(mUrl, mContext.get().getAssets());
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				mLoadingNum--;
			}
			return bmp;
		}

		public Bitmap LoadAssertsPic(String path, AssetManager am) {
			Bitmap bmp = null;
			try {
				InputStream is = am.open(path);
				BitmapFactory.Options options = new BitmapFactory.Options();
				options.inDither = false;
				options.inPreferredConfig = Config.ARGB_8888;
				bmp = BitmapFactory.decodeStream(is, null, options);
				is.close();

			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
			return bmp;
		}
		@Override
		protected void onPostExecute(Bitmap bitmap) {
			if (mViewPic != null && mViewPic.getVisibility() == View.VISIBLE && bitmap != null) {
				String tag = (String) mViewPic.getTag();
				if (tag.equals("" + mPosition)) {
					mViewPic.setImageBitmap(bitmap);
				}
			}
		}
	}
}
