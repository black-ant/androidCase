package com.example.myapplication.common;

import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.logging.Logger;

/**
 * @Classname CommonTitleBar
 * @Description TODO
 * @Date 2021/1/30 17:25
 * @Created by zengzg
 */

public class CommonTitleBar extends RelativeLayout implements View.OnClickListener {

    private View viewStatusBarFill;                     // 状态栏填充视图
    private View viewBottomLine;                        // 分隔线视图
    private View viewBottomShadow;                      // 底部阴影
    private RelativeLayout rlMain;                      // 主视图

    private TextView tvLeft;                            // 左边TextView
    private ImageButton btnLeft;                        // 左边ImageButton
    private View viewCustomLeft;
    private TextView tvRight;                           // 右边TextView
    private ImageButton btnRight;                       // 右边ImageButton
    private View viewCustomRight;
    private LinearLayout llMainCenter;
    private TextView tvCenter;                          // 标题栏文字
    private TextView tvCenterSub;                       // 副标题栏文字
    private ProgressBar progressCenter;                 // 中间进度条,默认隐藏
    private RelativeLayout rlMainCenterSearch;          // 中间搜索框布局
    private EditText etSearchHint;
    private ImageView ivSearch;
    private ImageView ivVoice;
    private View centerCustomView;                      // 中间自定义视图

    private boolean fillStatusBar;                      // 是否撑起状态栏, true时,标题栏浸入状态栏
    private int titleBarColor;                          // 标题栏背景颜色
    private int titleBarHeight;                         // 标题栏高度
    private int statusBarColor;                         // 状态栏颜色
    private int statusBarMode;                          // 状态栏模式

    private boolean showBottomLine;                     // 是否显示底部分割线
    private int bottomLineColor;                        // 分割线颜色
    private float bottomShadowHeight;                   // 底部阴影高度

    private int leftType;                               // 左边视图类型
    private String leftText;                            // 左边TextView文字
    private int leftTextColor;                          // 左边TextView颜色
    private float leftTextSize;                         // 左边TextView文字大小
    private int leftDrawable;                           // 左边TextView drawableLeft资源
    private float leftDrawablePadding;                  // 左边TextView drawablePadding
    private int leftImageResource;                      // 左边图片资源
    private int leftCustomViewRes;                      // 左边自定义视图布局资源
    private int leftBackroundDrawable;

    private int rightType;                              // 右边视图类型
    private String rightText;                           // 右边TextView文字
    private int rightTextColor;                         // 右边TextView颜色
    private float rightTextSize;                        // 右边TextView文字大小
    private int rightImageResource;                     // 右边图片资源
    private int rightCustomViewRes;                     // 右边自定义视图布局资源

