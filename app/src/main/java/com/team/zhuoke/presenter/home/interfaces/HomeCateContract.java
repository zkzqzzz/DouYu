package com.team.zhuoke.presenter.home.interfaces;


import android.content.Context;

import com.team.zhuoke.base.BaseModel;
import com.team.zhuoke.base.BasePresenter;
import com.team.zhuoke.base.BaseView;
import com.team.zhuoke.model.logic.home.HomeCate;

import java.util.List;

import rx.Observable;

import static com.team.zhuoke.api.NetWorkApi.getHomeCate;

/**
 *  作者：gaoyin
 *  电话：18810474975
 *  邮箱：18810474975@163.com
 *  版本号：1.0
 *  类描述：
 *  备注消息：
 *  修改时间：2016/12/12 下午4:04
 **/
public interface HomeCateContract {
    interface View extends BaseView {
       void getOtherList(List<HomeCate> homeCates);
    }
    interface  Model extends BaseModel {
        Observable<List<HomeCate>> getHomeCate(Context context,String identification);
    }
    abstract class Presenter extends BasePresenter<View,Model> {
        public abstract void  getHomeCate(String identification);
    }
}