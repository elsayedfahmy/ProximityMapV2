package in.wptrafficanalyzer.proximitymapv2;


import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.LocationManager;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by Jo on 12/4/2016.
 */
public class IntentReceiver extends BroadcastReceiver{

    NotificationManager nmanager;
    static  int id=1;


    //     @SuppressWarnings("deprecation")
    @Override
    public void onReceive(Context context, Intent intent) {

        String key = LocationManager.KEY_PROXIMITY_ENTERING;

        Boolean entering = intent.getBooleanExtra(key, false);

        if (entering) {
            Toast.makeText(context, "LocationReminderReceiver entering", Toast.LENGTH_LONG).show();
            showNotification(context);

            Toast.makeText(context, "Good for you john ", Toast.LENGTH_LONG).show();
            Toast.makeText(context, "go to the next step", Toast.LENGTH_LONG).show();
            Toast.makeText(context, "be happy", Toast.LENGTH_LONG).show();
            Toast.makeText(context, "GOD on you side ", Toast.LENGTH_LONG).show();




            // Log.i("LocationReminderReceiver", "entering");
        } else {
            Toast.makeText(context, " exiting", Toast.LENGTH_SHORT).show();
            Toast.makeText(context, " good luck", Toast.LENGTH_SHORT).show();
            Toast.makeText(context, " you made it", Toast.LENGTH_SHORT).show();
            Toast.makeText(context, " contenue", Toast.LENGTH_SHORT).show();


            // Log.i("LocationReminderReceiver", "exiting");
        }



    }
    private void showNotification(Context context) {

        NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(context)
                        .setContentTitle("My notification")
                        .setContentText("Hello World!");

        mBuilder.setAutoCancel(true);
        NotificationManager mNotificationManager =
                (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        mNotificationManager.notify(id, mBuilder.build());
//id++;
    }




}
