package com.example.lewis.food;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.LinkedList;



public class WordListAdapter extends RecyclerView.Adapter<WordListAdapter.WordViewHolder> {

    private final LinkedList<String> mWordList;
    private final LinkedList<String> mDescription;
    private ArrayList<String> mImages = new ArrayList<>();
    private Context mcontext;

    public WordListAdapter(Context mcontext,LinkedList<String> mWordList, ArrayList<String> mImages,LinkedList<String>mDescription ) {
        this.mWordList = mWordList;
        this.mImages = mImages;
        this.mcontext = mcontext;
        this.mDescription = mDescription;
    }

    ImageView img;
    private int imageResource;


    private LayoutInflater mInflater;

    public WordListAdapter(Context context, LinkedList<String> mWordList, LinkedList<String> mDescription) {
        mInflater = LayoutInflater.from(context);
        this.mWordList = mWordList;
        this.mDescription = mDescription;
    }

    @NonNull
    @Override
    public WordViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
      //  View mItemView = mInflater.inflate(R.layout.wordlist_item, parent, false);
        View mItemView = mInflater.from(parent.getContext()).inflate(R.layout.wordlist_item, parent, false)  ;
        WordViewHolder holder = new WordViewHolder(mItemView) ;

        //return new WordViewHolder(mItemView, this);
        return holder;

    }
             public Integer[] defaultpics = { R.drawable.bcb,R.drawable.las, R.drawable.macncheese,R.drawable.jcc,R.drawable.icb,R.drawable.chai,R.drawable.liit };

    @Override
    public void onBindViewHolder(@NonNull WordListAdapter.WordViewHolder holder, int position) {
        Glide.with(mcontext)  .asBitmap().load(mImages.get(position)) .into(holder.img)  ;
        //holder.imagename.setText(mImages.get)
        String mCurrent = mWordList.get(position);
        holder.wordItemView.setText(mCurrent);
        holder.description.setText(mCurrent);
    }

    @Override
    public int getItemCount() {
        return mWordList.size();
    }

    public int getImageResource() {
        return imageResource;
    }

    class WordViewHolder extends RecyclerView.ViewHolder implements  View.OnClickListener {
        public final TextView wordItemView;
        TextView description;
        ImageView img;
      //  final WordListAdapter mAdapter;

        public WordViewHolder(View itemView) {  //      , WordListAdapter adapter
            super(itemView);
            img = itemView.findViewById(R.id.img);
            wordItemView = (TextView) itemView.findViewById(R.id.word);
            description = itemView.findViewById(R.id.Description);
            //this.mAdapter = adapter;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            int mPosition = getLayoutPosition();
            String element = mWordList.get(mPosition);
            mWordList.set(mPosition, "Clicked! " + element);
            //mAdapter.notifyDataSetChanged();
        }
    }


}