    private int centerType;                             // 中间视图类型
    private String centerText;                          // 中间TextView文字
    private int centerTextColor;                        // 中间TextView字体颜色
    private float centerTextSize;                       // 中间TextView字体大小
    private boolean centerTextMarquee;                  // 中间TextView字体是否显示跑马灯效果
    private String centerSubText;                       // 中间subTextView文字
    private int centerSubTextColor;                     // 中间subTextView字体颜色
    private float centerSubTextSize;                    // 中间subTextView字体大小
    private boolean centerSearchEditable;                // 搜索框是否可输入
    private int centerSearchBgResource;                 // 搜索框背景图片
    private int centerSearchRightType;                  // 搜索框右边按钮类型  0: voice 1: delete
    private int centerCustomViewRes;                    // 中间自定义布局资源

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    public CommonTitleBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        loadAttributes(context, attrs);
        initGlobalViews(context);
        initMainViews(context);
    }

    private void loadAttributes(Context context, AttributeSet attrs) {

    }

    private void initGlobalViews(Context context) {

    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    private void initMainViews(Context context) {

    }

    @Override
    public void onClick(View v) {

    }

    public View getViewStatusBarFill() {
        return viewStatusBarFill;
    }

    public void setViewStatusBarFill(View viewStatusBarFill) {
        this.viewStatusBarFill = viewStatusBarFill;
    }

    public View getViewBottomLine() {
        return viewBottomLine;
    }

    public void setViewBottomLine(View viewBottomLine) {
        this.viewBottomLine = viewBottomLine;
    }

    public View getViewBottomShadow() {
        return viewBottomShadow;
    }

    public void setViewBottomShadow(View viewBottomShadow) {
        this.viewBottomShadow = viewBottomShadow;
    }

    public RelativeLayout getRlMain() {
        return rlMain;
    }

    public void setRlMain(RelativeLayout rlMain) {
        this.rlMain = rlMain;
    }

    public TextView getTvLeft() {
        return tvLeft;
    }

    public void setTvLeft(TextView tvLeft) {
        this.tvLeft = tvLeft;
    }

    public ImageButton getBtnLeft() {
        return btnLeft;
    }

    public void setBtnLeft(ImageButton btnLeft) {
        this.btnLeft = btnLeft;
    }

    public View getViewCustomLeft() {
        return viewCustomLeft;
    }

    public void setViewCustomLeft(View viewCustomLeft) {
        this.viewCustomLeft = viewCustomLeft;
    }

    public TextView getTvRight() {
        return tvRight;
    }

    public void setTvRight(TextView tvRight) {
        this.tvRight = tvRight;
    }

    public ImageButton getBtnRight() {
        return btnRight;
    }

    public void setBtnRight(ImageButton btnRight) {
        this.btnRight = btnRight;
    }

    public View getViewCustomRight() {
        return viewCustomRight;
    }

    public void setViewCustomRight(View viewCustomRight) {
        this.viewCustomRight = viewCustomRight;
    }

    public LinearLayout getLlMainCenter() {
        return llMainCenter;
    }

    public void setLlMainCenter(LinearLayout llMainCenter) {
        this.llMainCenter = llMainCenter;
    }

    public TextView getTvCenter() {
        return tvCenter;
    }

    public void setTvCenter(TextView tvCenter) {
        this.tvCenter = tvCenter;
    }

    public TextView getTvCenterSub() {
        return tvCenterSub;
    }

    public void setTvCenterSub(TextView tvCenterSub) {
        this.tvCenterSub = tvCenterSub;
    }

    public ProgressBar getProgressCenter() {
        return progressCenter;
    }

    public void setProgressCenter(ProgressBar progressCenter) {
        this.progressCenter = progressCenter;
    }

    public RelativeLayout getRlMainCenterSearch() {
        return rlMainCenterSearch;
    }

    public void setRlMainCenterSearch(RelativeLayout rlMainCenterSearch) {
        this.rlMainCenterSearch = rlMainCenterSearch;
    }

    public EditText getEtSearchHint() {
        return etSearchHint;
    }

    public void setEtSearchHint(EditText etSearchHint) {
        this.etSearchHint = etSearchHint;
    }

    public ImageView getIvSearch() {
        return ivSearch;
    }

    public void setIvSearch(ImageView ivSearch) {
        this.ivSearch = ivSearch;
    }

    public ImageView getIvVoice() {
        return ivVoice;
    }

    public void setIvVoice(ImageView ivVoice) {
        this.ivVoice = ivVoice;
    }

    public View getCenterCustomView() {
        return centerCustomView;
    }

    public void setCenterCustomView(View centerCustomView) {
        this.centerCustomView = centerCustomView;
    }

    public boolean isFillStatusBar() {
        return fillStatusBar;
    }

    public void setFillStatusBar(boolean fillStatusBar) {
        this.fillStatusBar = fillStatusBar;
    }

    public int getTitleBarColor() {
        return titleBarColor;
    }

    public void setTitleBarColor(int titleBarColor) {
        this.titleBarColor = titleBarColor;
    }

    public int getTitleBarHeight() {
        return titleBarHeight;
    }

    public void setTitleBarHeight(int titleBarHeight) {
        this.titleBarHeight = titleBarHeight;
    }

    public int getStatusBarColor() {
        return statusBarColor;
    }

    public void setStatusBarColor(int statusBarColor) {
        this.statusBarColor = statusBarColor;
    }

    public int getStatusBarMode() {
        return statusBarMode;
    }

    public void setStatusBarMode(int statusBarMode) {
        this.statusBarMode = statusBarMode;
    }

    public boolean isShowBottomLine() {
        return showBottomLine;
    }

    public void setShowBottomLine(boolean showBottomLine) {
        this.showBottomLine = showBottomLine;
    }

    public int getBottomLineColor() {
        return bottomLineColor;
    }

    public void setBottomLineColor(int bottomLineColor) {
        this.bottomLineColor = bottomLineColor;
    }

    public float getBottomShadowHeight() {
        return bottomShadowHeight;
    }

    public void setBottomShadowHeight(float bottomShadowHeight) {
        this.bottomShadowHeight = bottomShadowHeight;
    }

    public int getLeftType() {
        return leftType;
    }

    public void setLeftType(int leftType) {
        this.leftType = leftType;
    }

    public String getLeftText() {
        return leftText;
    }

    public void setLeftText(String leftText) {
        this.leftText = leftText;
    }

    public int getLeftTextColor() {
        return leftTextColor;
    }

    public void setLeftTextColor(int leftTextColor) {
        this.leftTextColor = leftTextColor;
    }

    public float getLeftTextSize() {
        return leftTextSize;
    }

    public void setLeftTextSize(float leftTextSize) {
        this.leftTextSize = leftTextSize;
    }

    public int getLeftDrawable() {
        return leftDrawable;
    }

    public void setLeftDrawable(int leftDrawable) {
        this.leftDrawable = leftDrawable;
    }

    public float getLeftDrawablePadding() {
        return leftDrawablePadding;
    }

    public void setLeftDrawablePadding(float leftDrawablePadding) {
        this.leftDrawablePadding = leftDrawablePadding;
    }

    public int getLeftImageResource() {
        return leftImageResource;
    }

    public void setLeftImageResource(int leftImageResource) {
        this.leftImageResource = leftImageResource;
    }

    public int getLeftCustomViewRes() {
        return leftCustomViewRes;
    }

    public void setLeftCustomViewRes(int leftCustomViewRes) {
        this.leftCustomViewRes = leftCustomViewRes;
    }

    public int getLeftBackroundDrawable() {
        return leftBackroundDrawable;
    }

    public void setLeftBackroundDrawable(int leftBackroundDrawable) {
        this.leftBackroundDrawable = leftBackroundDrawable;
    }

    public int getRightType() {
        return rightType;
    }

    public void setRightType(int rightType) {
        this.rightType = rightType;
    }

    public String getRightText() {
        return rightText;
    }

    public void setRightText(String rightText) {
        this.rightText = rightText;
    }

    public int getRightTextColor() {
        return rightTextColor;
    }

    public void setRightTextColor(int rightTextColor) {
        this.rightTextColor = rightTextColor;
    }

    public float getRightTextSize() {
        return rightTextSize;
    }

    public void setRightTextSize(float rightTextSize) {
        this.rightTextSize = rightTextSize;
    }

    public int getRightImageResource() {
        return rightImageResource;
    }

    public void setRightImageResource(int rightImageResource) {
        this.rightImageResource = rightImageResource;
    }

    public int getRightCustomViewRes() {
        return rightCustomViewRes;
    }

    public void setRightCustomViewRes(int rightCustomViewRes) {
        this.rightCustomViewRes = rightCustomViewRes;
    }

    public int getCenterType() {
        return centerType;
    }

    public void setCenterType(int centerType) {
        this.centerType = centerType;
    }

    public String getCenterText() {
        return centerText;
    }

    public void setCenterText(String centerText) {
        this.centerText = centerText;
    }

    public int getCenterTextColor() {
        return centerTextColor;
    }

    public void setCenterTextColor(int centerTextColor) {
        this.centerTextColor = centerTextColor;
    }

    public float getCenterTextSize() {
        return centerTextSize;
    }

    public void setCenterTextSize(float centerTextSize) {
        this.centerTextSize = centerTextSize;
    }

    public boolean isCenterTextMarquee() {
        return centerTextMarquee;
    }

    public void setCenterTextMarquee(boolean centerTextMarquee) {
        this.centerTextMarquee = centerTextMarquee;
    }

    public String getCenterSubText() {
        return centerSubText;
    }

    public void setCenterSubText(String centerSubText) {
        this.centerSubText = centerSubText;
    }

    public int getCenterSubTextColor() {
        return centerSubTextColor;
    }

    public void setCenterSubTextColor(int centerSubTextColor) {
        this.centerSubTextColor = centerSubTextColor;
    }

    public float getCenterSubTextSize() {
        return centerSubTextSize;
    }

    public void setCenterSubTextSize(float centerSubTextSize) {
        this.centerSubTextSize = centerSubTextSize;
    }

    public boolean isCenterSearchEditable() {
        return centerSearchEditable;
    }

    public void setCenterSearchEditable(boolean centerSearchEditable) {
        this.centerSearchEditable = centerSearchEditable;
    }

    public int getCenterSearchBgResource() {
        return centerSearchBgResource;
    }

    public void setCenterSearchBgResource(int centerSearchBgResource) {
        this.centerSearchBgResource = centerSearchBgResource;
    }

    public int getCenterSearchRightType() {
        return centerSearchRightType;
    }

    public void setCenterSearchRightType(int centerSearchRightType) {
        this.centerSearchRightType = centerSearchRightType;
    }

    public int getCenterCustomViewRes() {
        return centerCustomViewRes;
    }

    public void setCenterCustomViewRes(int centerCustomViewRes) {
        this.centerCustomViewRes = centerCustomViewRes;
    }
}
