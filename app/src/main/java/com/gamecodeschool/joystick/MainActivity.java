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
    }
}