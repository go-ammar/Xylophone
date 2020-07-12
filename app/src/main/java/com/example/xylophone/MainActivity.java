package com.example.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    private final int no_of_sim_sounds = 7;
    private final float left_volume =1.0f;
    private final float right_volume =1.0f;
    private final int no_loop = 0;
    private final int priority =0;
    private final float normal_play_rate =1.0f;

    //todo create member variables
    private SoundPool mSoundPool;
    private int mCsoundId;
    private int mDsoundId;
    private int mEsoundId;
    private int mFsoundId;
    private int mGsoundId;
    private int mAsoundId;
    private int mBsoundId;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSoundPool= new SoundPool(no_of_sim_sounds, AudioManager.STREAM_MUSIC, 0);

        mCsoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c, 1);
        mDsoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d, 1);
        mEsoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e, 1);
        mFsoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f, 1);
        mGsoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g, 1);
        mAsoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a, 1);
        mBsoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b, 1);

    }

    public void playC(View v){
        mSoundPool.play(mCsoundId,left_volume,right_volume,priority,no_loop,normal_play_rate);
    }

    public void playD(View v){
        mSoundPool.play(mDsoundId, left_volume,right_volume,priority,no_loop,normal_play_rate);

    }

    public void playE(View v){
        mSoundPool.play(mEsoundId,left_volume,right_volume,priority,no_loop,normal_play_rate);

    }

    public void playF(View v){
        mSoundPool.play(mFsoundId,left_volume,right_volume,priority,no_loop,normal_play_rate);

    }

    public void playG(View v){
        mSoundPool.play(mGsoundId,left_volume,right_volume,priority,no_loop,normal_play_rate);

    }

    public void playA(View v){
        mSoundPool.play(mAsoundId,left_volume,right_volume,priority,no_loop,normal_play_rate);

    }

    public void playB(View v){
        mSoundPool.play(mBsoundId,left_volume,right_volume,priority,no_loop,normal_play_rate);

    }
}