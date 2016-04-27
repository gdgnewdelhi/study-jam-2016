package com.example.android.mcdonalds;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.LoaderManager;
import android.app.LoaderManager.LoaderCallbacks;
import android.content.*;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.database.sqlite.*;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.*;
import android.widget.Button;
import android.widget.EditText;

public class signingup extends AppCompatActivity implements LoaderManager.LoaderCallbacks<Cursor> {


    DBHelper mydb=new DBHelper(this);
    private static final int REQUEST_READ_CONTACTS = 0;

    /**
     * A dummy authentication store containing known user names and passwords.
     * TODO: remove after connecting to a real authentication system.
     */
    private static final String[] DUMMY_CREDENTIALS = new String[]{
            "foo@example.com:hello", "bar@example.com:world"
    };

    private LoginActivity.UserLoginTask mAuthTask = null;
    private View mProgressView;
    private View mLoginFormView;
    private EditText mNameView;
    private EditText mContactView;
    private EditText mIdView;
    private EditText mPasswordView;
    public static String  name ;
    public static String contact;
    public String id;
    public String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signingup);

        mNameView = (EditText) findViewById(R.id.name_sign_up);
        mContactView = (EditText) findViewById(R.id.contact_sign_up);
        mIdView = (EditText) findViewById(R.id.loginId_sign_up);
        mPasswordView = (EditText) findViewById(R.id.password_sign_up);


        mProgressView = findViewById(R.id.signUp_progress);

        Button mSignUpButton = (Button) findViewById(R.id.sign_up_button);
        mSignUpButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                attemptLogin();
            }
        });

    }


    public void attemptLogin() {
        if (mAuthTask != null) {
            return;
        }


        name = mNameView.getText().toString();
        contact = mContactView.getText().toString();
        id = mIdView.getText().toString();
        password = mPasswordView.getText().toString();
        mNameView.setError(null);

        mContactView.setError(null);
        mIdView.setError(null);
        mPasswordView.setError(null);


        // Store values at the time of the login attempt.


        boolean cancel = false;
        View focusView = null;
        if (TextUtils.isEmpty(name)) {
            mNameView.setError(getString(R.string.error_field_required));
            focusView = mNameView;
            cancel = true;
        }
        if (TextUtils.isEmpty(contact)) {
            mContactView.setError(getString(R.string.error_field_required));
            focusView = mContactView;
            cancel = true;
        }
        // Check for a valid email address.
        if ((TextUtils.isEmpty(id))||(!isEmailValid(id))) {
            mIdView.setError(getString(R.string.error_invalid_email));
            focusView = mIdView;
            cancel = true;
        }



        // Check for a valid password, if the user entered one.
        if ((TextUtils.isEmpty(password))) {
            mPasswordView.setError(getString(R.string.error_invalid_password));
            focusView = mPasswordView;
            cancel = true;
        }





        if (cancel) {
            // There was an error; don't attempt login and focus the first
            // form field with an error.
            focusView.requestFocus();
        } else {
            // Show a progress spinner, and kick off a background task to
            // perform the user login attempt.
            if(mydb.insertUser(name, contact, id, password)) {


                signUpClick();
            }
        }

    }

    private boolean isEmailValid(String email) {
        //TODO: Replace this with your own logic
        return email.contains("@");
    }

    private boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

    private void showProgress(final boolean show) {
        // On Honeycomb MR2 we have the ViewPropertyAnimator APIs, which allow
        // for very easy animations. If available, use these APIs to fade-in
        // the progress spinner.
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB_MR2) {
            int shortAnimTime = getResources().getInteger(android.R.integer.config_shortAnimTime);

            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
            mLoginFormView.animate().setDuration(shortAnimTime).alpha(
                    show ? 0 : 1).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
                }
            });

            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mProgressView.animate().setDuration(shortAnimTime).alpha(
                    show ? 1 : 0).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animation) {
                    mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
                }
            });
        } else {
            // The ViewPropertyAnimator APIs are not available, so simply show
            // and hide the relevant UI components.
            mProgressView.setVisibility(show ? View.VISIBLE : View.GONE);
            mLoginFormView.setVisibility(show ? View.GONE : View.VISIBLE);
        }
    }

    public void signUpClick() {
        Context context = getApplicationContext();
        CharSequence text = "You have successfully Signed Up";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        Intent intent;


        intent = new Intent(this, mainPage.class);


        startActivity(intent);

    }

    @Override
    public Loader<Cursor> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<Cursor> loader, Cursor data) {

    }

    @Override
    public void onLoaderReset(Loader<Cursor> loader) {

    }


}


