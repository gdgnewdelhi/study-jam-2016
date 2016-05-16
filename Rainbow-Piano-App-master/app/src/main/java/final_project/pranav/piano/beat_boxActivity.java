package final_project.pranav.piano;


import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.List;

/**
 * Created by PRANAV on 5/1/2016.
 */
public class beat_boxActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final MediaPlayer play1 = MediaPlayer.create(beat_boxActivity.this, R.raw.drumbeat1);
        final MediaPlayer play2 = MediaPlayer.create(beat_boxActivity.this, R.raw.drumbeat2);
        final MediaPlayer play3 = MediaPlayer.create(beat_boxActivity.this, R.raw.drumbeat3);
        final MediaPlayer play4 = MediaPlayer.create(beat_boxActivity.this, R.raw.drumbeat4);
        final MediaPlayer play5 = MediaPlayer.create(beat_boxActivity.this, R.raw.dubstep1);
        final MediaPlayer play6 = MediaPlayer.create(beat_boxActivity.this, R.raw.dubstep2);

        Button b1 = (Button) this.findViewById(R.id.beat1);
        b1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (play1.isPlaying()) {
                    play1.stop();
                    play1.release();
                } else if (play2.isPlaying()) {
                    play2.stop();
                    play2.release();
                } else if (play3.isPlaying()) {
                    play3.stop();
                    play3.release();
                } else if (play4.isPlaying()) {
                    play4.stop();
                    play4.release();
                } else if (play5.isPlaying()) {
                    play5.stop();
                    play5.release();
                } else if (play6.isPlaying()) {
                    play6.stop();
                    play6.release();
                }
                else {
                    play1.start();
                    play1.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        public void onCompletion(MediaPlayer mp) {
                            mp.release();
                        }
                    });
                }}
        });

        Button b2 = (Button) this.findViewById(R.id.beat2);
        b2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (play1.isPlaying()) {
                    play1.stop();
                    play1.release();
                } else if (play2.isPlaying()) {
                    play2.stop();
                    play2.release();
                } else if (play3.isPlaying()) {
                    play3.stop();
                    play3.release();
                } else if (play4.isPlaying()) {
                    play4.stop();
                    play4.release();
                } else if (play5.isPlaying()) {
                    play5.stop();
                    play5.release();
                } else if (play6.isPlaying()) {
                    play6.stop();
                    play6.release();
                }
                else{
                play2.start();
                play2.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }}
        });

        Button b3 = (Button) this.findViewById(R.id.beat3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (play1.isPlaying()) {
                    play1.stop();
                    play1.release();
                } else if (play2.isPlaying()) {
                    play2.stop();
                    play2.release();
                } else if (play3.isPlaying()) {
                    play3.stop();
                    play3.release();
                } else if (play4.isPlaying()) {
                    play4.stop();
                    play4.release();
                } else if (play5.isPlaying()) {
                    play5.stop();
                    play5.release();
                } else if (play6.isPlaying()) {
                    play6.stop();
                    play6.release();
                }
                play3.start();
                play3.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });


        Button b4 = (Button) this.findViewById(R.id.beat4);
        b4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (play1.isPlaying()) {
                    play1.stop();
                    play1.release();
                } else if (play2.isPlaying()) {
                    play2.stop();
                    play2.release();
                } else if (play3.isPlaying()) {
                    play3.stop();
                    play3.release();
                } else if (play4.isPlaying()) {
                    play4.stop();
                    play4.release();
                } else if (play5.isPlaying()) {
                    play5.stop();
                    play5.release();
                } else if (play6.isPlaying()) {
                    play6.stop();
                    play6.release();
                }
                play4.start();
                play4.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        Button b5 = (Button) this.findViewById(R.id.beat5);
        b5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (play1.isPlaying()) {
                    play1.stop();
                    play1.release();
                } else if (play2.isPlaying()) {
                    play2.stop();
                    play2.release();
                } else if (play3.isPlaying()) {
                    play3.stop();
                    play3.release();
                } else if (play4.isPlaying()) {
                    play4.stop();
                    play4.release();
                } else if (play5.isPlaying()) {
                    play5.stop();
                    play5.release();
                } else if (play6.isPlaying()) {
                    play6.stop();
                    play6.release();
                }
                play5.start();
                play5.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

        Button b6 = (Button) this.findViewById(R.id.beat6);
        b6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if (play1.isPlaying()) {
                    play1.stop();
                    play1.release();
                } else if (play2.isPlaying()) {
                    play2.stop();
                    play2.release();
                } else if (play3.isPlaying()) {
                    play3.stop();
                    play3.release();
                } else if (play4.isPlaying()) {
                    play4.stop();
                    play4.release();
                } else if (play5.isPlaying()) {
                    play5.stop();
                    play5.release();
                } else if (play6.isPlaying()) {
                    play6.stop();
                    play6.release();
                }
                play6.start();
                play6.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }
                });
            }
        });

    }
    //@Override
    //protected void onFinish() {
      //  beat_boxActivity.finishActivity(0);
    //};
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if ((keyCode == KeyEvent.KEYCODE_BACK))
        {
            this.finish();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}
