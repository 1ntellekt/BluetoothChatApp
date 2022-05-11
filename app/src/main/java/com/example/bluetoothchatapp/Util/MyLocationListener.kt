package com.example.bluetoothchatapp.Util

import android.location.Location
import android.location.LocationListener
import com.example.bluetoothchatapp.interfaces.OnLocationListener
import androidx.annotation.NonNull

import android.os.Bundle




class MyLocationListener(private var onLocationListener: OnLocationListener):LocationListener {
    override fun onLocationChanged(location: Location) {
        onLocationListener.onLocationListener(location)
    }

    override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {

    }

    override fun onProviderEnabled(provider: String) {

    }

    override fun onProviderDisabled(provider: String) {

    }

}