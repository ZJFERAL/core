package com.zjf.lib.presenter;

/**
 * @author :ZJF
 * @version : 2016-12-16 下午 4:14
 */

public interface BasePresenter<V> {

    void onCreate(V view);

    void onViewAttached();

    void onViewDetached();

    void onDestroyed();

}
