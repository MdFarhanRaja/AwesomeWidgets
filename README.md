# AwesomeWidgets
Fully Customized Widgets Pack

Step 1. Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency

	dependencies {
	        compile 'com.github.MdFarhanRaja:AwesomeWidgets:1.5'
	}

For AwesomeTextView
![tv](https://cloud.githubusercontent.com/assets/18304656/23031248/4c9b1058-f496-11e6-9ed6-002d6acbd621.PNG)


	<in.galaxyofandroid.widgets.AwesomeTextView
            android:padding="10dp"
            app:atv_borderColor="@color/colorPrimaryDark"
            app:atv_borderEnable="true"
            app:atv_cornerRadius="40"
            app:atv_backgroundColor="#cacaca"
            app:atv_borderWidth="5"
            app:atv_fontPath="roboto.ttf" //Your External Font Path
            android:gravity="center"
            android:text="Md Farhan Raja"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content" />
	    
For AwesomeEditText
![et](https://cloud.githubusercontent.com/assets/18304656/23031291/75359c40-f496-11e6-972c-5e6c151fc153.PNG)


    <in.galaxyofandroid.widgets.AwesomeEditText
        android:padding="10dp"
        android:hint="Awesome EditText"
        app:aet_borderEnable="true"
        app:aet_backgroundColor="#ffffff"
        app:aet_borderColor="@color/colorAccent"
        app:aet_borderWidth="2"
        app:aet_cornerRadius="10"
        app:aet_fontPath="roboto.ttf"
        android:layout_marginTop="10dp"
        android:layout_width="match_parent"
        android:layout_height="40dp" />
	
For AwesomeRelativeLayout
![rl](https://cloud.githubusercontent.com/assets/18304656/23031322/95e01eb6-f496-11e6-8b00-d4fc6e608fc5.PNG)


    <in.galaxyofandroid.widgets.AwesomeRelativeLayout
        android:layout_marginTop="20dp"
        app:arl_backgroundColor="#ffffff"
        app:arl_cornerRadius="200"
        app:arl_borderEnable="true"
        app:arl_borderColor="@color/colorAccent"
        app:arl_borderWidth="5"
        android:layout_width="70dp"
        android:layout_height="70dp">
        
        <ImageView
            android:src="@drawable/ic_ayurveda"
            android:layout_centerInParent="true"
            android:layout_width="40dp"
            android:layout_height="40dp" />
        
    </in.galaxyofandroid.widgets.AwesomeRelativeLayout>

For AwesomeRippleView
![ezgif com-crop](https://cloud.githubusercontent.com/assets/18304656/23032158/93c499ec-f499-11e6-8919-27096a1ad7b3.gif)

    <in.galaxyofandroid.widgets.AwesomeRippleView
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:arv_centered="true"
        app:arv_color="@color/colorPrimary"
        app:arv_type="doubleRipple"
        app:arv_zoom="true">

        <in.galaxyofandroid.widgets.AwesomeTextView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:gravity="center"
            android:padding="10dp"
            android:text="Md Farhan Raja"
            app:atv_backgroundColor="#cacaca"
            app:atv_borderColor="@color/colorPrimaryDark"
            app:atv_borderEnable="true"
            app:atv_borderWidth="5"
            app:atv_cornerRadius="40"/>

    </in.galaxyofandroid.widgets.AwesomeRippleView>


    <in.galaxyofandroid.widgets.AwesomeRippleView
        android:layout_marginTop="20dp"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        app:arv_color="@color/colorPrimary"
        app:arv_type="simpleRipple">

        <in.galaxyofandroid.widgets.AwesomeRelativeLayout
            android:layout_width="70dp"
            android:layout_height="70dp"
            app:arl_backgroundColor="#ffffff"
            app:arl_borderColor="@color/colorAccent"
            app:arl_borderEnable="true"
            app:arl_borderWidth="5"
            app:arl_cornerRadius="200">

            <ImageView
                android:layout_width="40dp"
                android:layout_height="40dp"
                android:layout_centerInParent="true"
                android:src="@drawable/ic_ayurveda" />

        </in.galaxyofandroid.widgets.AwesomeRelativeLayout>
    </in.galaxyofandroid.widgets.AwesomeRippleView>
    
Some Extra Attributes of AwesomeRippleView

	 <attr name="rv_alpha" format="integer" />
        <attr name="rv_framerate" format="integer"/>
        <attr name="rv_rippleDuration" format="integer"/>
        <attr name="rv_zoomDuration" format="integer" />
        <attr name="rv_color" format="color" />
        <attr name="rv_centered" format="boolean" />
        <attr name="rv_type" format="enum">
            <enum name="simpleRipple" value="0"/>
            <enum name="doubleRipple" value="1"/>
            <enum name="rectangle" value="2" />
        </attr>
        <attr name="rv_ripplePadding" format="dimension" />
        <attr name="rv_zoom" format="boolean" />
        <attr name="rv_zoomScale" format="float" />

