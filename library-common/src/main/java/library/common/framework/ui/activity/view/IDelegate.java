/*
 * Copyright (c) 2015, 张涛.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package library.common.framework.ui.activity.view;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * View delegate base class
 * 视图层代理的接口协议
 *
 * @author hiphonezhu@gmail.com
 * @version [AndroidLibrary, 2018-3-6]
 */
public interface IDelegate {
    void create(Context context, LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
    
    void create(Fragment fragment, LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState);
    
    void initWidget();
    
    void onShow();
    
    void onHide();
    
    boolean isVisible();
    
    void onDestroy();
    
    int getOptionsMenuId();
    
    Toolbar getToolbar();
    
    /**
     * 返回 Activity、Fragment、Dialog 的内容布局
     * @return
     */
    View getContentView();
}
