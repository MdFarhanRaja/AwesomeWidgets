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

	    
