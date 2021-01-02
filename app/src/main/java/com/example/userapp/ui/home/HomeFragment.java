package com.example.userapp.ui.home;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.userapp.R;
import com.smarteist.autoimageslider.DefaultSliderView;
import com.smarteist.autoimageslider.IndicatorAnimations;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderLayout;

public class HomeFragment extends Fragment {

    private SliderLayout sliderLayout;
    private  ImageView map;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_home, container, false);

        //fine Slider layout using View
        sliderLayout = view.findViewById(R.id.imageSlider);
        //Access properties of SliderLayout
        sliderLayout.setIndicatorAnimation(IndicatorAnimations.DROP);
        sliderLayout.setSliderTransformAnimation(SliderAnimations.FADETRANSFORMATION);
        sliderLayout.setScrollTimeInSec(1);
        
        setSlideImage();    //method for set images

        map = view.findViewById(R.id.map);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openMap();   //Method For Open Map
            }
        });
        return view;


    }

    private void openMap() {
        Uri uri = Uri.parse("geo:0, 0?q=International Islamic University Chittagong");
        Intent intent = new Intent(Intent.ACTION_VIEW,uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);
    }

    private void setSlideImage() {
        for (int i = 0 ; i < 5; i++){
            DefaultSliderView sliderView = new DefaultSliderView(getContext());

            switch (i){
               /* case 0:
                    sliderView.setDescription();*/
                case 0:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/university-information-s-47f46.appspot.com/o/slideImages%2Fi.jpg?alt=media&token=9c7b616c-5252-4a49-99f5-dc588e3e6ce3");
                    break;
                case 1:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/university-information-s-47f46.appspot.com/o/slideImages%2Fim.jpg?alt=media&token=3f9e1f18-1c3f-43e4-a517-d76011712c77");
                    break;
                case 2:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/university-information-s-47f46.appspot.com/o/slideImages%2Fima.jpg?alt=media&token=cd144e44-fac3-4ec3-aa8b-578e800897dc");
                    break;
                case 3:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/university-information-s-47f46.appspot.com/o/slideImages%2Fimag.jpg?alt=media&token=4b50df0c-12e9-44d2-83e6-ed2af0949b6c");
                    break;
                case 4:
                    sliderView.setImageUrl("https://firebasestorage.googleapis.com/v0/b/university-information-s-47f46.appspot.com/o/slideImages%2Fimage.jpg?alt=media&token=e32b6d92-95e9-49d9-ad4a-062366b30ecb");
                    break;
            }
            //image scale
            sliderView.setImageScaleType(ImageView.ScaleType.CENTER_CROP);
            sliderLayout.addSliderView(sliderView);
        }
    }
}