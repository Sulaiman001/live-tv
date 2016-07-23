package com.yashketkar.livetv;

import java.util.ArrayList;

import com.google.android.gms.ads.*;

import android.app.AlertDialog;
import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {
	private InterstitialAd interstitial;
	private AdView adView;
	private ListView mlistview;
	public TVChannelCustomAdapter TVChannelAdapter;
	public ArrayList<TVC> tvc;

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button = (Button) findViewById(R.id.buttonplay);
		button.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				AlertDialog.Builder alert1 = new AlertDialog.Builder(
						MainActivity.this);
				alert1.setTitle("Enter the URL:");
				// alert1.setMessage("Enter the message");
				final EditText input1 = new EditText(MainActivity.this);
				input1.setSingleLine();
				ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
				if (clipboard.hasPrimaryClip()) {
					clipboard.getPrimaryClip();
					ClipData.Item item = clipboard.getPrimaryClip()
							.getItemAt(0);
					input1.setText(item.getText());
					Toast.makeText(MainActivity.this,
							"Auto-paste from clipboard.", Toast.LENGTH_SHORT)
							.show();
				} else {
					input1.setText("");
				}
				alert1.setView(input1);
				alert1.setPositiveButton("OK",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int whichButton) {
								String value = input1.getText().toString()
										.replaceAll("[\\t\\n\\r]", "");

								displayInterstitial();

								Intent intent = new Intent(MainActivity.this,
										MediaPlayerActivity.class);
								intent.putExtra("EXTRA_URL", value);
								startActivity(intent);

							}
						});
				alert1.setNegativeButton("Cancel",
						new DialogInterface.OnClickListener() {
							public void onClick(DialogInterface dialog,
									int whichButton) {
								// Canceled.
							}
						});
				alert1.show();
			}
		});

		mlistview = (ListView) findViewById(R.id.mlistview);
		tvc = AddTVC.addTVC();
		TVChannelAdapter = new TVChannelCustomAdapter(MainActivity.this,
				MainActivity.this, R.layout.row, tvc);
		TVChannelAdapter.setNotifyOnChange(true);
		mlistview.setAdapter(TVChannelAdapter);
		mlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				ClipboardManager clipboard = (ClipboardManager) getSystemService(Context.CLIPBOARD_SERVICE);
				ClipData clip = ClipData.newPlainText("Channel Name",
						tvc.get(position).path);
				clipboard.setPrimaryClip(clip);
				Toast.makeText(MainActivity.this, "Copied to clipboard.",
						Toast.LENGTH_SHORT).show();
			}
		});

		adView = (AdView) this.findViewById(R.id.adView1);
		AdRequest adRequest1 = new AdRequest.Builder().build();
		adView.loadAd(adRequest1);

		interstitial = new InterstitialAd(this);
		interstitial.setAdUnitId("ca-app-pub-2265268935639337/5198257009");
		AdRequest adRequest2 = new AdRequest.Builder().build();
		interstitial.loadAd(adRequest2);
	}

	public void displayInterstitial() {
		if (interstitial.isLoaded()) {
			interstitial.show();
		}
	}
}
