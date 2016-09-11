package cn.edu.bistu.cs.se.fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link DetailFragment.OnFragmentInteractionListener} interface
 * to handle interaction events.
 * Use the {@link DetailFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class DetailFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "id";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public DetailFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment DetailFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static DetailFragment newInstance(String param1, String param2) {
        DetailFragment fragment = new DetailFragment();
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
        View view= inflater.inflate(R.layout.fragment_detail,container,false);
        TextView textViewWord= (TextView)view.findViewById(R.id.word);
        TextView textViewWordMeaning= (TextView)view.findViewById(R.id.wordmeaning);
        TextView textViewWordSample= (TextView)view.findViewById(R.id.wordsample);
        TextView textViewWordSampleMean= (TextView)view.findViewById(R.id.wordsamplemeaning);
        switch (mParam1){
            case "1":
                textViewWord.setText("apple");
                textViewWordMeaning.setText("苹果");
                textViewWordSample.setText("This apple is very nice.");
                textViewWordSampleMean.setText("这个苹果很好吃。");
                break;
            case  "2":
                textViewWord.setText("Orange");
                textViewWordMeaning.setText("橘子");
                textViewWordSample.setText("An orange a day will give you all the vitamin C you need.");
                textViewWordSampleMean.setText("每天吃一个橙子能充分摄取所需的维生素C。");
                break;
            case "3":
                textViewWord.setText("computer");
                textViewWordMeaning.setText("计算机");
                textViewWordSample.setText("The data are then fed into a computer");
                textViewWordSampleMean.setText("数据随后被输入电脑。");
                break;
            case "4":
                textViewWord.setText("football");
                textViewWordMeaning.setText("足球");
                textViewWordSample.setText("Several boys were still playing football on the waste ground..");
                textViewWordSampleMean.setText("几个男孩还在那片废弃的空地上踢足球。");
        }

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String id) {
        if (mListener != null) {
            mListener.onFragmentInteraction(id);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(String id);
    }
}
