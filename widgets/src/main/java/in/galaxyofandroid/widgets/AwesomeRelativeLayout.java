package in.galaxyofandroid.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.RelativeLayout;

/**
 * Created by Md Farhan Raja on 2/14/2017.
 */

public class AwesomeRelativeLayout extends RelativeLayout
{
    private TypedArray array;
    private int color;
    private int cornerRadius;
    private int borderColor;
    private int borderWidth;
    private boolean borderEnable;
    private GradientDrawable drawable;

    public AwesomeRelativeLayout(Context context)
    {
        super(context);
    }

    public AwesomeRelativeLayout(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context,attrs);
    }

    public AwesomeRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    public AwesomeRelativeLayout(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }

    private void init(Context context,AttributeSet attributeSet)
    {
        array=context.obtainStyledAttributes(attributeSet,R.styleable.AwesomeRelativeLayout);
        color=array.getColor(R.styleable.AwesomeRelativeLayout_arl_backgroundColor,getResources().getColor(R.color.colorDefault));
        cornerRadius=array.getInt(R.styleable.AwesomeRelativeLayout_arl_cornerRadius,0);

        borderColor=array.getColor(R.styleable.AwesomeRelativeLayout_arl_borderColor,getResources().getColor(R.color.bodColor));
        borderWidth=array.getInt(R.styleable.AwesomeRelativeLayout_arl_borderWidth,4);
        borderEnable=array.getBoolean(R.styleable.AwesomeRelativeLayout_arl_borderEnable,false);

        drawable=new GradientDrawable();
        drawable.setCornerRadius(cornerRadius);
        drawable.setColor(color);
        if(borderEnable)
        {
            drawable.setStroke(borderWidth,borderColor);
        }
        setBackground(drawable);
    }

    public void setBackgroundColor(String colorcode)
    {
        drawable.setColor(Color.parseColor("#"+colorcode));
        setBackground(drawable);
    }
}
