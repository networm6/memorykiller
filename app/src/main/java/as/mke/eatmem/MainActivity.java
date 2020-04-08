package as.mke.eatmem;


import simon.clearmemory.R;
import android.widget.Toast;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		
        setContentView(R.layout.main);
    }
	public native void native_eatmf();
	//static {
		//System.loadLibrary("hello-jni");	}
	public void doo(View v){
		Toast.makeText(this,"等待5s",10).show();
		native_eatmf();
		v.setClickable(false);
	}
}
