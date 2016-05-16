/**
 * Created by PRANAV on 5/1/2016.
 */
package final_project.pranav.piano;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class pianoActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //PIANO CODE

        //White Keys
        Button c3 = (Button) this.findViewById(R.id.c3);
        c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button c31 = (Button) this.findViewById(R.id.c31);
        c31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button c32 = (Button) this.findViewById(R.id.c32);
        c32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button d3 = (Button) this.findViewById(R.id.d3);
        d3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.d3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button d31 = (Button) this.findViewById(R.id.d31);
        d31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.d3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button e3 = (Button) this.findViewById(R.id.e3);
        e3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.e3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button e31 = (Button) this.findViewById(R.id.e31);
        e31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.e3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button e32 = (Button) this.findViewById(R.id.e32);
        e32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.e3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button f3 = (Button) this.findViewById(R.id.f3);
        f3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.f3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button f31 = (Button) this.findViewById(R.id.f31);
        f31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.f3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button f32 = (Button) this.findViewById(R.id.f32);
        f32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.f3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button g3 = (Button) this.findViewById(R.id.g3);
        g3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.g3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button g31 = (Button) this.findViewById(R.id.g31);
        g31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.g3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button a3 = (Button) this.findViewById(R.id.a3);
        a3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.a3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button a31 = (Button) this.findViewById(R.id.a31);
        a31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.a3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button b3 = (Button) this.findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.b3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button b31 = (Button) this.findViewById(R.id.b31);
        b31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.b3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button b32 = (Button) this.findViewById(R.id.b32);
        b32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.b3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button c4 = (Button) this.findViewById(R.id.c4);
        c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button c41 = (Button) this.findViewById(R.id.c41);
        c41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button c42 = (Button) this.findViewById(R.id.c42);
        c42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button d4 = (Button) this.findViewById(R.id.d4);
        d4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.d4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button d41 = (Button) this.findViewById(R.id.d41);
        d41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.d4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button e4 = (Button) this.findViewById(R.id.e4);
        e4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.e4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button e41 = (Button) this.findViewById(R.id.e41);
        e41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.e4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button e42 = (Button) this.findViewById(R.id.e42);
        e42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.e4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        //Black Keys
        Button c_31 = (Button) this.findViewById(R.id.c_31);
        c_31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button c_32 = (Button) this.findViewById(R.id.c_32);
        c_32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button d_31 = (Button) this.findViewById(R.id.d_31);
        d_31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.d_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button d_32 = (Button) this.findViewById(R.id.d_32);
        d_32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.d_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button f_31 = (Button) this.findViewById(R.id.f_31);
        f_31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.f_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button f_32 = (Button) this.findViewById(R.id.f_32);
        f_32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.f_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button g_31 = (Button) this.findViewById(R.id.g_31);
        g_31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.g_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button g_32 = (Button) this.findViewById(R.id.g_32);
        g_32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.g_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button a_31 = (Button) this.findViewById(R.id.a_31);
        a_31.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.a_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button a_32 = (Button) this.findViewById(R.id.a_32);
        a_32.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.a_3);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button c_41 = (Button) this.findViewById(R.id.c_41);
        c_41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c_4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button c_42 = (Button) this.findViewById(R.id.c_42);
        c_42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.c_4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

        Button d_41 = (Button) this.findViewById(R.id.d_41);
        d_41.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.d_4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });
        Button d_42 = (Button) this.findViewById(R.id.d_42);
        d_42.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                final MediaPlayer play = MediaPlayer.create(pianoActivity.this, R.raw.d_4);
                play.start();
                play.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                    public void onCompletion(MediaPlayer mp) {
                        mp.release();
                    }

                    ;
                });
            }
        });

    }
}

