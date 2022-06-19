package com.example.janani.PregnantLadyTabs;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.janani.R;

public class MustKnowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_must_know);
        /**ImageView mImageView=findViewById (R.id.imageView20);
        ImageView m=findViewById (R.id.imageView21);
        ImageView m2=findViewById (R.id.imageView22);
        ImageView m3=findViewById (R.id.imageView23);
        ImageView m4=findViewById (R.id.imageView24);
        ImageView m5=findViewById (R.id.imageView25);
        ImageView m6=findViewById (R.id.imageView26);
        ImageView m7=findViewById (R.id.imageView27);
        m2.setImageBitmap(
                decodeSampledBitmapFromResource(getResources(), R.id.imageView22, 100, 100));
        m3.setImageBitmap(
                decodeSampledBitmapFromResource(getResources(), R.id.imageView23, 100, 100));
        m4.setImageBitmap(
                decodeSampledBitmapFromResource(getResources(), R.id.imageView24, 100, 100));
        m5.setImageBitmap(
                decodeSampledBitmapFromResource(getResources(), R.id.imageView25, 100, 100));
        m6.setImageBitmap(
                decodeSampledBitmapFromResource(getResources(), R.id.imageView26, 100, 100));
        m.setImageBitmap(
                decodeSampledBitmapFromResource(getResources(), R.id.imageView21, 100, 100));
        m7.setImageBitmap(
                decodeSampledBitmapFromResource(getResources(), R.id.imageView27, 100, 100));

    }

    public static int calculateInSampleSize(
            BitmapFactory.Options options, int reqWidth, int reqHeight) {
        // Raw height and width of image
        final int height = options.outHeight;
        final int width = options.outWidth;
        int inSampleSize = 1;

        if (height > reqHeight || width > reqWidth) {

            final int halfHeight = height / 2;
            final int halfWidth = width / 2;

            // Calculate the largest inSampleSize value that is a power of 2 and keeps both
            // height and width larger than the requested height and width.
            while ((halfHeight / inSampleSize) >= reqHeight
                    && (halfWidth / inSampleSize) >= reqWidth) {
                inSampleSize *= 2;
            }
        }

        return inSampleSize;
    }

    public static Bitmap decodeSampledBitmapFromResource(Resources res, int resId,
                                                         int reqWidth, int reqHeight) {

        // First decode with inJustDecodeBounds=true to check dimensions
        final BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeResource(res, resId, options);

        // Calculate inSampleSize
        options.inSampleSize = calculateInSampleSize(options, reqWidth, reqHeight);

        // Decode bitmap with inSampleSize set
        options.inJustDecodeBounds = false;
        return BitmapFactory.decodeResource(res, resId, options);

  */  }
}