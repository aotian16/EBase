package com.qefee.pj.ebase.fragment;

import android.app.Fragment;

import com.qefee.pj.elog.ELog;
import com.qefee.pj.etoast.EToast;

/**
 * EBaseFragment.
 * <ul>
 * <li>date: 16/9/11</li>
 * </ul>
 *
 * @author tongjin
 */
public class EBaseFragment extends Fragment {

    /**
     * tag for log
     * @return tag(class name)
     */
    public String getLogTag() {
        return this.getClass().getName();
    }

    /**
     * log v
     * @param msg msg
     */
    public int v(String msg) {
        return ELog.v(getLogTag(), msg);
    }

    /**
     * log v
     * @param msg msg
     * @param tr Throwable
     */
    public int v(String msg, Throwable tr) {
        return ELog.v(getLogTag(), msg, tr);
    }

    /**
     * log d
     * @param msg msg
     */
    public int d(String msg) {
        return ELog.d(getLogTag(), msg);
    }

    /**
     * log d
     * @param msg msg
     * @param tr Throwable
     */
    public int d(String msg, Throwable tr) {
        return ELog.d(getLogTag(), msg, tr);
    }

    /**
     * log i
     * @param msg msg
     */
    public int i(String msg) {
        return ELog.i(getLogTag(), msg);
    }

    /**
     * log i
     * @param msg msg
     * @param tr Throwable
     */
    public int i(String msg, Throwable tr) {
        return ELog.i(getLogTag(), msg, tr);
    }

    /**
     * log w
     * @param msg msg
     */
    public int w(String msg) {
        return ELog.w(getLogTag(), msg);
    }

    /**
     * log w
     * @param msg msg
     * @param tr Throwable
     */
    public int w(String msg, Throwable tr) {
        return ELog.w(getLogTag(), msg, tr);
    }

    /**
     * log w
     * @param tr Throwable
     */
    public int w(Throwable tr) {
        return ELog.w(getLogTag(), tr);
    }

    /**
     * log e
     * @param msg msg
     */
    public int e(String msg) {
        return ELog.e(getLogTag(), msg);
    }

    /**
     * log e
     * @param msg msg
     * @param tr Throwable
     */
    public int e(String msg, Throwable tr) {
        return ELog.e(getLogTag(), msg, tr);
    }

    /**
     * show a toast
     * @param text text
     */
    public void showToast(CharSequence text) {
        EToast.show(getActivity(), text);
    }

    /**
     * show a toast
     * @param text text
     * @param isLong is long
     */
    public void showToast(CharSequence text, boolean isLong) {
        EToast.show(getActivity(), text, isLong);
    }

    /**
     * show a toast
     * @param resId resId
     */
    public void showToast(int resId) {
        EToast.show(getActivity(), resId);
    }

    /**
     * show a toast
     * @param resId resId
     * @param isLong is long
     */
    public void showToast(int resId, boolean isLong) {
        EToast.show(getActivity(), resId, isLong);
    }
}
