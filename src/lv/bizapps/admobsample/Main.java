package lv.bizapps.admobsample;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

public class Main extends ActionBarActivity {
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        AdView mAdView = (AdView)findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
        									.addTestDevice(AdRequest.DEVICE_ID_EMULATOR)
        									.build();
        mAdView.loadAd(adRequest);
	}
}