package com.qefee.pj.ebase.activity;

import android.support.v7.app.AppCompatActivity;

import com.qefee.pj.elog.ELog;
import com.qefee.pj.etoast.EToast;

/**
 * EBaseActivity.
 * <ul>
 * <li>date: 16/9/11</li>
 * </ul>
 *
 * @author tongjin
 */
public class EBaseActivity extends AppCompatActivity {

    /**
     * tag for log
     * @return tag(class name)
     */
    public String getTag() {
        return this.getClass().getName();
    }

    /**
     * log v
     * @param msg msg
     */
    public int v(String msg) {
        return ELog.v(getTag(), msg);
    }

    /**
     * log v
     * @param msg msg
     * @param tr Throwable
     */
    public int v(String msg, Throwable tr) {
        return ELog.v(getTag(), msg, tr);
    }

    /**
     * log d
     * @param msg msg
     */
    public int d(String msg) {
        return ELog.d(getTag(), msg);
    }

    /**
     * log d
     * @param msg msg
     * @param tr Throwable
     */
    public int d(String msg, Throwable tr) {
        return ELog.d(getTag(), msg, tr);
    }

    /**
     * log i
     * @param msg msg
     */
    public int i(String msg) {
        return ELog.i(getTag(), msg);
    }

    /**
     * log i
     * @param msg msg
     * @param tr Throwable
     */
    public int i(String msg, Throwable tr) {
        return ELog.i(getTag(), msg, tr);
    }

    /**
     * log w
     * @param msg msg
     */
    public int w(String msg) {
        return ELog.w(getTag(), msg);
    }

    /**
     * log w
     * @param msg msg
     * @param tr Throwable
     */
    public int w(String msg, Throwable tr) {
        return ELog.w(getTag(), msg, tr);
    }

    /**
     * log w
     * @param tr Throwable
     */
    public int w(Throwable tr) {
        return ELog.w(getTag(), tr);
    }

    /**
     * log e
     * @param msg msg
     */
    public int e(String msg) {
        return ELog.e(getTag(), msg);
    }

    /**
     * log e
     * @param msg msg
     * @param tr Throwable
     */
    public int e(String msg, Throwable tr) {
        return ELog.e(getTag(), msg, tr);
    }

    /**
     * show a toast
     * @param text text
     */
    public void showToast(CharSequence text) {
        EToast.show(this, text);
    }

    /**
     * show a toast
     * @param text text
     * @param isLong is long
     */
    public void showToast(CharSequence text, boolean isLong) {
        EToast.show(this, text, isLong);
    }

    /**
     * show a toast
     * @param resId resId
     */
    public void showToast(int resId) {
        EToast.show(this, resId);
    }

    /**
     * show a toast
     * @param resId resId
     * @param isLong is long
     */
    public void showToast(int resId, boolean isLong) {
        EToast.show(this, resId, isLong);
    }
}
