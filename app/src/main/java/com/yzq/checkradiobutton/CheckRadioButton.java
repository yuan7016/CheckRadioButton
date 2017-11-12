package com.yzq.checkradiobutton;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/**
 * Created by yzq on 2017/11/11<p/> .
 * this radioButton can cancel checked state like {@link android.widget.CheckBox}
 */
public class CheckRadioButton extends CompoundButton {
    public CheckRadioButton(Context context) {
        this(context,null);
    }

    public CheckRadioButton(Context context, AttributeSet attrs) {
        this(context, attrs,android.R.attr.radioButtonStyle);
    }

    public CheckRadioButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    public void toggle() {
        // we override to prevent toggle when the radio is checked
        super.toggle();
    }
}
