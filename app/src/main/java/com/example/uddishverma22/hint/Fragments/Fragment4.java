package com.example.uddishverma22.hint.Fragments;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.uddishverma22.hint.MainActivity;
import com.example.uddishverma22.hint.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * to handle interaction events.
 * Use the {@link Fragment4#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Fragment4 extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    TextView tv, sometimes, rare, never, often, cantsay;
    Animation animation;

    public Fragment4() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Fragment4.
     */
    // TODO: Rename and change types and number of parameters
    public static Fragment4 newInstance(String param1, String param2) {
        Fragment4 fragment = new Fragment4();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v =  inflater.inflate(R.layout.fragment_fragment4, container, false);

        animation = AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);

        tv = (TextView) v.findViewById(R.id.tv4);
        sometimes = (TextView) v.findViewById(R.id.some_butt);
        rare = (TextView) v.findViewById(R.id.rarely_butt);
        never = (TextView) v.findViewById(R.id.never_butt);
        often = (TextView) v.findViewById(R.id.often_butt);
        cantsay = (TextView) v.findViewById(R.id.cant_butt);

        sometimes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.work_interfere = 0;
                MainActivity.viewPager.setCurrentItem(4);
            }
        });

        rare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.work_interfere = 2;
                MainActivity.viewPager.setCurrentItem(4);
            }
        });

        never.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.work_interfere = 1;
                MainActivity.viewPager.setCurrentItem(4);
            }
        });

        often.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.work_interfere = 3;
                MainActivity.viewPager.setCurrentItem(4);
            }
        });

        cantsay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MainActivity.work_interfere = 4;
                MainActivity.viewPager.setCurrentItem(4);
            }
        });

        Typeface tf = Typeface.createFromAsset(getContext().getAssets(),"fonts/Raleway-Regular.ttf");
        tv.setTypeface(tf);
        tv.setAnimation(animation);
        return v;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */

}
