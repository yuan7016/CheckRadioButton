# CheckRadioButton
可以取消选中状态的radioButton
```
  @Override
    public void toggle() {
        // we override to prevent toggle when the radio is checked
        super.toggle();
    }
```
<br>
![](https://github.com/yuan7016/CheckRadioButton/blob/master/raw/Screenrecorder-2017-11-12-15-57-09-828.gif)
<br>
#####主要改变原来RadioButton中toggle()方法,其他都不变.在类CheckRadioButton.class中查看<br>
```
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
```
