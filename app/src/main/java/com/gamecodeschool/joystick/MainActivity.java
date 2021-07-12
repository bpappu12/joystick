package com.gamecodeschool.joystick;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements JoystickView.JoystickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        JoystickView joystick= new JoystickView(this);
        setContentView(joystick);
    }

    public void onJoystickMoved(float xCoordinate, float yCoordinate, int id)
    {
        Log.d("Main Method","X Coordinate: " + xCoordinate + "Y Coordinate: " + yCoordinate);
        if(xCoordinate > 0 && yCoordinate > 0)
        {
            double angle;
            angle = (Math.atan(yCoordinate/xCoordinate)) * (180/Math.PI);
            Log.d("Main Method", "Angle: " + angle);
        }
        if (xCoordinate < 0 && yCoordinate > 0 )
        {
            double angle;
            angle = (Math.atan(yCoordinate/xCoordinate)) * (180/Math.PI) + 180;
            Log.d("Main Method", "Angle: " + angle);
        }
        if (xCoordinate < 0 && yCoordinate < 0 )
        {
            double angle;
            angle = (Math.atan(yCoordinate/xCoordinate)) * (180/Math.PI) + 180;
            Log.d("Main Method", "Angle: " + angle);
        }

        if (xCoordinate > 0 && yCoordinate < 0 )
        {
            double angle;
            angle = (Math.atan(yCoordinate/xCoordinate)) * (180/Math.PI) + 360;
            Log.d("Main Method", "Angle: " + angle);
        }

    }
}