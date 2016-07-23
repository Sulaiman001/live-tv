package com.yashketkar.livetv;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import io.vov.vitamio.LibsChecker;
import io.vov.vitamio.MediaPlayer;
import io.vov.vitamio.widget.MediaController;
import io.vov.vitamio.widget.VideoView;

public class MediaPlayerActivity extends Activity {

	private AdView adView;
	String httpLiveUrl;
	ProgressDialog pDialog;
	VideoView videoView;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		if (!LibsChecker.checkVitamioLibs(this))
			return;

		setContentView(R.layout.media_player);
		hideUI();

		adView = (AdView) MediaPlayerActivity.this.findViewById(R.id.adView2);
		AdRequest adRequest = new AdRequest.Builder().build();
		adView.loadAd(adRequest);

		// Create a progressbar
		pDialog = new ProgressDialog(MediaPlayerActivity.this);
		// Set progressbar title
		pDialog.setTitle("Loading Video");
		// Set progressbar message
		pDialog.setMessage("Buffering...");
		pDialog.setIndeterminate(false);
		pDialog.setCancelable(false);
		// Show progressbar
		pDialog.show();

		Intent intent = getIntent();
		httpLiveUrl = intent.getStringExtra("EXTRA_URL");
		videoView = (VideoView) findViewById(R.id.VideoView);
		MediaController vidControl = new MediaController(this);
		vidControl.setAnchorView(videoView);
		videoView.setMediaController(vidControl);
		Uri vidUri = Uri.parse(httpLiveUrl);
		videoView.setVideoURI(vidUri);
		videoView.start();
		videoView.requestFocus();
		videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
			// Close the progress bar and play the video
			public void onPrepared(MediaPlayer mp) {
				pDialog.dismiss();
				videoView.start();
			}
		});
		videoView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
			// Close the progress bar and play the video
			public boolean onError(MediaPlayer mp, int x, int y) {
				// if (y == MediaPlayer.MEDIA_ERROR_UNSUPPORTED) {
				pDialog.dismiss();
				// }
				return false;
			}
		});
	}

	@Override
	public void onResume() {
		super.onResume(); // Always call the superclass method first
	}

	@SuppressLint("NewApi")
	public void hideUI() {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
			getWindow().getDecorView().setSystemUiVisibility(
					View.SYSTEM_UI_FLAG_LAYOUT_STABLE
							| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
							| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
							| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
							| View.SYSTEM_UI_FLAG_FULLSCREEN
							| View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);

			getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(
					new View.OnSystemUiVisibilityChangeListener() {
						@Override
						public void onSystemUiVisibilityChange(int visibility) {
							if ((visibility & View.SYSTEM_UI_FLAG_FULLSCREEN) == 0) {
								// set immersive mode sticky
							}
						}
					});
		}
	}

}