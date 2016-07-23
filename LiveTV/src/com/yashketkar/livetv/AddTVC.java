package com.yashketkar.livetv;

import java.util.ArrayList;
import java.util.Collections;

public class AddTVC {

	public static ArrayList<TVC> tvc = new ArrayList<TVC>();

	public static ArrayList<TVC> addTVC() {
		ArrayList<TVC> tvc = new ArrayList<TVC>();

		tvc.add(new TVC(
				"Delhi Aajtak",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD68_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC("B4U Music",
				"http://www.widih.in/thaim3u8/81ff107849124ff389814b0b8816b1ba.m3u8"));

		tvc.add(new TVC(
				"Zing",
				"http://46.249.213.87/iPhone/broadcast/zing-tablet.3gp/zing-tablet.3gp-mr648k.m3u8?trackingid=3171370000&os=desktop"));

		tvc.add(new TVC(
				"Sab TV",
				"http://46.249.213.93/iPhone/broadcast/sonysabtv-tablet.3gp/sonysabtv-tablet.3gp-mr498k.m3u8?trackingid=4271710000&os=desktop"));

		tvc.add(new TVC(
				"Movies OK",
				"http://46.249.213.87/iPhone/broadcast/bollywoodmovies-tablet.3gp.m3u8?trackingid=3310010000&amp;os=desktop"));

		tvc.add(new TVC("Zee Premier",
				"http://yupptvrtmp-lh.akamaihd.net/i/nwk5_zeepremier@180466/master.m3u8"));

		tvc.add(new TVC("Zee Action",
				"http://yupptvrtmp-lh.akamaihd.net/i/nwk5_zeeaction@180466/master.m3u8"));

		tvc.add(new TVC("UTV Action",
				"http://live-ak2.liverelay.com/UTVAction/01.m3u8"));

		tvc.add(new TVC("Bindaas TV",
				"http://yupptvrtmp-lh.akamaihd.net/i/nwk_zeetelpacific@180285/master.m3u8"));

		tvc.add(new TVC("Sakshi TV",
				"http://ndtv.live.cdn.bitgravity.com/ndtv/live/saakshi512"));

		tvc.add(new TVC(
				"Zee Cafe",
				"http://46.249.213.93/iPhone/broadcast/zeecafe-tablet.3gp/zeecafe-tablet.3gp-mr648k.m3u8?trackingid=4441370000&os=desktop"));

		tvc.add(new TVC("Ten Sports",
				"http://streamer37.eboundservices.com:1935/tv/tensports/playlist.m3u8"));

		tvc.add(new TVC(
				"Times Now",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD96_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC(
				"Aaj Tak News",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD77_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC(
				"DD National",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD99_W_250.sdp/hasbahca.m3u8"));

		tvc.add(new TVC(
				"Topper",
				"http://yupptvrtmp-lh.akamaihd.net/i/mbr2_channel1@180552/master.m3u8?hdnea=st=1401214408~exp=1401218008~acl=/*~data=topper_India~hmac=6ef9ac10052e653699686ef60c6d3b1324fcba7e742db536e1e9230822213416"));

		tvc.add(new TVC(
				"Zoom",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD160_W_250.sdp/manifest.m3u8"));

		tvc.add(new TVC(
				"ET NOW",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD97_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC(
				"E24",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD83_W_250.sdp/manifest.m3u8"));

		tvc.add(new TVC(
				"Sahara Filmy",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD66_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC(
				"Sahara One",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD67_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC(
				"Headlines Today",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD72_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC(
				"9X Jhakaas",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD81_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC("France 24",
				"http://hd7.lsops.net/live/france24_en_hls.smil/playlist.m3u8"));

		tvc.add(new TVC("Euro News",
				"http://livestation_hls-lh.akamaihd.net/i/euronews_en@107240/master.m3u8"));

		tvc.add(new TVC("Sky News",
				"http://hd2.lsops.net/live/skynewsi_en_hls.smil/playlist.m3u8"));

		tvc.add(new TVC("ABP News (Hindi)",
				"http://hindiabp-lh.akamaihd.net/i/hindiabp1new_1@192103/master.m3u8"));

		tvc.add(new TVC("NDTV 24x7",
				"http://ndtv.indostan.epac.to/ndtv/247lo/live/native"));

		tvc.add(new TVC("NDTV GoodTimes",
				"http://bglive-a.bitgravity.com/ndtv/prohi/live/native"));

		tvc.add(new TVC("NDTV India (Hindi)",
				"http://ndtv.indostan.epac.to/ndtv/indlo/live/native"));

		tvc.add(new TVC("NDTV Prime",
				"http://bglive-a.bitgravity.com/ndtv/prolo/live/native"));

		tvc.add(new TVC(
				"Bloomberg India",
				"rtsp://bloomtv.live-s.cdn.bitgravity.com/cdn-live/_definst_/bloomtv/live/feed01?nc=1"));

		tvc.add(new TVC("Bloomberg USA",
				"http://btv-i.akamaihd.net/hls/live/202760/btvusa_ios/P1/M240.m3u8"));

		tvc.add(new TVC("DD News",
				"http://164.100.49.24:8080/hls-live/livepkgr/_definst_/ddnewslive.m3u8"));

		tvc.add(new TVC("Loksabha TV",
				"http://164.100.49.24:8080/hls-live/livepkgr/_definst_/lstvlive.m3u8"));

		tvc.add(new TVC(
				"Home Shop 18",
				"http://web18.live-s.cdn.bitgravity.com/cdn-live/_definst_/web18/live/secure/viacom_colors.smil/playlist.m3u8?e=1402209286&h=f1da24d7bdcc59bcee95c74438ce6dfa&bgsecuredir=1&play-only=primary&jwstreamtype=hls"));

		tvc.add(new TVC(
				"Al Jazeera",
				"http://vizrthlsaje-i.akamaihd.net/hls/live/206524/AJEnglish/2873287_iOS/master.m3u8"));

		tvc.add(new TVC(
				"CNBC Bazaar (Gujrati)",
				"http://cnbc_gujrati_hls-lh.akamaihd.net/i/cnbc_gujrati_hls_n_1@178933/master.m3u8?hdnea=st=1401237792~exp=1402101792~acl=/*~hmac=59b952a37e76e7066c2ef2d576033aeff3326b62010dd780d3d1f1f67b6cbce5#view"));

		tvc.add(new TVC(
				"Associated Press",
				"http://streamworks-apple-live.adaptive.level3.net/apple/streamworks/channel1/aptn_iphone.m3u8"));

		tvc.add(new TVC(
				"Twit",
				"http://iphone-streaming.ustream.tv/ustreamVideo/1524/streams/live/playlist.m3u8"));

		tvc.add(new TVC("NASA TV",
				"http://www.nasa.gov/multimedia/nasatv/NTV-Public-IPS.m3u8"));

		tvc.add(new TVC("Red Bull TV",
				"http://live.iphone.redbull.de.edgesuite.net/iphone.m3u8"));

		tvc.add(new TVC("Trace Sports",
				"http://46.249.213.87/iPhone/broadcast/tracetvsports-tablet.3gp.m3u8"));

		tvc.add(new TVC("NHK World HD",
				"http://plslive-w.nhk.or.jp/nhkworld/app/live.m3u8"));

		tvc.add(new TVC("Trace Urban",
				"http://46.249.213.87/iPhone/broadcast/tracetvurban-tablet.3gp.m3u8"));

		tvc.add(new TVC("Clubbing TV",
				"http://46.249.213.87/iPhone/broadcast/clubbingtv-tablet.3gp.m3u8"));

		tvc.add(new TVC("4Music TV",
				"http://46.249.213.87/iPhone/broadcast/4-tablet.3gp.m3u8"));

		tvc.add(new TVC("Brit Asia TV",
				"http://46.249.213.87/iPhone/broadcast/britasia-tablet.3gp.m3u8"));

		tvc.add(new TVC("NoiseVox TV",
				"http://46.249.213.87/iPhone/broadcast/noisevox-tablet.3gp.m3u8"));

		tvc.add(new TVC("Ibiza TV",
				"http://46.249.213.87/iPhone/broadcast/ibizaontv-tablet.3gp.m3u8"));

		tvc.add(new TVC("Automotive TV",
				"http://46.249.213.87/iPhone/broadcast/automotivetv-tablet.3gp.m3u8"));

		tvc.add(new TVC("Green TV Comedy",
				"http://46.249.213.87/iPhone/broadcast/comedy-tablet.3gp.m3u8"));

		tvc.add(new TVC("Rouge TV (French)",
				"http://rtmp.infomaniak.ch/livecast/rougetv/playlist.m3u8"));

		tvc.add(new TVC(
				"Bonita Springs BTV 98",
				"http://streaming.cityofbonitasprings.org/btvlive.isml/Manifest(format=m3u8-aapl).m3u8"));

		tvc.add(new TVC("NRB TV", "http://ilive.liberty.edu/wtlu/ios.m3u8"));

		tvc.add(new TVC("Outdoor Channel",
				"rtmp://lm02.everyon.tv:1935/ptv2/pld613"));

		tvc.add(new TVC("Capital TV",
				"http://cdn-sov-2.musicradio.com/LiveVideo/Capital/playlist.m3u8"));

		tvc.add(new TVC("VEVO 1",
				"http://vevoplaylist-live.hls.adaptive.level3.net/vevo/ch1/06/prog_index.m3u8"));

		tvc.add(new TVC("VEVO 2",
				"http://vevoplaylist-live.hls.adaptive.level3.net/vevo/ch2/06/prog_index.m3u8"));

		tvc.add(new TVC("VEVO 3",
				"http://vevoplaylist-live.hls.adaptive.level3.net/vevo/ch3/06/prog_index.m3u8"));

		tvc.add(new TVC("News X",
				"http://live-ak2.liverelay.com/NewsX/index.m3u8"));

		tvc.add(new TVC("DeeJay TV (Italian)",
				"http://flv.kataweb.it/hls/deejaytv/deejaytv.m3u8"));

		tvc.add(new TVC("Sky TG24 (Italian)",
				"http://iphone.live.sky.it/jen2011/jen2011_Layer1.m3u8"));

		tvc.add(new TVC("Alhurra TV (Arabic)",
				"rtmp://cp51007.live.edgefcs.net/live/Alhurra_Flash@15"));

		tvc.add(new TVC(
				"Animal Planet",
				"http://iphone-streaming.ustream.tv/uhls/12762028/streams/live/iphone/hasbahca.m3u8"));

		tvc.add(new TVC("City of Boston TV",
				"rtmp://streaming.cityofboston.gov/live/cable"));

		tvc.add(new TVC("C-SPAN 1 TV",
				"rtmp://cp82346.live.edgefcs.net/live/CSPAN1@14845"));

		tvc.add(new TVC("C-SPAN 2 TV",
				"rtmp://cp82347.live.edgefcs.net/live/CSPAN2@14846"));

		tvc.add(new TVC("HSN TV",
				"rtsp://hsn.mpl.miisolutions.net:1935/hsn-live01/_definst_/mp4:420p500kB31"));

		tvc.add(new TVC("Mission TV",
				"rtmp://streamer1.streamhost.org/salive/GMImissiontvh"));

		tvc.add(new TVC(
				"News 12 Long Island",
				"rtmp://fs-b4e3010000000000.id.cdn.cv.net/vxedge/fs-b4e3010000000000/fs-b4e3010000000000"));

		tvc.add(new TVC(
				"News 12 Bronx",
				"rtmp://fs-b5e3010000000000.id.cdn.cv.net/vxedge/fs-b5e3010000000000/fs-b5e3010000000000"));

		tvc.add(new TVC(
				"News 12 Bronx Weather",
				"rtmp://fs-afe3010000000000.id.cdn.cv.net/vxedge/fs-afe3010000000000/fs-afe3010000000000"));

		tvc.add(new TVC(
				"News 12 Brooklyn",
				"rtmp://fs-ace3010000000000.id.cdn.cv.net/vxedge/fs-ace3010000000000/fs-ace3010000000000"));

		tvc.add(new TVC(
				"News 12 Brooklyn Weather",
				"rtmp://fs-afe3010000000000.id.cdn.cv.net/vxedge/fs-afe3010000000000/fs-afe3010000000000"));

		tvc.add(new TVC(
				"News 12 Connecticut Weather",
				"rtmp://fs-b6e3010000000000.id.cdn.cv.net/vxedge/fs-b6e3010000000000/fs-b6e3010000000000"));

		tvc.add(new TVC(
				"BBC Two",
				"mms://rmv8.bbc.net.uk/news/olmedia/n5ctrl/tvseq/od/bbc2/bb/wm/video/daily_pol_bb.wmv"));

		tvc.add(new TVC("CBN TV", "mmsh://live1.cbn.org/iptv1"));

		tvc.add(new TVC("Denver 8 TV", "mms://207.7.154.96/G0080_002?wmcache=0"));

		tvc.add(new TVC("ENT.BAY TV CONCERT",
				"rtmp://planetaonline.cdnvideo.ru/rr/channel_2"));

		tvc.add(new TVC("Florida Coral Gables TV",
				"mms://207.7.154.95/G0937_002?wmcache=0"));

		tvc.add(new TVC("Florida-MiamiCh77TV",
				"mms://207.7.154.95/G0400_002?wmcache=0"));

		tvc.add(new TVC("Georgia-ETCTV3", "mms://66.44.210.13/test"));

		tvc.add(new TVC("HEART TV",
				"rtmp://cdn-sov-2.musicradio.com:80/LiveVideo/Heart"));

		tvc.add(new TVC("Jewish News One TV",
				"rtmp://jn1livefs.fplive.net/jn1live-live/stream001ENG"));

		tvc.add(new TVC("Loveworld TV",
				"rtmp://81.145.152.250/live/loveworldtvlive"));

		tvc.add(new TVC("Pentagon Channel",
				"rtmp://cp114761.live.edgefcs.net:443/live/tpc-live_1@44263"));

		tvc.add(new TVC("QVC TV UK",
				"rtmp://cp79650.live.edgefcs.net/live/QVCLive1@14308"));

		tvc.add(new TVC(
				"Revelation TV",
				"rtmp://revelationtv.fms6.visionip.tv/live/b2b-revelation_tv-revelation_tv-live-25f-16x9_3?USER=Revelation_TV"));

		tvc.add(new TVC("Bursa Sport",
				"http://stream.yayindayiz.biz/Bursaspor/bursaspor/playlist.m3u8"));

		tvc.add(new TVC(
				"Emmanuel TV",
				"http://emmanueltv-f.akamaihd.net/emmanueltv_hdlive_250@81880?apid=266500&v=2.11.2&fp=WIN%2013,0,0,214&r=FOHKR&g=PWJFKHQSSOFT"));

		tvc.add(new TVC("ABP Majha (Marathi)",
				"http://mediacontent-lh.akamaihd.net/i/marathiabpnew_1@188093/master.m3u8"));

		tvc.add(new TVC(
				"Makkah Live",
				"http://iphone-streaming.ustream.tv/ustreamVideo/17904315streams/live/playlist.m3u8"));

		tvc.add(new TVC(
				"IBN 7",
				"http://ibn7_hls-lh.akamaihd.net/i/ibn7_hls_n_1@174951/index_3_av-b.m3u8?sd=10&rebase=on"));

		tvc.add(new TVC(
				"CNN IBN",
				"http://cnn_ibn_hls-lh.akamaihd.net/i/cnn_ibn_hls_n_1@174950/index_1_av-p.m3u8?sd=10&rebase=on"));

		tvc.add(new TVC(
				"IBN Lokmat (Marathi)",
				"http://ibn_lokmat_hls-lh.akamaihd.net/i/ibn_lokmat_hls_n_1@178974/index_1_av-p.m3u8?sd=10&rebase=on"));

		tvc.add(new TVC(
				"Cartoon Network",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD28_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC(
				"POGO TV",
				"http://d1vfuy3zwrxiut.cloudfront.net/live/_definst_/sweetbcha1novD29_W_250.sdp/playlist.m3u8"));

		tvc.add(new TVC(
				"AM Sports (Argentina)",
				"http://iphone-streaming.ustream.tv/uhls/11602466/streams/live/iphone/playlist.m3u8"));

		tvc.add(new TVC("ISKCON Vrindavan",
				"http://cdn.eswebcast.com:1935/iscon/iscon_160p/playlist.m3u8"));

		tvc.add(new TVC("India TV News",
				"http://indiatv.live.cdn.bitgravity.com/indiatv/live/feed001"));

		tvc.add(new TVC(
				"!FIFA WORLD CUP 2014!",
				"http://110751-f.akamaihd.net/ajswebch309_1_2400@s12996?primaryToken=2072942531_6cdf0cab90e85e5dc50fd29258709ea1&v=3.4.0&fp=WIN%2014,0,0,125&r=CISXO&g=UOASUSAPNWEK"));

		Collections.sort(tvc, new TVCComparator());
		return tvc;
	}
}