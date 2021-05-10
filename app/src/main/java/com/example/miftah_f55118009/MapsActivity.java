package com.example.miftah_f55118009;
import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng awal = new LatLng(-0.8448035793664394, 119.89134125614534);
        mMap.addMarker(new MarkerOptions().position(awal).title("Saya berada Di Warung"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(awal));

        LatLng spbu = new LatLng(-0.8479869745370163, 119.89141657672009);
        mMap.addMarker(new MarkerOptions().position(spbu).title("SPBU Soekarno Hatta"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(spbu));


        mMap.addPolyline(new PolylineOptions().add(
                awal,
                new LatLng(-0.8448035793664394, 119.89134125614534),
                new LatLng(-0.8455074604104221, 119.89152666062505),
                new LatLng(-0.8481260126625059, 119.89186560318748),
                new LatLng(-0.8480941497591838, 119.89139050421552),
                new LatLng(-0.8479869745370163, 119.89141657672009),
                spbu
                ).width(10)
                        .color(Color.GREEN)

        );
    }
}