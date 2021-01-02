package com.example.userapp.ui.about;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.userapp.R;

import java.util.ArrayList;
import java.util.List;


public class AboutFragment extends Fragment {

    private ViewPager viewPager;
    private BranchAdapter adapter;
    private List<BranchModel> list;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_about, container, false);
        list = new ArrayList<>();
        list.add(new BranchModel(R.drawable.ic_computer,"Computer Science","“The mission of the Department of Computer Science and Engineering is to offer the strong academic program needed to produce well-educated students who can become productive members of the Computer Science and Engineering profession. This mission is consistent with the academic component of the University's mission, which is in part to provide a strong academic program in engineering.”"));
        list.add(new BranchModel(R.drawable.ic_machnical,"Electrical Engineering","The Department of Electrical & Electronics Engineering (EEE) at the International Islamic University Chittagong works with the mission of providing its students with a high quality education so that they are well prepared to become high caliber Electrical and Electronic engineers and it aspires to grow to the level of gaining global recognition. They are capable of designing modern & advanced circuits with diverse applications ranging from low voltage to extra high voltage applications by their professional ethics and leadership qualities."));
        list.add(new BranchModel(R.drawable.ic_pharmacy,"Pharmacy","The Department of Pharmacy is currently being served by highly competent faculty members with degrees from reputed home and foreign universities of varied backgrounds, excellent academic tracks, research aptitude and professional expertise which will ensure the quality education, generate profound research and analytical skill. Eminent Professors from different universities and distinguished professional experts from various Pharmaceutical Industries are involved in manifold academic activities."));

        adapter = new BranchAdapter(getContext(),list);
        viewPager = view.findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        ImageView imageView = view.findViewById(R.id.uni_image);
        Glide.with(getContext())
                .load("https://firebasestorage.googleapis.com/v0/b/university-information-s-47f46.appspot.com/o/slideImages%2Fim.jpg?alt=media&token=3f9e1f18-1c3f-43e4-a517-d76011712c77")
                .into(imageView);

        return view;
    }
}