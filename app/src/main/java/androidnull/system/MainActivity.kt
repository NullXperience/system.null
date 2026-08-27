package androidnull.system
import android.app.Activity
import android.os.Bundle
import android.widget.Toast
class MainActivity : Activity()
{
    public override fun onCreate(bundle: Bundle?)
    {
        super.onCreate(bundle)
        val stringExtra = intent.getStringExtra("null");
        if(stringExtra == null) finish();
        Toast.makeText(this, stringExtra, Toast.LENGTH_SHORT).show();
        finish();
    }
}
