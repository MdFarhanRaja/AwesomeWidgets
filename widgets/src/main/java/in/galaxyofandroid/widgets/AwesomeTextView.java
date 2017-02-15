package in.galaxyofandroid.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Md Farhan Raja on 2/14/2017.
 */

public class AwesomeTextView extends TextView
{
    private TypedArray array;
    private int color;
    private int cornerRadius;
    private int borderColor;
    private int borderWidth;
    private boolean borderEnable;
    private String path;
    private GradientDrawable drawable;

    public AwesomeTextView(Context context)
    {
        super(context);
    }

    public AwesomeTextView(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init(context,attrs);
    }

    public AwesomeTextView(Context context, AttributeSet attrs, int defStyleAttr)
    {
        super(context, attrs, defStyleAttr);
        init(context,attrs);
    }

    public AwesomeTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes)
    {
        super(context, attrs, defStyleAttr, defStyleRes);
        init(context,attrs);
    }

    private void init(Context context,AttributeSet attributeSet)
    {
        array=context.obtainStyledAttributes(attributeSet,R.styleable.AwesomeTextView);
        color=array.getColor(R.styleable.AwesomeTextView_atv_backgroundColor,getResources().getColor(R.color.colorDefault));
        cornerRadius=array.getInt(R.styleable.AwesomeTextView_atv_cornerRadius,0);

        borderColor=array.getColor(R.styleable.AwesomeTextView_atv_borderColor,getResources().getColor(R.color.bodColor));
        borderWidth=array.getInt(R.styleable.AwesomeTextView_atv_borderWidth,4);
        borderEnable=array.getBoolean(R.styleable.AwesomeTextView_atv_borderEnable,false);

        path=array.getString(R.styleable.AwesomeTextView_atv_fontPath);
        drawable=new GradientDrawable();
        drawable.setCornerRadius(cornerRadius);
        drawable.setColor(color);
        if(borderEnable)
        {
            drawable.setStroke(borderWidth,borderColor);
        }
        setBackground(drawable);
        if(path!=null)
        {
            if(!isInEditMode())
            {
                Typeface t=Typeface.createFromAsset(context.getAssets(),path);
                setTypeface(t);
            }
        }else
        {
            if(!isInEditMode())
            {
                setTypeface(Typeface.DEFAULT);
            }
        }
    }

    public void setBackgroundColor(String colorcode)
    {
        drawable.setColor(Color.parseColor("#"+colorcode));
        setBackground(drawable);
    }
}
