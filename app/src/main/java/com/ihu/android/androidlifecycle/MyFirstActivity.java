package com.ihu.android.androidlifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

/**
 * Created by christofer on 18/05/15.
 * source: http://www.eazytutz.com/android/android-activity-lifecycle/
 */
public class MyFirstActivity extends Activity {

    public static final String TAG = "MyFirstActivity";

    /**
     * When we launch an Activity in Android, it first calls the onCreate() method.
     * This is where we do User Interface creation and initialization of data elements.
     * This method is provided with a Bundle object as parameter to restore the UI state.
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.v(TAG, "onCreate");
        setContentView(R.layout.my_first_layout);
    }

    /**
     * onStart() method is called before the Activity is being visible to the User.
     * Remember that Activity is still not Active.
     */
    @Override
    protected void onStart() {
        super.onStart();
        Log.v(TAG, "onStart");
    }

    /**
     * With the onResume() method, the Activity become visible and Active for the user to
     * interact with. The Activity will be at the top of the Activity stack at this point.
     * Now the Activity is in running /active state and is able to receive user inputs.
     */
    @Override
    protected void onResume() {
        super.onResume();
        Log.v(TAG, "onResume");
    }

    /**
     * In the Active state, onPause() method will be called when the system is about to
     * resume another Activity on top of this one or when the user is about to navigate
     * to some other other parts of the system. It is the last guaranteed call to a method
     * before the Activity  can get killed by the system. That is, there’s a possibility
     * that your activity may be killed by the system at the paused state without executing
     * any further method calls. Therefore it is important to save the user interface
     * configuration and critical data at this method.
     */
    @Override
    protected void onPause() {
        super.onPause();
        Log.v(TAG, "onPause");
    }

    /**
     * System kills it to free resources. An activity under stopped sate is more likely to be
     * killed by the system than one in the paused state. It needs to start the cycle again with
     * onCreate().
     * It get restarted by calling onRestart() , onStart() and onResume() methods in the order
     * if the user navigates back to the Activity again. In this case, the User Interface is
     * intact and no need to be restored.
     */
    @Override
    protected void onStop() {
        super.onStop();
        Log.v(TAG, "onStop");
    }

    /**
     * onDestroy() method is called and the Activity is destroyed. This is the final method
     * we can call before the Activity is destroyed. This occurs either because the Activity
     * is finishing the operation or the system is temporarily destroying it to save space..
     */
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v(TAG, "onDestroy");
    }

}